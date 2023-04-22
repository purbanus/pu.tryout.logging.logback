
package com.javacodegeeks.examples.logbackadditivityexample.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Intern extends Employee {

	private static final Logger	LOGGER	= LoggerFactory.getLogger( "employee.director.manager.engineer.intern" );

	public Intern( final String name ) {
		super( name );

		LOGGER.info( "New Intern is created. His/her name is : {}", super.name );
	}
}
