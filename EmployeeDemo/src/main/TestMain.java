package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import address.Address;
import employee.Employee;

public class TestMain {
	public static void main(String[] args) {
		Employee employee=new Employee();
		storeEmployeeDetails(employee);
		showEmployeeDetails(employee);
	}

	private static void showEmployeeDetails(Employee employee) {
		System.out.println("Emploee ID"+employee.getEmployeeId());
		System.out.println("Employee Name"+employee.getEmployeeName());
		System.out.println("Employee Address1"+employee.getAddress().getAddress1());
		System.out.println("Employee Address2"+employee.getAddress().getAddress2());
		System.out.println("Employee City"+employee.getAddress().getCity());
		System.out.println("Employee City PinCode"+employee.getAddress().getPinCode());
	}

	private static void storeEmployeeDetails(Employee employee) {
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Employee Id");
			int employeeId=Integer.parseInt(br.readLine());
			employee.setEmployeeId(employeeId);
			System.out.println("Enter Employee Name");
			String employeeName=br.readLine();
			employee.setEmployeeName(employeeName);
			Address address=new Address();
			System.out.println("Enter Employee address 1 ");
			String address1=br.readLine();
			address.setAddress1(address1);
			System.out.println("Enter Employee address 2 ");
			String address2=br.readLine();
			address.setAddress2(address2);
			System.out.println("Enter Employee City ");
			String city=br.readLine();
			address.setCity(city);
			System.out.println("Enter Employee City Pin ");
			int pinCode=Integer.parseInt(br.readLine());
			address.setPinCode(pinCode);
			employee.setAddress(address);
		}catch(IOException e)
		{

		}
	}
}
