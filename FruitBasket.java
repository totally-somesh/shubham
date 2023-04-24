package FruitBasket;

import Definitions.Mango;
import Definitions.Apple;
import Definitions.Fruit;
import Definitions.Orange;
import java.util.Scanner;

public class FruitBasket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How Many Fruits You Want To Add To Fruit Basket ? ");
		int size = sc.nextInt();

		Fruit[] arr = new Fruit[size];

		int index = 0;
		int choice = 0;

		do {

			System.out.println("Press 1: To Add A Mango  | 2. To Add An Apple  | 3. To Add An Orange | 4. To Stop ");
			//sc.next();
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Please Enter Details Of Mangoes : Name | Colour | Weight | Fresh ");
				Fruit M1 = new Mango(sc.next(), sc.next(), sc.nextDouble(), sc.nextBoolean());
				arr[index] = M1;
				index++;

				break;

			case 2:
				System.out.println("Please Enter Details Of Apples : Name | Colour | Weight | Fresh ");
				Fruit A1 = new Apple(sc.next(), sc.next(), sc.nextDouble(), sc.nextBoolean());
				arr[index] = A1;
				index++;

				break;

			case 3:
				System.out.println(" \nPlease Enter Details Of Oranges : Name | Colour | Weight | Fresh ");
				Fruit O1 = new Orange(sc.next(), sc.next(), sc.nextDouble(), sc.nextBoolean());
				arr[index] = O1;
				index++;

				break;

			default:
				System.out.println(" \nThank You. Please Visit Again ! ");
				break;
			}// switch
		} while (choice != 4);

		System.out.println("You Have In Your Fruit Basket :- ");
		for(Fruit f : arr )
			System.out.println(f);
		
		System.out.println(" \n-: For Checking Specific Functionalities :- ");
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i] instanceof Mango)
			  ((Mango) arr[i]).pulp();
			else if (arr[i] instanceof Apple)
			((Apple)arr[i]).jam();
			else if (arr[i] instanceof Orange)
				((Orange)arr[i]).juice();				
		}
	}
}
