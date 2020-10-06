package java7;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 */

/**
 * @author  Arfaoui Hassen
 * @project TestProject
 * @package
 * 6 nov. 2017
 */
public class JavaRefletionDemo
{
	public static void main( String[] args )
	{
		new JavaRefletionDemo().relection( new TestRef1() );
	}
	public void relection(Object o){
		Class<? extends Object> c = o.getClass();
		Class[] listImpInterfaces = c.getInterfaces();
		Method [] listMethods = c.getMethods();
		Annotation[] annotations = c.getAnnotations();
		try
		{
			Field f = c.getField( "m" );
			f.set( o, 5 );
			listMethods[0].invoke( o, null );
		}
		catch( IllegalAccessException e1 )
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch( IllegalArgumentException e1 )
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch( InvocationTargetException e1 )
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		catch( NoSuchFieldException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch( SecurityException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

interface ITest{}

class TestRef{}

class TestRef1 extends TestRef implements ITest {
	public int m;
	@Deprecated
	public void run(){
		System.out.println(m);
	}

}
