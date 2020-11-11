package com.cg.InHouseMarketPlace.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
		@Id
		private int empId;
		private String empName;
		private String deptName;
		private String location;
		@OneToOne
		private User user;
		
		public Employee() {
			super();
		}
		public Employee(int empId, String empName, String deptName, String location) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.deptName = deptName;
			this.location = location;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
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
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", deptName=" + deptName + ", location=" + location
					+ ", user=" + user + "]";

}
}