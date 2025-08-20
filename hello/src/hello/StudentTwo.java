package hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {
	
	private String country;
	private String firstname;
	private String lastname;
	
	public StudentTwo() {
		
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}

