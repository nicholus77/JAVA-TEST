/*suma fun
class Reverse {

	public static void main(String[] args) {
	System.out.println(new StringBuilder(" deii kanna").reverse());

	}

}
*/


/*main*/

import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {

    String o;
        Scanner g = new Scanner(System.in);  
        System.out.println("Enter the  WOrd :");
         o=g.nextLine();    
        System.out.println(new StringBuilder(o).reverse());
                                     
    }
}

