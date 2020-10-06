package java7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 */

/**
 * @author  Arfaoui Hassen
 * @project TestProject
 * @package
 * 18 oct. 2017
 */
public class Main
{

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		 /*Scanner input =  new Scanner(System.in);
		 String s1,s2;
		 s1 = input.nextLine();
		 s2 = input.nextLine();
		 System.out.println(new BigInteger(s1).add(new BigInteger(s2)));
		 System.out.println(new BigInteger(s2).multiply( new BigInteger(s2) ));*/
		List<Etudiant> list = new ArrayList<Etudiant>();
		list.add( new Main().new Etudiant(5,"ha") );
		list.add( new Main().new Etudiant(3,"baa") );
		list.add( new Main().new Etudiant(9,"daaaa") );
		list.add( new Main().new Etudiant(6,"waaa") );
		Collections.sort( list , new Comparator<Etudiant>()
		{
			/* (non-Javadoc)
			 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
			 */
			@Override
			public int compare( Etudiant e1, Etudiant e2 )
			{
				// TODO Auto-generated method stub
				return Integer.compare( e1.getId(), e2.getId() );
			}
		});
	}
	public void test(){
		Etudiant e = new Etudiant(1,"pp");
	}

	class Etudiant{
		private int id;
		private String name;
		public Etudiant(int id, String name){
			this.id = id;
			this.name = name;
		}
		/**
		 * @return the id
		 */
		public int getId()
		{
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId( int id )
		{
			this.id = id;
		}
		/**
		 * @return the name
		 */
		public String getName()
		{
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName( String name )
		{
			this.name = name;
		}

	}
}
