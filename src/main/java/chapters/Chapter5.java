package chapters;

public class Chapter5 {
	
	private static void fivepoint1() {
		System.out.println("Hello ");
		System.out.println("How are you?");
		
		//Print next to each other
		System.out.print("Hello ");
		System.out.print("How are you?");
		System.out.println();
		
		int number = 30;
		System.out.println(number);
		System.out.println(30+5);
		System.out.println("Oracle".substring(1,4));
		
		//Concatenate 
		System.out.println("Hello, "+ "how are you?" + " I love Java.");
		
		int results = 79;
		System.out.println("YOu scored " + results + " marks for your test.");
		
		System.out.println("The sum of 50 and 2 is "+ (50 + 2) + ".");
	}
	
	private static void fivepoint2() {
		//(\t) print a tab
		System.out.println("Hello\tWorld");
		// (\n) prints a new line
		System.out.println("Hello\nWorld");
		
		// ("\\") print blackslash
		System.out.println("\\");
		
		//(\") double quotes doesn't end String
		System.out.println("I'am 5'9\" tall");
	}
	
	private static void fivepoint3() {
		System.out.println("The anseer for 5.45 divided by 3 is " + (5.45/3));
		
		//printf users format specifiers
		//percentage then followed with converter f or d (float or double), between % and d or f is the flag 
		System.out.printf("The answer for %.3f devided by %d is %.2f.",5.45,3,5.45/3);
		System.out.println();
		
		//d converter formatting integers such as byte,short,int and long
		System.out.printf("%d",12);
		System.out.println();
		
		//These statement will give errors 
			//System.out.printf("%d",12.9);
			//System.out.printf("%f",12);
		
		//new line: n
		System.out.printf("%d%n%d",12,3);
		System.out.println();
		
		//width flag
		System.out.printf("%8d",12);
		System.out.println();
		
		System.out.printf("%8.2f",12.4);
		System.out.println();
		
		//The thousands separator flag (,)
		System.out.printf("%,.2f",12345.56789);
	}

	public static void main(String[] args) {
		//fivepoint1();
		//fivepoint2();
		fivepoint3();
	}

}
