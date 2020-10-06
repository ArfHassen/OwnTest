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
public class ThreadLocalDemo
{

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		MonTraitementAvecTL monTraitementAvecTL = new MonTraitementAvecTL();
		Thread thread1 = new Thread( monTraitementAvecTL );
		Thread thread2 = new Thread( monTraitementAvecTL );
		thread1.start();
		thread2.start();
	}

}

class MonTraitementAvecTL implements Runnable
{
	ThreadLocal<String> monThreadLocal = new ThreadLocal<String>();
	String str = "azer";
	@Override
	public void run()
	{
		System.out.println("Mon traitement " + Thread.currentThread().getName()+ " monThreadLocal=" + monThreadLocal);
		/*
		 * Thread local allow putting variable in the current thread
		 * one Thread can't see others thread variables
		 */
		monThreadLocal.set( "Valeur pour " + Thread.currentThread().getName() );
		try
		{
			Thread.sleep( 1000 );
			String valeur = monThreadLocal.get();
			System.out.println("Valeur = " + valeur);
		}
		catch( InterruptedException e )
		{
			e.printStackTrace();
		}
	}
	
}