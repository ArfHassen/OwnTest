package java7;
/**
 * 
 */

/**
 * @author Arfaoui Hassen
 * @project TestProject
 * @package
 *          15 nov. 2017
 */
public class ThreadInteractionDemo
{
	public static void main( String[] args ) throws InterruptedException
	{
		ThreadB b = new ThreadB();
		b.start();
		synchronized( b )
		{
			b.wait();
			System.out.println("Total is: " + b.total);
		}
	}
}

class ThreadB extends Thread
{
	int total;

	public void run()
	{
		synchronized( this )
		{
			for( int i = 0; i < 100; i++ )
			{
				total += i;
			}
			notify();
		}
	}
}