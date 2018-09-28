package de.berlin.home.kang;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RunnerTest {

	@Test
	public void test() {
		assertEquals(3, Runner.getFirst3Processes().size());
	}

}
