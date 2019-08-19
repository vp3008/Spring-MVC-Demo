package com.deepankar.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Student 
{
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	
	private List<String> selectedOperatingSystems = new ArrayList<String>();
	
	//can use linkedHashmap here as well
	private LinkedHashMap<String, String> languages;
	private List<String> countryOptions;
	private List<String> operatingSystems;
	
	
	public Student()
	{
		//populate country options: used ISO country code
		countryOptions = new ArrayList<>();
		countryOptions.add("Brazil");
		countryOptions.add("Germany");
		countryOptions.add("France");
		countryOptions.add("India");
		countryOptions.add("United States of America");
		
		languages = new LinkedHashMap<>();	
		languages.put("Java","Java" );
		languages.put("Ruby","Ruby" );
		languages.put("C#","C#" );
		languages.put("PHP","PHP" );
		
		operatingSystems = new ArrayList<String>();
		operatingSystems.add("Windows");
		operatingSystems.add("MacOS");
		operatingSystems.add("Linux");
		operatingSystems.add("Unix");
		
		
		/*
		 * countryOptions.put("BR", "Brazil"); countryOptions.put("DE", "Germany");
		 * countryOptions.put("FR", "France"); countryOptions.put("IN", "India");
		 * countryOptions.put("US", "United States of America");
		 */
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	public List<String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LinkedHashMap<String, String> getLanguages() {
		return languages;
	}

	public void setLanguages(LinkedHashMap<String, String> languages) {
		this.languages = languages;
	}

	public List<String> getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(List<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public List<String> getSelectedOperatingSystems() {
		return selectedOperatingSystems;
	}

	public void setSelectedOperatingSystems(List<String> selectedOperatingSystems) {
		this.selectedOperatingSystems = selectedOperatingSystems;
	}

	 
	
	
}
