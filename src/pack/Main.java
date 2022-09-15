package pack;

public class Main {

	public static void main(String[] args) {
		// площа трикутника по відомим сторонам(Герон)
		double sideA = 0.3;
		double sideB = 0.4;
		double sideC = 0.5;
		double poluPerimetr = (sideA + sideB + sideC) / 2;
		double S = Math.sqrt(poluPerimetr * (poluPerimetr - sideA) * (poluPerimetr - sideB) * (poluPerimetr - sideC));
		System.out.println("Area of triangle = " + S);

		// скільки треба заплатити за яблука?
		int price = 2;
		int countApples = 6;
		int res = price * countApples;
		System.out.println("U need to pay " + res + "$");

		// яка вартість поїздки?
		double gasPrice = 1.2;
		double rashodNaKm = 0.08;
		int distance = 120;
		double litre = rashodNaKm * distance;
		System.out.println("Trip price " + litre * gasPrice + "$");
	}

}
