package java7;

/**
 * @author  Arfaoui Hassen
 * @project TestProject
 * @package 
 * 29 nov. 2017
 */
public class ExceptionDemo
{

	public static void main( String[] args )
	{
		new ExceptionDemo().method();
		System.out.println("...");
	}
	void method(){
		String str=null;
		if(null == str){
			throw new RuntimeException("excep");
		}
		System.out.println("...");
	}
}
