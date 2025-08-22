package hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {
	
	private String country;
	private String firstname;
	private String lastname;
	
	List<String> countryOptions;
	
	public StudentTwo() {
		countryOptions = new ArrayList<>();
		
		countryOptions.add("Brasil");
		countryOptions.add("India");
		countryOptions.add("France");
		countryOptions.add("Japan");
		countryOptions.add("Germany");
		countryOptions.add("Turkey");
	}

	
	
	public List<String> getCountryOptions() {
		return countryOptions;
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

