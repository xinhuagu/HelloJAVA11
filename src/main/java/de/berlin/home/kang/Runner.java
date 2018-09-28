package de.berlin.home.kang;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
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

	public static void main(String[] args)
{
		
		logger.info(StringUtils.wrap(" The first java 11 program : show the first 3 running processes: ", "===================="));
		getFirst3Processes().forEach(System.out::println);
		
	}
	
	
	public static List<Long> getFirst3Processes()
	{
		Stream<ProcessHandle> allProcesses  = ProcessHandle.allProcesses();
		return allProcesses.limit(3).map(p->p.pid()).collect(Collectors.toList());
		
	}

}
