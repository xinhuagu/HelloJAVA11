package de.berlin.home.kang;

import java.util.logging.Logger;
import java.util.stream.Stream;


public class Runner {

	private static final Logger logger = Logger.getLogger(Runner.class.getCanonicalName());

	public static void main(String[] args) {
		
		logger.info(" =============> the first java 11 programm : show the first 3 running processes: ");
		
		
		Stream<ProcessHandle> allProcesses  = ProcessHandle.allProcesses();
		allProcesses.limit(3).forEach(p-> logger.info(p.info().toString()));
		
	}

}
