package java7;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *  The queue orders elements FIFO (first-in-first-out). 
 *  The head of the queue is that element that has been on the queue the longest time. 
 *  The tail of the queue is that element that has been on the queue the shortest time. 
 *  New elements are inserted at the tail of the queue, and the queue retrieval operations obtain elements at the head of the queue
 */

/**
 * @author Arfaoui Hassen
 * @project TestProject
 * @package
 *          22 nov. 2017
 */
public class QueueDemo
{
	public static void main( String[] args )
	{
		new QueueDemo().exploreConcurrentLinkedQueue();
		//new QueueDemo().exploreLinkedList();
	}
	void exploreConcurrentLinkedQueue(){
		Queue<Integer> q = new ConcurrentLinkedQueue<Integer>();
		q.add( 4 ); // The head of the queue
		q.add( 1 );
		q.add( 7 );
		q.add( 20 ); //The tail of the queue
		//System.out.println(q.peek()); //return the head of the queue but doesn't remove it
		System.out.println(q.poll()); //return and remove the head of the queue
		System.out.println(q.poll());
		System.out.println("--------------");
		Iterator<Integer> it = q.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	void exploreLinkedList(){
		Queue<String> q = new LinkedList<String>();
		q.add( "z" );
		q.add( "g" );
		q.add( "a" );
		q.add( "c" );
		System.out.println(q.peek()); //return the head of the queue but doesn't remove it
		System.out.println(q.poll()); //return and remove the head of the queue
		Iterator<String> it = q.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
