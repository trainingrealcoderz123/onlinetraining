package com.realcoderz.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.realcoderz.businessbean.EmployeeBean;

import util.DbUltility;

public class EmployeeDAOImpl implements EmployeeDAO {

	private static Connection connection=null;
	private static Statement statement=null;
	@Override
	public int insertEmployee(EmployeeBean employeeBean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		try
		{
			int rowsUpdateCount=0;
			int id =employeeBean.getEmployeeId();
			String ename=employeeBean.getEmployeeName();
			String role=employeeBean.getRole();
			Date insertTime=new Date(employeeBean.getInsertTime().getTime());
			double salary=employeeBean.getSalary();

			String insertData="insert into Employee(employeeId,employeeName,role,salary) values"
					+ "("+id+",'"+ename+"','"+role+"',"+salary+")";
			connection=DbUltility.getDbConnection();
			statement=connection.createStatement();
			rowsUpdateCount= statement.executeUpdate(insertData);
			if(rowsUpdateCount>0)
			{
				System.out.println("Employee registered Successfully");
			}else
			{
				System.out.println("OOPS something went wrong we are on process");
			}
			return rowsUpdateCount; 
		}catch(Exception e)
		{
			throw e;
		}
		finally
		{
			DbUltility.getDbConnectionClose();	
		}
	}

	@Override
	public void updateEmployee(EmployeeBean employeeBean)throws ClassNotFoundException,SQLException
	{
		// TODO Auto-generated method stub
		try
		{
			int id=employeeBean.getEmployeeId();
			double modifiedSalary=employeeBean.getSalary();
			String updateData="update employee set salary="+modifiedSalary+"where employeeid="+id;
			connection=DbUltility.getDbConnection();
			statement=connection.createStatement();
			int rowsUpdateCount=statement.executeUpdate(updateData);
			if(rowsUpdateCount>0)
			{
				System.out.println("Employee Updated Sucessfully"+rowsUpdateCount);
			}else
			{
				System.out.println("OOps something went wrong!! we are in a process");
			}

		}catch(Exception e)
		{
			throw e;
		}
		finally
		{
			DbUltility.getDbConnectionClose();
		}
	}

	@Override
	public void readEmployee() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		try
		{
			String retrivedata="Select * from employee";
			connection=DbUltility.getDbConnection();
			statement=connection.createStatement();
			ResultSet resultSet =statement.executeQuery(retrivedata);
			System.out.println("Retrieving Query Executed");
			while(resultSet.next())
			{
				System.out.println("Employee Id "+resultSet.getInt("employeeId"));
				System.out.println("Employee Name "+resultSet.getString("employeeName"));
				System.out.println("Employee Role "+resultSet.getString("role"));
				System.out.println("Employee InsertTime "+resultSet.getTime("inserttime"));
				System.out.println("Employee Salary "+resultSet.getDouble("salary"));
				System.out.println("==============================================================");
			}
		}catch(Exception e)
		{
			throw e;
		}
		finally
		{
			DbUltility.getDbConnectionClose();
		}

	}

	@Override
	public void deleteEmployee(EmployeeBean employeeBean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		try
		{
			int id=employeeBean.getEmployeeId();
			String deleteData="Delete From Employee where employeeId="+id+"";
			connection=DbUltility.getDbConnection();
			Statement statement=connection.createStatement();
			int rowsUpdateCount=statement.executeUpdate(deleteData);
			if(rowsUpdateCount>0)
			{
				System.out.println("Employee Deleted Successfully"+rowsUpdateCount);
			}else
			{
				System.out.println("OOPs something went wrong|| we are on process");
			}
		}catch(Exception e)
		{
			throw e;  
		}finally
		{
			DbUltility.getDbConnectionClose();	
		}

	}

}
