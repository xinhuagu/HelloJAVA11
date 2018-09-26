package de.berlin.home.kang;

import java.util.logging.Logger;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

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
		
		logger.info(StringUtils.wrap(" The first java 11 programe : show the first 3 running processes: ", "===================="));
		
		Stream<ProcessHandle> allProcesses  = ProcessHandle.allProcesses();
		allProcesses.limit(3).forEach(p-> logger.info(p.info().toString()));
		
	}

}
