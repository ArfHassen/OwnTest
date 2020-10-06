package java7;

import java.util.*;

/**
 *
 */

/**
 * @author  Arfaoui Hassen
 * @project TestProject
 * @package
 * 20 nov. 2017
 */
public class MapExploreJDKDemo
{

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		//expploreSet();
		//new MapExploreJDKDemo().exploreArrayList();
		new MapExploreJDKDemo().exploreMap();
	}
	/**
	 *
	 */
	public static void expploreSet()
	{
		Set<String> set = new HashSet<>();
		set.add( "aa" );
		set.add( "bb" );
		set.add( "aa" );
		for(String s : set){
			System.out.println(s);
		}
	}
	public void exploreArrayList(){
		List<String> list = new ArrayList<String>();
		list.add( "zzzz" );
		list.add( "aaa" );
		list.add( "kkkk" );
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public void exploreMap(){
		Map<String,String> map = new HashMap<String,String>();
		map.put( "AaAa", "AaAa" );
		map.put( "BBBB", "BBBB" );
		map.put( "AaBB", "AaBB" );
		map.put( "BBAa", "BBAa" );
		map.put( "AaAa", "xxxxxx" );
		map.put( "BB", "BB" );
		String k = map.get( "Aa" );
		for(Map.Entry<String, String> entry : map.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
