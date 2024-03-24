package careerPathDecider;

import java.util.*;

public class Tree {

	Scanner sc = new Scanner(System.in);
	Node root1 = null;
	Node root2 = null;
	Node root3 = null;
	Node root4 = null;

	class Node {
		String data;
		Node left, right;
		Node right2, left2;

		Node(String data) {
			this.data = data;
			right = null;
			left = null;
			right2 = null;
			left2 = null;
		}
	}

	void creationOfTechTree() {
		Node newnode = new Node("Technology");
		root1 = newnode;
		Node newnode2 = new Node("Static");
		Node newnode3 = new Node("Dynamic");
		Node curr1 = root1;
		curr1.left = newnode2;
		curr1.right = newnode3;
		Node newnode4 = new Node("9-5");
		Node newnode5 = new Node("24/7");
		Node curr2 = curr1.left;
		curr2.left = newnode4;
		curr2.right = newnode5;
		Node newnode6 = new Node("Engineer and Teacher");
		Node curr3 = curr2.left;
		curr3.left = newnode6;
		Node newnode7 = new Node("Enterpenurship");
		Node curr4 = curr2.right;
		curr4.left = newnode7;
		Node newnode8 = new Node("Crack UPSC and become IAS,IRMS,IFS");
		Node curr5 = curr1.right;
		curr5.left = newnode8;

	}

	void Traversal1() {
		Node ptr = root1;
		System.out.println("User which workplace would you like to work in:");
		System.out.println("Enter 1 for static and 2 for dynamic:");
		int opt = sc.nextInt();
		if (opt == 1) {
			ptr = ptr.left;
			System.out.println("User which timing would you prefer:");
			System.out.println("Enter 1 for work-life balance(9-5):");
			System.out.println("Enter 2 for adventrous life(24/7):");
			int choice = sc.nextInt();

			if (choice == 1) {
				ptr = ptr.left;
				System.out.println("Your suggested career is:");
				System.out.println(ptr.left.data);

			} else if (choice == 2) {
				ptr = ptr.right;
				System.out.println("Your suggested career is:");
				System.out.println(ptr.left.data);

			} else {
				System.out.println("Invalid choice");
			}
		} else {
			ptr = ptr.right;
			System.out.println(ptr.left.data);

		}

	}

	void creationOfMedTree() {
		Node newnode = new Node("Medical");
		root2 = newnode;
		Node newnode2 = new Node("Static");
		Node newnode3 = new Node("Dynamic");
		Node curr1 = root2;
		curr1.left = newnode2;
		curr1.right = newnode3;
		Node newnode4 = new Node("9-5");
		Node newnode5 = new Node("24/7");
		Node curr2 = curr1.left;
		curr2.left = newnode4;
		curr2.right = newnode5;
		Node newnode6 = new Node("Government Or PrivateJob");
		Node curr3 = curr2.left;
		curr3.left = newnode6;
		Node newnode7 = new Node("Emergency Wadron");
		Node curr4 = curr2.right;
		curr4.left = newnode7;
		Node newnode8 = new Node("Crack UPSC and become IAS,IRMS,IFS");
		Node curr5 = curr1.right;
		curr5.left = newnode8;

	}

	void Traversal2() {
		Node ptr = root2;
		System.out.println("User which workplace would you like to work in:");
		System.out.println("Enter 1 for static and 2 for dynamic:");
		int opt = sc.nextInt();
		if (opt == 1) {
			ptr = ptr.left;
			System.out.println("User which timing would you prefer:");
			System.out.println("Enter 1 for work-life balance(9-5):");
			System.out.println("Enter 2 for adventrous life(24/7):");
			int choice = sc.nextInt();

			if (choice == 1) {
				ptr = ptr.left;
				System.out.println("Your suggested career is:");
				System.out.println(ptr.left.data);

			} else if (choice == 2) {
				ptr = ptr.right;
				System.out.println("Your suggested career is:");
				System.out.println(ptr.left.data);

			} else {
				System.out.println("Invalid choice");
			}
		} else {
			ptr = ptr.right;
			System.out.println(ptr.left.data);

		}

	}

	void creationOfMathTree() {
		Node newnode = new Node("Maths");
		root3 = newnode;
		Node newnode2 = new Node("Static");
		Node newnode3 = new Node("Dynamic");
		Node curr1 = root3;
		curr1.left = newnode2;
		curr1.right = newnode3;
		Node newnode4 = new Node("9-5");
		Node newnode5 = new Node("24/7");
		Node curr2 = curr1.left;
		curr2.left = newnode4;
		curr2.right = newnode5;
		Node newnode6 = new Node("Corporate");
		Node curr3 = curr2.left;
		curr3.left = newnode6;
		Node newnode7 = new Node("ownSetup");
		Node curr4 = curr2.right;
		curr4.left = newnode7;
		Node newnode8 = new Node("Lawyer");
		Node curr5 = curr1.right;
		curr5.left = newnode8;

	}

	void Traversal3() {
		Node ptr = root3;
		System.out.println("User which workplace would you like to work in:");
		System.out.println("Enter 1 for static and 2 for dynamic:");
		int opt = sc.nextInt();
		if (opt == 1) {
			ptr = ptr.left;
			System.out.println("User which timing would you prefer:");
			System.out.println("Enter 1 for work-life balance(9-5):");
			System.out.println("Enter 2 for adventrous life(24/7):");
			int choice = sc.nextInt();

			if (choice == 1) {
				ptr = ptr.left;
				System.out.println("Your suggested career is:");
				System.out.println(ptr.left.data);

			} else if (choice == 2) {
				ptr = ptr.right;
				System.out.println("Your suggested career is:");
				System.out.println(ptr.left.data);

			} else {
				System.out.println("Invalid choice");
			}

		} else {
			ptr = ptr.right;
			System.out.println(ptr.left.data);

		}

	}

	void creationOfCreativityTree() {
		Node newnode = new Node("Creativity");
		root4 = newnode;
		Node newnode2 = new Node("Static");
		Node newnode3 = new Node("Dynamic");
		Node curr1 = root4;
		curr1.left = newnode2;
		curr1.right = newnode3;
		Node newnode4 = new Node("9-5");
		Node newnode5 = new Node("24/7");
		Node curr2 = curr1.left;
		curr2.left = newnode4;
		curr2.right = newnode5;
		Node newnode6 = new Node("teacher");
		Node curr3 = curr2.left;
		curr3.left = newnode6;
		Node newnode7 = new Node("Architecture");
		Node curr4 = curr2.right;
		curr4.left = newnode7;
		Node newnode8 = new Node("Historian");
		Node curr5 = curr1.right;
		curr5.left = newnode8;

	}

	void Traversal4() {
		Node ptr = root4;
		System.out.println("User which workplace would you like to work in:");
		System.out.println("Enter 1 for static and 2 for dynamic:");
		int opt = sc.nextInt();
		if (opt == 1) {
			ptr = ptr.left;
			System.out.println("User which timing would you prefer:");
			System.out.println("Enter 1 for work-life balance(9-5):");
			System.out.println("Enter 2 for adventrous life(24/7):");
			int choice = sc.nextInt();

			if (choice == 1) {
				ptr = ptr.left;
				System.out.println("Your suggested career is:");
				System.out.println(ptr.left.data);

			} else if (choice == 2) {
				ptr = ptr.right;
				System.out.println("Your suggested career is:");
				System.out.println(ptr.left.data);

			} else {
				System.out.println("Invalid choice");
			}

		} else {
			ptr = ptr.right;
			System.out.println(ptr.left.data);

		}
	}

}
