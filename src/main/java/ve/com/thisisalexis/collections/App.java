package ve.com.thisisalexis.collections;

import java.util.List;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the collections project!" );
        App.testListsClass();
    }
    
    private static void testListsClass() {
    	int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    	List<Integer> listOfNumbers = new ArrayList<Integer>();
    	
    	for(int i = 0; i < integers.length; i++ ) {
    		listOfNumbers.add( new Integer( integers[ i ] ) );
    	}
    	
    	Lists lists = new Lists();
    	lists.setListOfNumbers( listOfNumbers );
    }
}
