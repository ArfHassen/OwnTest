package java7;

/**
 * @author  Arfaoui Hassen
 * @project TestProject
 * @package 
 * 8 nov. 2017
 */
public class BitwiseDemo
{

	/**
	 * @param args
	 */
	public static void main( String[] args )
	{
		/*
		 *  Bitwise OR |
		 */
		int a = 12;
		int b = 25;
		int ab = a | b;
		System.out.println("bitwise a | b : "+ ab);
		/* 
		 * Bitwise AND &
		 */
		int c = 12;
		int d = 25;
		int cd = c & d;
		System.out.println("bitwise c & d : "+ cd);
		/*
		 * Bitwise complement ~ 
		 * 
		 * 35 = 00100011 
		 * ~ 00100011 ça donne 11011100 (220)
		 * For any integer n, 2's complement of n will be -(n+1)
		 * 220           11011100          -(00100011+1) = -00100100 = -36(decimal)
		 * The bitwise complement of 35 is 220 (in decimal). The 2's complement of 220 is -36. Hence, the output is -36 instead of 220.
		 */
		int e = 35;
		int e_ = ~e;
		System.out.println("bitwise ~ e : "+ e_);
		/* 
		 * Betwise XOR ^
		 * If bits are different, it's 1. If bits are same, it's 0
		 */
		int j = 12;
		int h = 25;
		int jh = j ^ h;
		System.out.println("bitwise j ^ h : "+ jh);
		/*
		 * Signed left shift <<
		 * The signed left shift operator "<<" shifts a bit pattern to the left
		 * 2 in binary 10, if you do <<1 that would be 100 which is 4
		 * 4 in binary 100, if you do  <<1 that would be 1000 which is 8
		 * In decimal, 150 << 4 = 150 * (2 exp 4)
		 */
		int nbr = 150;
		int nbr_ = nbr << 4;
		System.out.println("nbr << 1 : "+ nbr_);
		/*
		 * Signed right shift
		 * The right shift operator >> shifts a bit pattern to the right by certain number of specified bits.
		 * 4 in binary 100, if we do >> 1 that will be 10 which is 2
		 * in decimal, 212 >> 5 = 212/2 exp 5
		 */
		int nbr2 = 212;
		int nbr2_ = nbr2 >> 5 ;
		System.out.println("nbr >> 1 : "+ nbr2_);
	}

}
