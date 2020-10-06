package java7;
/**
 *
 */

/**
 * @author  Arfaoui Hassen
 * @project TestProject
 * @package
 * 13 nov. 2017
 */
public class StackTraceDemo
{

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		//show the stack trace for the default thread : main
		new TestStack().test();
		//for this thread, another stack trace will be created and shown
		Thread thread = new Thread(new RunnableDemo());
		thread.setName( "first thread" );
		thread.start();
	}


}

class TestStack{
	public void test(){
		System.out.println("...");
		test1();

	}
	void test1(){
		for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
		    System.out.println(ste);
		}
	}
}

class RunnableDemo implements Runnable {

	@Override
	public void run()
	{
		System.out.println("Thread : "+Thread.currentThread().getName());
		for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
		    System.out.println(ste);
		}
	}

}
