import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// знайти максимальне число з клавіатури
		System.out.print("Введіть будь-яке ціле число: ");
		Scanner scan = new Scanner(System.in);
		int firstNum = scan.nextInt();
		System.out.print("Введіть будь-яке ціле число: ");
		int secondNum = scan.nextInt();
		System.out.print("Введіть будь-яке ціле число: ");
		int thirdNum = scan.nextInt();
		System.out.print("Введіть будь-яке ціле число: ");
		int fourthNum = scan.nextInt();
		int max = firstNum;
		if (secondNum > max) {
			max = secondNum;
		}
		if (thirdNum > max) {
			max = thirdNum;
		}
		if (fourthNum > max) {
			max = fourthNum;
		}
		System.out.println("max number =" + max);

		System.out.println("----------------------");

		// девятиповерховий будинок у якому 5 підїздів,
		// номер підїзду починається з 1
		// на одному поверсі 4 квартири
		// вивести на якому поверсі якого підїзду
		// знаходиться квартира
		// номер кв з клавіатури
		System.out.println("введіть номер квартири: ");
		int kvartira = scan.nextInt();
		int podjezd = (kvartira - 1) / 36 + 1;
		int etaj = (kvartira - 36 * (podjezd - 1) - 1) / 4 + 1;
		if (kvartira > 0 && podjezd < 145) {
			System.out.println("Вам треба у " + podjezd + " під'їзд");
			System.out.println("На " + etaj + " поверх");
		} else {
			System.out.println("Такої квартири не існує");
		}

		System.out.println("----------------------");

		// чи існує трикутник?
		// дві сторони повинні бути більше 3ї
		System.out.println("Введіть першу сторону трикутника: ");
		double a = scan.nextInt();
		System.out.println("Введіть другу сторону трикутника: ");
		double b = scan.nextInt();
		System.out.println("Введіть третю сторону трикутника: ");
		double c = scan.nextInt();
		if ((a + b > c) || (a + c > b) || (c + b > a)) {
			System.out.println("Такий трикутник існує");
		} else {
			System.out.println("Такого трикутника НЕ існує");
		}
	}

}
