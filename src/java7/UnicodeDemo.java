package java7;
/**
 * A Renseigner.
 * @author  : Viamedis
 * @project : TestProject
 * @package : 
 * @date    : 5 avr. 2018 18:12:14
 */
public class UnicodeDemo
{

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		decimalDemo();
	}

	/**
	 * 
	 */
	public static void decimalDemo()
	{
		char a ='a'; //decimal = 97
		char b ='b'; //decimal =98
		System.out.println(a+b); // ça donne 195
		String s ="abcde";
		char[] ch = s.toCharArray();
		
		System.out.println(ch);
	}

}
