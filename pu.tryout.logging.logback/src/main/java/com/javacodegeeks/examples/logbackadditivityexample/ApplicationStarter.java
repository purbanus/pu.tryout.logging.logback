
package com.javacodegeeks.examples.logbackadditivityexample;

import com.javacodegeeks.examples.logbackadditivityexample.model.Director;
import com.javacodegeeks.examples.logbackadditivityexample.model.Employee;
import com.javacodegeeks.examples.logbackadditivityexample.model.Engineer;
import com.javacodegeeks.examples.logbackadditivityexample.model.Intern;
import com.javacodegeeks.examples.logbackadditivityexample.model.Manager;

public class ApplicationStarter {

	@SuppressWarnings( "unused" )
	public static void main( final String[] args ) {

		final Employee director = new Director( "Ali" );

		final Employee manager = new Manager( "Susan" );

		final Employee engineer = new Engineer( "Abony" );

		final Employee intern = new Intern( "Mehmet" );
	}
}
