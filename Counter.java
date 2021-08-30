
/* NOTE: Some words are not allowed in this file:
   'f o r'  is not allowed
   'w h i l e' is not allowed. 
   You can not even use them in comments!
*/

public class Counter {
	/* TODO: Write a recursive function here. Call it 'printAll'. 
           See README.md to get more instructions, look at Counter.expected to see desired output. 
	   No variable or loops allowed.
	   No calling another builtin/3rd-party function that just solves the problem!
	   You may pass whatever parameters are helpful. 
	*/
	public static void printALL(int n) {
		if (n < 256) {
			if (n == 0) {
				System.out.print("0");
			}

			if (n < 2) {
				System.out.print("0");
			}

			if (n < 4) {
				System.out.print("0");
			}

			if (n < 8) {
				System.out.print("0");
			}

			if (n < 16) {
				System.out.print("0");
			}

			if (n < 32) {
				System.out.print("0");
			}

			if (n < 64) {
				System.out.print("0");
			}

			if (n < 128) {
				System.out.print("0");
			}

			System.out.println(print(n));
			printALL(n + 1);
		}
	}

	public static String print(int n) {
		if (n > 0) {
			return "" + print(n/2) + (n % 2);
		}

		return "";

	}
	
	public static void main(String[] args){
		//TODO: Call `printAll`
		printALL(0);
	}
}
