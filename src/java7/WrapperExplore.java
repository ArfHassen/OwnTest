package java7;
import java.util.Date;

/**
 * A Renseigner.
 *
 * @author : Viamedis
 * @project : TestProject
 * @package :
 * @date : 9 avr. 2018 13:45:50
 */
public class WrapperExplore
{
	public static void main( String[] args )
	{
		testAutoboxing();
		//exploreSameIntegerFunction();
		verifyIfIntegerIsImmutable();
		//testCustumWrapperMutableInteger();
		//illustrateDateMutabilite();
	}

	/**
	 *
	 */
	public static void testAutoboxing()
	{
		/*
		 * create Integer object from a primitive using static methode { valueOf } is better than using constructor
		 * because it's not needed to create a object
		 * it's better for performance
		 */
		Integer i = Integer.valueOf( 1 );//autoboxing : convert primitive i to Integer object
		Integer j = Integer.valueOf( 2 );
		/*
		 * here the compilateur will unbox(from object to primitive) by calling initValue to make multiplication i* j
		 * After that, the compiler also will autobox the result by calling valueOf methode to get x object
		 */
		Integer x = i * j;
		System.out.println(x);
	}

	/**
	 *
	 */
	public static void illustrateDateMutabilite()
	{
		Date d = new Date();
		System.out.println(d);
		modifyDate( d );
		System.out.println(d);
	}

	/**
	 *
	 */
	public static void testCustumWrapperMutableInteger()
	{
		WrapperInteger wi = new WrapperExplore().new WrapperInteger(5);
		System.out.println(wi.intValue());
		modify_(wi);
	    System.out.println(wi.intValue());
	}

	/**
	 *
	 */
	public static void verifyIfIntegerIsImmutable()
	{
		Integer i = new Integer(12);
        System.out.println(i);
        modify(i);
        System.out.println(i);
	}

	private static void modify( Integer i )
	{
		i = i + 1;
	}
	private static void modify_( WrapperInteger i )
	{
		i.set( 10 );
	}
	private static void modifyDate( Date d )
	{
		d.setTime( d.getTime()+ 100000000 );
	}
	public static void exploreSameIntegerFunction()
	{
		Integer it = new Integer("5");
		Integer it2 = Integer.parseInt( "10" );
		String it3 = Integer.toBinaryString( 10 );
		String it4 = Integer.toHexString( 5 );
		Integer it5 = Integer.valueOf( 6 );
		int i = it.intValue();
	}

	private  class WrapperInteger{
		private int value =0;
		public WrapperInteger(int i){
			this.value = i;
		}
		public int intValue(){
			return value;
		}
		public void set(int value){
			this.value = value;
		}
	}
}
