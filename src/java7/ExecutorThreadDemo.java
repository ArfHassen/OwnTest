package java7;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author  Arfaoui Hassen
 * @project TestProject
 * @package
 * 25 avr. 2018
 */
public class ExecutorThreadDemo
{

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		List<TestRunner> listRunner = new ArrayList<>();
		listRunner.add( new TestRunner() );
		listRunner.add( new TestRunner() );
		listRunner.add( new TestRunner() );
		listRunner.add( new TestRunner() );
		ExecutorService executorByOneThread = Executors.newSingleThreadExecutor();
		ExecutorService executerByListThreadInPool = Executors.newFixedThreadPool( 10 );
		/*
		 * a pool of thread will execute all tasks, its much faster
		 * a pool is a collection saved in memory of objects created and initiated  to avoid creating its every time we need
		 */
		executeRunnables( executerByListThreadInPool, listRunner );
		/*
		 * one Thread will execute all tasks in sequentiel order, it take more time to finished all tasks than threads in pool
		 */
		//executeRunnables( executorByOneThread, listRunner );
	}

	static void executeRunnables(ExecutorService executor, List<TestRunner> listRunner){
		for(TestRunner runner : listRunner){
			executor.execute( runner );
		}
		executor.shutdown();
	}

}

class TestRunner implements Runnable{

	@Override
	public void run()
	{
		try
		{
			Thread.sleep( 4000 );
			System.out.println("Thread name : "+Thread.currentThread().getName());
		}
		catch( InterruptedException e )
		{
		}
	}

}
