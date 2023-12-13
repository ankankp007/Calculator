package calculate;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter your Choise : ");
		char ch = obj.next().charAt(0);
		
		System.out.print("X : ");
		int x = obj.nextInt();
		System.out.print("Y : ");
		int y = obj.nextInt();

		int res = 0;
		switch (ch) {
			case '+':
				res = x + y;
				break;
			case '-':
				res = x - y;
				break;
			case '*':
				res = x * y;
				break;
			case '/':
				res = x / y;
				break;
			default:
				System.out.println("Wrong Choise");
				break;
		}
		// switch (ch) {
		// 	case 1:
		// 		res = x + y;
		// 		break;
		// 	case 2:
		// 		res = x - y;
		// 		break;
		// 	case 3:
		// 		res = x * y;
		// 		break;
		// 	case 4:
		// 		res = x / y;
		// 		break;
		// 	default:
		// 		System.out.println("Wrong Choise");
		// 		break;
		// }
		// if(ch == 1) {
		// 		res = x + y;
		// } else if(ch == 2) {
		// 		res = x - y;
		// } else if(ch == 3) {
		// 		res = x * y;
		// } else if(ch == 4) {
		// 		res = x / y;
		// }
		System.out.println("Result : " + res);

	}
}
