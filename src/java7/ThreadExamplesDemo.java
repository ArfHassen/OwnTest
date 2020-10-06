package java7;
/**
 * 
 */

/**
 * @author  Arfaoui Hassen
 * @project TestProject
 * @package 
 * 16 nov. 2017
 */
public class ThreadExamplesDemo extends Thread
{

	public ThreadExamplesDemo(){
		
	}
	/**
	 * @param args
	 */
	 static int anInteger = 0; // initialize  
     static final long START_TIME = System.currentTimeMillis() + (1000 * 5); // 20 seconds from current time.  
     public static void main(String[] args) throws Exception  
     {  
          // employ 200 threads.  
          for(int i=0; i<200; i++) {  
               new ThreadExamplesDemo().start();  
          }  
          // wait for some time so all 200 threads completes its execution.  
          Thread.sleep(1000*20);  
          System.out.println(anInteger); // We EXPECT TO PRINT 200. but it prints some corrupted integer value !!  
     }  
	
	@Override
	public void run()
	{
		 try {  
             Thread.sleep(START_TIME - System.currentTimeMillis());  
        }  
        catch(InterruptedException e) {  
             e.printStackTrace();  
        }  
        anInteger += 1;  
	}
}
