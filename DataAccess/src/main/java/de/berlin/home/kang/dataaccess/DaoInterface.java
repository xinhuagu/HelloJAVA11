package de.berlin.home.kang.dataaccess;

import java.util.List;

import de.berlin.home.kang.model.Person;

public interface DaoInterface {

	List<Person> getPersons();
	
}
