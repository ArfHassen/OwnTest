package java7;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author  Arfaoui Hassen
 * @project TestProject
 * @package 
 * 26 juin 2017
 */
public class Test2
{
	
	public static void main( String[] args )
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add( "00" );
		list.add( "01" );
		list.add( "25" );
		//list.add( "53" );
		Iterator<String> it = list.iterator();
		System.out.println(list);
		while(it.hasNext()){
			System.out.println(it.next());
			System.out.println(it.next());
			System.out.println(it.next());
		}
		for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
		    System.out.println(ste);
		}
		/*ArrayList<Ticket> list = new ArrayList<Ticket>();
		list.add( new Test2().new Ticket(1L,"11111") );
		list.add( new Test2().new Ticket(2L,"22222") );
		System.out.println(list);*/
	}
	
	private class Ticket{
		private Long id;
		private String description;
		
		public Ticket( Long id, String description )
		{
			super();
			this.id = id;
			this.description = description;
		}
		public Long getId()
		{
			return id;
		}
		public void setId( Long id )
		{
			this.id = id;
		}
		public String getDescription()
		{
			return description;
		}
		public void setDescription( String description )
		{
			this.description = description;
		}
		
	}

}
