public class ConditionalStatement 
{
	public static void main(String[] args) 
	{
		int age = 21;
		String men = "выМужскогоПола";
		String woman = "выНеМужскогоПола";
		int high = 1.80;
		String your_name = "M";

		if (age > 20) {
			System.out.println("Вы прожили 20% своей жизни");
			}
		if (men == "выМужскогоПола") {
			System.out.println("Ты Мужик!");
		}
		if (woman == "выНеМужскогоПола") {
			System.out.println("Ты Женщина!");
		}
		if (high <= 1.80) {
			System.out.println("У тебя средний рост");
		} 
			else if (high >= 1.80) {
			System.out.println("Жованный крот, что там за облаками?");
			}
		if (your_name == "M") {
			System.out.println("Мойша? Максим? Миииша? Маша?");
		} 
			else if (your_name == "И") {
			System.out.println ("Ира? Игнатий? Инга?");
			}
			else {
			System.out.println ("Ну хз как звать то тебя теперь");
			}
	}
}