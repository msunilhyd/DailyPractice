package com.linus.DailyPractice.collections;

public class Employee
{
	private Integer id;
	private String name;
	private String email;
	private Double salary;
	
	public Employee(int id, String name, String email, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ id = " + id + ", name = " + name + ", email = " + email + ", salary = " + salary + " ]"; 
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if(email == null) {
			if(other.email != null)
				return false;
		}
		else if(!other.email.equals(email)){
			return false;
		}
		if(id == null){
			if(!(other.id == null))
				return false;
		}
		else if(!id.equals(other.id)){
			return false;
		}
		if(salary == null){
			if(other.salary != null)
				return false;
		}
		else if(!salary.equals(other.salary)){
			return false;
		}
		if(name == null){
			if(!(other.name == null))
				return false;
		}
		else if(!name.equals(other.name))
			return false;
		
		return true;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
