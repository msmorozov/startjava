public class Calculator {
	public static void main(String[] args) {
		int first = 3;
		int second = 3;
		char end = '^';

		if (end == '+') {
			int sum = first + second;
			System.out.println(sum);
		} else if (end == '-') {
			int min = first - second;
			System.out.println (min);
		} else if (end == '*') {
			int mult = first * second;
			System.out.println (mult);
		} else if (end == '/') {
			int div = first / second;
			System.out.println (div);
		} else if (end == '%') {
			int whole = first % second;
			System.out.println (whole);
		} else if (end == '^') {
			int result = first;
			for (int i = 1; i < second; i++ ) {
			result = result * first;
		}
			System.out.println (result);
		}
	}
}