import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("What is the first integer?");
		int n1 = in.nextInt();
		System.out.println("What is the second integer?");
		int n2 = in.nextInt();
		double output = (n1 + n2)/ 2.0;
		System.out.println("The average of these 2 integers is: " + output + " ");

	}

}
