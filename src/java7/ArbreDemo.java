package java7; /**
 *
 */

/**
 * @author Arfaoui Hassen
 * @project TestProject
 * @package
 *          22 nov. 2017
 */
public class ArbreDemo
{
	public static void main( String[] args )
	{
		new ArbreDemo().doForNoeud();
	}
	void doForNoeud(){
		Noeud n1 = new Noeud( "1" );
		Noeud n2 = new Noeud( "2" );
		Noeud n3 = new Noeud( "3" );
		Noeud n4 = new Noeud( "4" );
		Noeud n5 = new Noeud( "5" );
		Noeud n6 = new Noeud( "6" );
		Noeud n7 = new Noeud( "7" );
		Noeud n8 = new Noeud( "8" );
		Noeud n9 = new Noeud( "9" );
		Noeud n10 = new Noeud( "10" );
		Noeud n11 = new Noeud( "11" );
		Noeud n12 = new Noeud( "12" );
		Noeud n13 = new Noeud( "13" );
		//
		n1.setLeft( n2 );
		n1.setRight( n3 );
		n2.setLeft( n4 );
		n2.setRight( n5 );
		n4.setRight( n8 );
		n3.setLeft( n6 );
		n3.setRight( n7 );
		n6.setLeft( n9 );
		n6.setRight( n10 );
		n10.setLeft( n12 );
		n10.setRight( n13 );
		n7.setLeft( n11 );
		//
		System.out.println("\nParcours préfixe : ");
        n1.prefixe();
        System.out.println("\nParcours infixe : ");
        n1.infixe();
	}
}

class Noeud{
	String name;
	Noeud left,right;
	public Noeud( String name)
	{
		this.name = name;
	}
	public void prefixe(){
		System.out.println(name+" - ");
		if(left != null){
			left.prefixe();
		}
		if(right != null) {
			right.prefixe();
		}
	}
	public void infixe(){
        if(left != null) {
        	left.infixe();
        }
        System.out.print(name+" - ");
        if(right != null) {
        	right.infixe();
        }
    }
	public Noeud getLeft()
	{
		return left;
	}
	public void setLeft( Noeud left )
	{
		this.left = left;
	}
	public Noeud getRight()
	{
		return right;
	}
	public void setRight( Noeud right )
	{
		this.right = right;
	}
}

class Tree<T>{
	T val;
	Tree<T> enfants;
	Tree(T val){
		this.val = val;
	}
	Tree(T val, Tree<T> enfants){
		this.val = val;
		this.enfants = enfants;
	}
}
