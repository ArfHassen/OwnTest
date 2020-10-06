package java7;
/**
 * 
 */

/**
 * @author Arfaoui Hassen
 * @project TestProject
 * @package
 *          14 nov. 2017
 */
public class ThreadDemo
{

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main( String[] args ) throws InterruptedException
	{
		// new ThreadDemo().joinThreadTest();//test join thread
		ThreadSingleton[] threads = new ThreadSingleton[5];
		for( int i = 0; i < threads.length; i++ )
		{
			threads[i] = new ThreadSingleton( "Thread :" + i );
			threads[i].start();
		}
	}

	void joinThreadTest() throws InterruptedException
	{
		Thread t = new Thread( new Runnable()
		{
			@Override
			public void run()
			{
				for( int i = 0; i < 6; i++ )
				{
					System.out.println( Thread.currentThread().getName() + " : " + i );
				}
			}
		} );
		t.start();
		// join the current thread {main} to the end of this thread t
		t.join();
		for( int i = 0; i < 6; i++ )
		{
			System.out.println( Thread.currentThread().getName() + " : " + i );
		}
	}

}

class SingletonDemo
{
	static volatile SingletonDemo singleton;

	private SingletonDemo()
	{

	}

	public static SingletonDemo getInstance()
	{
		if( singleton == null )
		{// Single check
			synchronized( SingletonDemo.class )
			{
				if( singleton == null )
				{// Double checked
					System.out.println( "Instantiate singleton done." );
					singleton = new SingletonDemo();
				}
			}
		}
		return singleton;
	}
}

class ThreadSingleton extends Thread
{

	private String threadName;

	public ThreadSingleton( String name )
	{
		threadName = name;
	}

	@Override
	public void run()
	{
		System.out.println( "Thread " + threadName + " is trying to instantiate the singleton." );
		SingletonDemo singleton = SingletonDemo.getInstance();
	}
}

class Waiter implements Runnable
{
	private boolean shouldFinish;

	void finish()
	{
		shouldFinish = true;
	}

	public void run()
	{
		long iteration = 0;
		while( !shouldFinish )
		{
			iteration++;
		}
		System.out.println( "Finished after: " + iteration );
	}
}

class DataRace
{
	public static void main( String[] args ) throws InterruptedException
	{
		Waiter waiter = new Waiter();
		Thread waiterThread = new Thread( waiter );
		waiterThread.start();
		Thread.sleep( 10000 );
		waiter.finish();
		waiterThread.join();
	}
}
