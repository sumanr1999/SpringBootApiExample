package com.sr.springboot.model;
	
public class User {

	private long id;
	
	private String accNumber;
	
	private String phoneNumber;
	
	private String address;

	public User(){
		id=0;
	}
	
	public User(long id, String accNumber, String phoneNumber, String address){
		this.id = id;
		this.accNumber = accNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setAge(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", accNumber=" + accNumber + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}


}
