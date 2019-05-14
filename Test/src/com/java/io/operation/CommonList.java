package com.java.io.operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Iterator;

class Employee {
	private Integer empId;
	private String empName;
	private Integer deptId;
	
	public Employee() {
	}
	
	public Employee(Integer empId, String empName, Integer deptId) {
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
	}
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptId=" + deptId + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptId == null) ? 0 : deptId.hashCode());
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (deptId == null) {
			if (other.deptId != null)
				return false;
		} else if (!deptId.equals(other.deptId))
			return false;
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}	
	
}

class Department{
	private Integer deptId;
	private String deptName;
	
	public Department() {
	}
	public Department(Integer deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptId == null) ? 0 : deptId.hashCode());
		result = prime * result + ((deptName == null) ? 0 : deptName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (deptId == null) {
			if (other.deptId != null)
				return false;
		} else if (!deptId.equals(other.deptId))
			return false;
		if (deptName == null) {
			if (other.deptName != null)
				return false;
		} else if (!deptName.equals(other.deptName))
			return false;
		return true;
	}
	
	
}

class ReturnList{
	private Integer empId;
	private String empName;
	private String deptName;
	
	public ReturnList() {
	}
	
	public ReturnList(Integer empId, String empName, String deptName) {
		this.empId = empId;
		this.empName = empName;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "ReturnList [empId=" + empId + ", empName=" + empName + ", deptName=" + deptName + "]";
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
public class CommonList {

	public static void main(String[] args) {
		CommonList commonList = new CommonList();
		List<ReturnList> returnList = commonList.populateReturnList(143);		
		returnList.stream().forEach(System.out::println);
	}

	private List<ReturnList> populateReturnList(Integer empId) {
		
		ReturnList returnList = null; 
		List<ReturnList> lstReturnList = null;
		Integer deptId = null;
		List<Employee> empList = Arrays.asList(
				new Employee(143,"Emp1",21),
				new Employee(144,"Emp2",21),
				new Employee(145,"Emp3",21),
				new Employee(146,"Emp4",21)
				);
		
		List<Department> deptList = Arrays.asList(
				new Department(21,"department1"),
				new Department(22,"department2"),
				new Department(23,"department3"),
				new Department(24,"department4")
				);
		
		
		Iterator<Employee> empitr =  empList.iterator();
		while(empitr.hasNext()) {
			Employee emp = (Employee)empitr.next();
			 if(empId.equals(emp.getEmpId())) {
				 returnList = new ReturnList();
				 lstReturnList = new ArrayList<ReturnList>();
				 deptId = emp.getDeptId();
				 returnList.setEmpId(emp.getEmpId());
				 returnList.setEmpName(emp.getEmpName());
			 }
			
		}		
		Iterator<Department> deptitr =  deptList.iterator();
		while(deptitr.hasNext()) {
			Department dept = (Department)deptitr.next();
			 if(deptId.equals(dept.getDeptId())) {
				 returnList.setDeptName(dept.getDeptName());
				lstReturnList.add(returnList); 
			 }			
		}
		
		return lstReturnList;
	}

}
