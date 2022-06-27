import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DoubleLinkedListSorted list = new DoubleLinkedListSorted();
		Scanner input = new Scanner(System.in);
		list.Add(10);
		list.Add(20);
		list.Add(40);
		list.Add(60);
		list.Add(50);
		list.Add(30);
		list.Add(25);
		list.Add(6);
		int choice, number;
		do {
			System.out.println("1 - add in the list");
			System.out.println("2 - Show the list");
			System.out.println("3 - take from beginning");
			System.out.println("4 - take from the end");
			System.out.println("5 - search for a number");
			System.out.println("6 - get the size of the list");
			System.out.println("7 - verify if the list is empty");
			System.out.println("0 - exit");
			System.out.println("pick an option");
			choice = input.nextInt();
			if (choice < 0 || choice > 7) {
				System.out.println("invalid option");
			} else {
				switch (choice) {
				case 1:
					System.out.println("What number go in?");
					number = input.nextInt();
					list.Add(number);
					break;
				case 2:
					if (list.Empty()) {
						System.out.println("The list is empty");
					} else {
						list.Show();
					}
					break;
				case 3:
					if (list.Empty()) {
						System.out.println("The list is empty");
					} else {
						list.takeFromBeginning();
					}
					break;
				case 4:
					if (list.Empty()) {
						System.out.println("The list is empty");
					} else {
						list.takeFromEnd();
					}
					break;
				case 5:
					System.out.println("What number are you searching for?");
					number = input.nextInt();
					list.search(number);
					break;
				case 6:
					System.out.println(list.getSize());
					break;
				case 7:
					System.out.println(list.Empty());
					break;
				}
			}

		} while (choice != 0);
	}
}
