public class MyFirstGame {
	public static void main(String[] args) {
		long rangeBegin = 0L;
		long rangeEnd = 100L;
		long currentTime = System.currentTimeMillis();
		long randomNumber = rangeBegin + currentTime % (rangeEnd - rangeBegin);
		int my_num = 100;

		System.out.println ("Угадайте рандомное число от 1 до 100, которое задумал компьютер.");

		while (randomNumber < my_num) {
		System.out.println (my_num);
		System.out.println ("Загаданное число меньше того, что загадал компьютер");
		my_num --;
		} 

		while (randomNumber > my_num) {
		System.out.println (my_num);
		System.out.println ("Введеное Вами число больше того, что загадал компьютер");
		my_num ++;
		} 
		
		System.out.println ("Вы угадали, число ");
		System.out.println (my_num);
	}
}