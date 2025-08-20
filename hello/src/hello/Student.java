package hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {

	private String firstname;
	private String lastname;
	
	public Student() {
		
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
