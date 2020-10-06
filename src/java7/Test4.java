package java7;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */

/**
 * @author  Arfaoui Hassen
 * @project SpringBootMongodbAngular
 * @package
 * 20 juin 2017
 */
public class Test4
{
private int valeur ;
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
		Integer i = new Integer("0");
		String s = new String("0");
		if(s.equals( i.toString() )){
			System.out.println("ok");
		}else{
			System.out.println("Nok");
		}
		new Test4().genericMethodExemple( new Integer(1));
		List<?> x = new ArrayList<Object>();
		List<Parent> list = new ArrayList<Parent>();
		List<ChildClass> list1 = new ArrayList<ChildClass>();
		list.add( new ChildClass() );
		new Test4().testCollection( list1 );
		new Test4().testCollection2( list );
		System.out.println(8 | 9);
		Person pp = new TunisianPerson();
		TunisianPerson tp = new TunisianPerson();
		if(pp.equals( tp )){

		}
		 Parent p = new Parent();
		 ChildClass cc = new ChildClass();
	      Parent p1 = cc;
	      ChildClass c2 = (ChildClass) new Parent();

	      //ChildClass c = (ChildClass) p;
	      //acces inner class from static context
	      Test4.InnerClass inner = new Test4().new InnerClass();
	}
	public void accessInner(){
		//access inner class from simple method
		InnerClass inn = new InnerClass();
	}

	public void testCollection(List<? extends Parent> list){}
	public void testCollection2(List<?> list){}

	public <T> void genericMethodExemple(T t){
		List<T> list = new ArrayList<T>();
		list.add( t );
	}

	class InnerClass {
		int val =0;
		public void accesOuter(){
			valeur = 0;
		}
	}


}

class Parent{ /* ... */}

class ChildClass extends Parent { /* ... */ }
