import java.util.Scanner;

public class Calculator {
	public static double add(double a, double b) {
		return a + b;
	}

	public static double sub(double a, double b) {
		return a - b;
	}

	public static double mul(double a, double b) {
		return a * b;
	}

	public static double div(double a, double b) {
		return a / b;
	}

	public static double mod(double a, double b) {
		return a % b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.ADD");
			System.out.println("2.SUB");
			System.out.println("3.mult");
			System.out.println("4.divid");
			System.out.println("5.module");
			System.out.println("6.EXIT");
			System.out.println("choose the operator :");
			int rc = sc.nextInt();
			if (rc == 6) {
				System.out.println(" Exit!...thank you Dude");
				break;
			}
			System.out.println("Enter a value 1 :");
			double num1 = sc.nextDouble();
			System.out.println("Enter a value 2 :");
			double num2 = sc.nextDouble();
			double reset = 0;
			switch (rc) {
				case 1:
					reset = add(num1, num2);
					break;
				case 2:
					reset = sub(num1, num2);
					break;
				case 3:
					reset = mul(num1, num2);
					break;
				case 4:
					if (num2 == 0) {
						System.out.println("this numbers not divisobal by 0!");
						continue;
					}
					reset = div(num1, num2);
					break;
				case 5:
					reset = mod(num1, num2);
					break;
				default:
					System.out.println("not geting output Sorry..");

			}
			System.out.println("result" + " " + reset);
			System.out.println();
		}
	}

}
