package java7;
/**
 * A Renseigner.
 * 
 * @author : Viamedis
 * @project : TestProject
 * @package :
 * @date : 16 avr. 2018 17:55:06
 */
public class StringDemo
{
	public static void main( String[] args )
	{
		internStringDemo();
	}

	/**
	 * 
	 */
	private static void internStringDemo()
	{
		String s1 ="abcde";//create the literal String 'abcde' in the pool
		String s2 = new String("abcde");//cretae a new Object in the heap
		String s3 = s2.intern(); //returns string from pool, now it will be same as s2  
		System.out.println(s2==s1);//false because reference is different (literal vs Object)
		System.out.println(s1==s3);//true because reference is same  
	}
}
