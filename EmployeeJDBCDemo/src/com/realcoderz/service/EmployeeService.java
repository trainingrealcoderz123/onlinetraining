package com.realcoderz.service;

import java.sql.SQLException;

import com.realcoderz.businessbean.EmployeeBean;

public interface EmployeeService {
	int insertEmployee(EmployeeBean employeeBean)throws ClassNotFoundException,SQLException;
	void updateEmployee(EmployeeBean employeeBean)throws ClassNotFoundException,SQLException;
	void readEmployee() throws ClassNotFoundException,SQLException;
	void deleteEmployee(EmployeeBean employeeBean) throws ClassNotFoundException,SQLException;
}
