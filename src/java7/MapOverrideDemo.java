package java7;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */

/**
 * @author  Arfaoui Hassen
 * @project SpringBootMongodbAngular
 * @package
 * 20 juin 2017
 */
public class MapOverrideDemo
{

	public static void main( String[] args )
	{
		/*ArrayList<String> list = new ArrayList<String>();
		list.add( "00" );
		list.add( "01" );
		list.add( "25" );
		list.add( "53" );
		Iterator<String> it = list.iterator();
		System.out.println(list.size());
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		//System.out.println(8 & 9);
		Map<String,String> mp = new MyMap<String,String>();
		mp.put( "11", "11111" );
		mp.put( "22", "22222" );
		mp.put( "33", "33333" );
	}
}

class MyMap<K,V> extends HashMap<K,V> {

	private static final long serialVersionUID = 1L;

	public K testMethod(){
		K str = null;
		return str;
	}

	/* (non-Javadoc)
	 * @see java.util.HashMap#put(java.lang.Object, java.lang.Object)
	 */
	@Override
	public V put( K key, V value )
	{
		System.out.println(key+"----"+value);
		return super.put( key, value );
	}

}
