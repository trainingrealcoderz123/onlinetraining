package com.realcoderz.dao;

import java.sql.SQLException;

import com.realcoderz.businessbean.EmployeeBean;

public interface EmployeeDAO {
	int insertEmployee(EmployeeBean employeeBean)throws ClassNotFoundException,SQLException;
	void updateEmployee(EmployeeBean employeeBean) throws ClassNotFoundException,SQLException;
	void readEmployee() throws ClassNotFoundException,SQLException;
	void deleteEmployee(EmployeeBean employeeBean) throws ClassNotFoundException,SQLException;
}
