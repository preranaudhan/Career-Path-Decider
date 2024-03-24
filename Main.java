package careerPathDecider;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Tree obj1 = new Tree();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age>15)
		{
			System.out.println("Sorry you are not in agegroup for the test");
			return;
		}

		int choice2 = 1;
		do {
			System.out.println("*******************************************************");
			System.out.println("WELCOME TO CAREER GUIDANCE APPLICATION");

			System.out.println("Choose a field which interests you the most:");

			System.out.println("Fields Are:\n" + "1. Technical problem Solver And Computational Thinker\n"
					+ "2. Medical Practioner And Physiotherapist\n" + "3. Economic Analyst And Legal Consultant\n"
					+ "4. Architectural Designer And Love To Travelling");
			System.out.println("*******************************************************");

			System.out.println("Enter Your Choice");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				obj1.creationOfTechTree();
				obj1.Traversal1();

				break;

			case 2:

				obj1.creationOfMedTree();
				obj1.Traversal2();

				break;

			case 3:
				obj1.creationOfMathTree();
				obj1.Traversal3();

				break;

			case 4:
				obj1.creationOfCreativityTree();
				obj1.Traversal4();
				break;

			default:

				System.out.println("Invalid Choice");

			}
			System.out.println("\nEnter 1 if you want to continue:");
			choice2 = sc.nextInt();
		} while (choice2 == 1);

	}

}
