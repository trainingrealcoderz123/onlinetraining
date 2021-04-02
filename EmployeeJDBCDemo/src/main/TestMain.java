package main;


import java.sql.SQLException;
import java.util.Date;

import com.realcoderz.businessbean.EmployeeBean;
import com.realcoderz.service.EmployeeService;
import com.realcoderz.service.EmployeeServiceImpl;

public class TestMain {

	public static void main(String[] args) {
		//insertEmployee(); 
		//readEmployee();
		//updateEmployee();
		deleteEmployee();
	}
	public static void deleteEmployee()
	{
		try
		{
		EmployeeService employeeService=new EmployeeServiceImpl();
		EmployeeBean employeeBean=new EmployeeBean();
		
		employeeBean.setEmployeeId(1004);
		employeeService.deleteEmployee(employeeBean);
		}catch(ClassNotFoundException |SQLException e)
		{
			System.out.println(e.getMessage());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void updateEmployee()
	{
		try
		{
			EmployeeService employeeService=new EmployeeServiceImpl();
			EmployeeBean employeeBean=new EmployeeBean();
			employeeBean.setEmployeeId(1002);
			employeeBean.setSalary(60000.00);
           employeeService.updateEmployee(employeeBean);
		}catch(ClassNotFoundException|SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static  void readEmployee()
	{
		try
		{
		EmployeeService employeeService=new EmployeeServiceImpl();
		employeeService.readEmployee();
		}catch(ClassNotFoundException|SQLException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void insertEmployee()
	{
		try
		{
		EmployeeService employeeService=new EmployeeServiceImpl();
		EmployeeBean employeeBean=new EmployeeBean();
		employeeBean.setEmployeeId(1005);
		employeeBean.setEmployeeName("Riya Tyagi");
		employeeBean.setRole("SeniorAssociate");
		employeeBean.setInsertTime(new Date());
		employeeBean.setSalary(40000.00);
			
		employeeService.insertEmployee(employeeBean);
		}catch(ClassNotFoundException|SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
