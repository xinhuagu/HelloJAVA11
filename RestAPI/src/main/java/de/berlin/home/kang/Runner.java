package de.berlin.home.kang;

import java.util.List;
import java.util.ServiceLoader;
import java.util.logging.Logger;

import de.berlin.home.kang.dataaccess.DaoInterface;
import de.berlin.home.kang.model.Person;

/**
 * 
 * Main class of the project
 * 
 * @author xinhua
 *
 */
public class Runner {

	private static final Logger logger = Logger.getLogger(Runner.class.getCanonicalName());

	public static void main(String[] args) {

		ServiceLoader<DaoInterface> infs = ServiceLoader.load(DaoInterface.class);
		
		List<Person> persons = infs.findFirst().get().getPersons();
		
		persons.stream().forEach(p->System.out.println(p.getName()));
		
	}


}
