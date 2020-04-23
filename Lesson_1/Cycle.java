public class Cycle{

	public static void main(String[] args) {
		{
		for (int i = 0; i <= 20; i++) {
		System.out.println (i);
		} System.out.println (" ");
		}

		{
		int i = 6;
		while (i >= -6) {
		System.out.println(i);
		i = i - 2; } 
		System.out.println (" ");
		}

		{
		int a = 10;
		int sum = 0;

		do {
			sum = a % 2 == 1 ? sum + a : sum;
			a++;
			}
		while ( a < 20);
		System.out.println("Сумма чисел: " + sum);
				} System.out.println (" ");
			}
		}