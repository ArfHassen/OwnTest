package java7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A Renseigner.
 * 
 * @author : Viamedis
 * @project : TestProject
 * @package :
 * @date : 4 avr. 2018 17:01:35
 */
public class CollectionsDemo
{
	public static void main( String[] args )
	{
		String s = "eac";
		int i = s.compareTo( "ab" );
		new CollectionsDemo().sortList();
	}
	
	public void sortList(){
		List<Produit> list = new ArrayList<>();
		list.add( new Produit(1,"Produit 1", 10.5) );
		list.add( new Produit(2,"Produit 2", 6.5) );
		list.add( new Produit(3,"Produit 3", 12.5) );
		list.add( new Produit(4,"Produit 4", 4.5) );
		System.out.println(list);
		Collections.sort( list );
		System.out.println(list);
	}
	
	public static void methode()
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add( 5 );
		list.add( 1 );
		list.add( 2 );
		list.add( 0 );
		list.add( 4 );
		list.add( 3 );
		System.out.println(list);
		Collections.sort( list );
		System.out.println(list);
	}
	
	private class Produit implements Comparable<Produit>{
		private long id;
		private String name;
		private Double prix;
		public Produit()
		{
			super();
		}
		public Produit( long id, String name, Double prix )
		{
			super();
			this.id = id;
			this.name = name;
			this.prix = prix;
		}
		public long getId()
		{
			return id;
		}
		public void setId( long id )
		{
			this.id = id;
		}
		public String getName()
		{
			return name;
		}
		public void setName( String name )
		{
			this.name = name;
		}
		public Double getPrix()
		{
			return prix;
		}
		public void setPrix( Double prix )
		{
			this.prix = prix;
		}
		@Override
		public String toString()
		{
			return "id produit: " +this.id;
		}
		@Override
		public int compareTo( Produit o )
		{
			return this.prix.compareTo( o.getPrix() );
		}
		
	}
}
