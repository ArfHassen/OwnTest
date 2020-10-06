package java7;
//import org.apache.commons.lang3.StringUtils;

public class ComparateDemo
{
	private  String field;

	public static void main( String[] args )
	{
		new ComparateDemo().testStringUtils();
		new ComparateDemo().differenceBetweenIdenticalAndEquals();
	}
	
	void testStringUtils()
	{
		//if( field.equals( "" ) ){}//will generate null pointer exception.
		//if(StringUtils.equals("","MyStringValue")) {}// don't generate exception even in the case of runtimeexception
	}
	void differenceBetweenIdenticalAndEquals(){
		String s1 = "String";
		String s2 = "String";
		boolean ident = s1 == s2;
		System.out.println(ident);
		if(s1 == s2 )System.out.println("== ok");
		if(s1.equals( s2 ) )System.out.println("equals ok");
	}
}
