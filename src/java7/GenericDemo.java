package java7;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


/**
 *
 */

/**
 * @author  Arfaoui Hassen
 * @project TestProject
 * @package
 * 13 déc. 2017
 */
public class GenericDemo
{

	private final static Logger logger = Logger.getLogger( GenericDemo.class.getName());
	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		String[] tab = {"11","22"};
		//String s = tab[2];
		String str = "000";
		new GenericDemo().genericMethod( str );
	}
	public <T> void genericMethod(T arg){
		List<T> list = new ArrayList<T>();
		list.add( arg );
		for(T str : list){
			logger.info( str.toString() );
		}
	}

}

class GenericTest<T>{
	T var;
	T meth(T var){
		return var;
	}
}
