package java7;
/**
 * 
 */

/**
 * @author  Arfaoui Hassen
 * @project TestProject
 * @package 
 * 17 nov. 2017
 */
public class NestedClassDemo
{
	int varGlob=0;
	static byte varStatic = 3;
	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		StaticClass st = new StaticClass();
		
		st.method();
		
		//Instantiate non-static inner class in a static methode
		InnerClass inner = new NestedClassDemo().new InnerClass();
	}
	public void accessNestedClass(){
		StaticClass st = new StaticClass();
		InnerClass inner = new InnerClass();
		NestedClassDemo.StaticClass s = new NestedClassDemo.StaticClass();// the same StaticClass st = new StaticClass();
	}
	
	public static void otherStaticMethod(){
		//Instantiate non-static inner class in a static methode
		InnerClass inner = new NestedClassDemo().new InnerClass();
	}
	
	private static class StaticClass{
		int id = 0;
		void method(){
			varStatic = 6;
		}
	}

	class InnerClass
	{
		int aq = 5;
		//static int bn = 2;//cann't declare static variable in an inner class
		void method()
		{
			varGlob = 3;
		}
	}
}
