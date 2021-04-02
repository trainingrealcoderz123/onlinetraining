package com.realcoderz.service;

import java.sql.SQLException;

import com.realcoderz.businessbean.EmployeeBean;
import com.realcoderz.dao.EmployeeDAO;
import com.realcoderz.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO=new EmployeeDAOImpl();
	@Override
	public int insertEmployee(EmployeeBean employeeBean) throws ClassNotFoundException, SQLException {
		int rowsUpdateCount=0;
		try
		{
			rowsUpdateCount=employeeDAO.insertEmployee(employeeBean);
		}catch(ClassNotFoundException|SQLException e)
		{
			throw e;
		}
		return rowsUpdateCount;
	}

	@Override
	public void updateEmployee(EmployeeBean employeeBean)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		try
		{
			employeeDAO.updateEmployee(employeeBean);
		}catch(ClassNotFoundException|SQLException e)
		{
			System.out.println(e.getMessage());
		}catch(Exception e)
		{
			throw e;
		}
	}

	@Override
	public void readEmployee() throws ClassNotFoundException, SQLException {

		try {
			employeeDAO.readEmployee();
		}catch(ClassNotFoundException|SQLException e)
		{
			System.out.println(e.getMessage());
			throw e;
		}

	}

	@Override
	public void deleteEmployee(EmployeeBean employeeBean) throws ClassNotFoundException,SQLException {
		try
		{
			employeeDAO.deleteEmployee(employeeBean);
		}catch(ClassNotFoundException|SQLException e)
		{
			System.out.println(e.getMessage());
		}catch(Exception e)
		{
			throw e;
		}


	}

}
