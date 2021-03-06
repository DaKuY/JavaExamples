package com.hibernateclass.simpleab.dao;

import java.util.List;
import com.hibernateclass.simpleab.model.Person;

public interface PersonDao {
	
	public void persist(Person person);
	public Person get(String firstName, String lastName);
	public void update(Person person);
	public void delete(Person person);
	public List<Person> list();
	
}
