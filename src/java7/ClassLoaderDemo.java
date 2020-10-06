package java7;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/**
 *
 */

/**
 * @author  Arfaoui Hassen
 * @project TestProject
 * @package
 * 19 déc. 2017
 */
public class ClassLoaderDemo
{

	private static Logger logger = Logger.getLogger( ClassLoaderDemo.class.getName());
	/**
	 * @param args
	 * @throws ClassNotFoundException
	 */
	public static void main( String[] args ) throws ClassNotFoundException
	{
		logger.info( "Class loader for user class :"+ ClassLoaderDemo.class.getClassLoader().getClass().getName() );
		/*
		 * it will give us NULL because class loader for core runtime classes is a native implementation.
		 */
		//logger.info( "Class loader for JRE runtime class :"+String.class.getClassLoader().getClass().getName() );
		/*
		 *
		 */
		Class c = Class.forName( "java.lang.String" );
		Method[] methods =  c.getMethods();
		for(Method m : methods){
			logger.info( m.getName() );
		}
	}

}
