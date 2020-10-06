package java7;
/**
 * 
 */

/**
 * @author  Arfaoui Hassen
 * @project TestProject
 * @package 
 * 27 juil. 2017
 */
public class Person
{
  private String name;
  private int age;

  public boolean equals(Object anObject)
  {
     if (anObject == null)
         return false;

     /* The object being passed in is checked
         to see it's class type which is then compared
         to the class type of the current class.  If they
         are not equal then it returns false
     */

     else if (getClass( ) != anObject.getClass())
         return false;

     else
     {
        /* 
         this is a downcast since the Object class
         is always at the very top of the inheritance tree
         and all classes derive either directly or indirectly 
         from Object:
        */
        Person aPerson = (Person) anObject;
        return ( name.equals(aPerson.name) 
                && (age == aPerson.age));
     }
  }

}
