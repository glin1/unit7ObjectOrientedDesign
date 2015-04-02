/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1= new Card ("8","clubs",8);
		Card card2= new Card ("7","clubs",7);
		Card card3= new Card ("4","heart",4);
		
		System.out.println("It should be rank 8 , suit clubs, value 8");
		card1.rank();
		card1.suit();
		card1.pointValue();
	}
	
	
}