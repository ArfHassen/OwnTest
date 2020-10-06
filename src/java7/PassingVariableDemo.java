package java7;

import java.awt.*;
import java.util.logging.Logger;

/**
 *
 */

/**
 * @author  Arfaoui Hassen
 * @project TestProject
 * @package
 * 28 déc. 2017
 */
public class PassingVariableDemo
{
    private static final Logger logger = Logger.getLogger( PassingVariableDemo.class.getName() );
	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		new PassingVariableDemo().passingByReferenceDemo();
		new PassingVariableDemo().passingByPrimitive();
	}
	void passingByReferenceDemo(){
		Dimension d = new Dimension(5,10);
		logger.info( "height before modifying :"+d.height );
		/*
		 * Passing a copy of d
		 * This copy have a copy of the bits representing the reference(in memoire) of the object
		 * The same thing happened with primitive also
		 */
		modifyRefObject( d );
		logger.info( "height after modifying :"+d.height );
	}

	void passingByPrimitive(){
		int i =1;
		logger.info( "i before modifying :"+i );
		modifyPrimitive( i );
		logger.info( "height after modifying :"+i);
	}

	static void modifyRefObject(Dimension dim){
		dim.height = dim.height + 1;
		//dim = new Dimension(6,8);
	}

	static void modifyPrimitive(int number){
		number = number + 1;
		//dim = new Dimension(6,8);
	}

}
