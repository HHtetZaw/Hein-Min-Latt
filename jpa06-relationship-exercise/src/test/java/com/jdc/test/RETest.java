package com.jdc.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

public class RETest {
	
	@Test
	void test() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory
				("re");
		
		emf.close();
		
		
	}

}
