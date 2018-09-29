package de.berlin.home.kang.dataaccess.fileaccess;

import java.util.List;

import de.berlin.home.kang.dataaccess.DaoInterface;
import de.berlin.home.kang.model.Person;

public class FileAccess implements DaoInterface{

	@Override
	public List<Person> getPersons() {
		List<Person> list = List.of(new Person(1L,"xinhua","xinhua.gu@gmail.com"),
				new Person(2L,"yue","yue@gmail.com"));
		
		return list;
	}

}
