
/**
 * A class to test passing parameters by value and reference.
 *
 * @author Michael Buescher for APCS-A @ HB
 * @version 2019.11.06
 */
public class ParameterTest
{
    public static void changeThings (int n, String str, Book b)
    {
        System.out.println ("Beginning of method changeThings: ");
        System.out.println ("n = \t " + n);
        System.out.println ("str = \t " + str);
        System.out.println ("b = \t " + b + " on page " + b.getCurrentPage());
        System.out.println ();
        
        n = 200;
        str = "I am changed!";
        b.setCurrentPage (105);
        
        System.out.println ("End of method changeThings: ");
        System.out.println ("n = \t " + n);
        System.out.println ("str = \t " + str);
        System.out.println ("b = \t " + b + " on page " + b.getCurrentPage());
        System.out.println ();
       
    }
    
    
    public static void main (String[] args)
    {
        int myNumber = 17;
        String myString = "Happy Birthday!";
        Book myBook = new Book ("A Confederacy of Dunces", 
           "John Kennedy Toole", 1980, 402);
         
        System.out.println ("In main, BEFORE call to changeThings: ");
        System.out.println ("myNumber = \t " + myNumber);
        System.out.println ("myString = \t " + myString);
        System.out.println ("myBook = \t " + myBook + " on page " + myBook.getCurrentPage());
        System.out.println ();
         
        changeThings (myNumber, myString, myBook);
        
        System.out.println ("In main, AFTER call to changeThings: ");
        System.out.println ("myNumber = \t " + myNumber);
        System.out.println ("myString = \t " + myString);
        System.out.println ("myBook = \t " + myBook + " on page " + myBook.getCurrentPage());
        System.out.println ();
           
    }
}
