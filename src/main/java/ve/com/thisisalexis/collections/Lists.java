package ve.com.thisisalexis.collections;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lists {

	public static final Logger LOGGER = Logger.getLogger( Lists.class.getName() );
	private List<Integer> listOfNumbers;
	
	public Lists() {
		System.out.println( "Lists Constructor" );
	}
	
	private void setListOfNumbers( Integer[] listOfNumbers ) {
		try {
			List<Integer> newListOfNumbers = new ArrayList<Integer>( Arrays.asList( listOfNumbers ) );
			this.setListOfNumbers( newListOfNumbers );
		} catch ( ArrayIndexOutOfBoundsException e ) {
			LOGGER.warning( "Index out of bound exception in Lists.initializeListOfNumbers()" );
		} catch( Exception e ) {
			LOGGER.warning( "There waas an RuntimeException in Lists.initializeListOfNumbers(" );
		}
	}
	
	public void setListOfNumbers( List<Integer> listOfNumbers ) {
		try {
			this.listOfNumbers = listOfNumbers;
		} catch ( Exception e) {
			LOGGER.warning( "It was not possible to set the value for listOfNumbers in Lists.setListOfNumbers(" );
		}
	}
	
	public List<Integer> getListOfNumbers() {
		try {
			return this.listOfNumbers;
		} catch ( Exception e) {
			return null;
		}
	}
	
	public Integer[] getUniqueNumbers() {
		try {
			Set<Integer> uniqueListOfNumbers = new HashSet<Integer>( this.listOfNumbers );
			return ( Integer[] ) uniqueListOfNumbers.toArray();
		} catch( ClassCastException e ) {
			LOGGER.log( Level.WARNING, "ClassCastException: Error in Lists.makeUnique()", e );
		} catch ( Exception e ) {
			LOGGER.log( Level.WARNING, "Errer in Lists.makeUnique()", e );
		}
		return null;
	}
}
