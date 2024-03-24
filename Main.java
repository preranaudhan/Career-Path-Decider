package Practice1;
import java.util.*;
public class Main{
	Scanner sc=new Scanner(System.in);
	Node head_acc;
	class Node{
		int accNo;
		int bal;
        String name,add;
        Node next;
        
        Node(String name,int accNo,int bal,String add){
        	this.next = null;
        	this.name=name;
        	this.accNo=accNo;
        	this.bal=bal;
        	this.add=add;
        }
	}
	public void create() {
		
		System.out.println("\nEnter number of accounts you want to create = ");
		int n=sc.nextInt();
		int i=1;
		do {
		    sc.nextLine();
		    System.out.println("\nEnter details of customer No. "+i);
			System.out.println("\nEnter Account Holder Name :");
			String name=sc.nextLine();
			System.out.println("Enter Account Holder Address :");
			String add=sc.nextLine();
			System.out.println("Enter Account Number :");
			int accNo= sc.nextInt();
			System.out.println("Enter Account Balance(in Rs) :");
			int bal=sc.nextInt();
			Node new_acc=new Node(name,accNo,bal,add);
			Node temp_acc=head_acc;
			if(head_acc==null) {
				head_acc=new_acc;
			}
			else {
				while(temp_acc.next!=null) {
					temp_acc=temp_acc.next;
				}
				temp_acc.next=new_acc;
				new_acc=head_acc;
			}
			i++;
		}while(i<=n);	
			}
	public void display() {
	    System.out.println("\nBANK CUSTOMER DETAILS : ");
		Node temp_acc=head_acc;
		int i=1;
		if(head_acc==null) {
			System.out.println("ACCOUNT LIST IS EMPTY");
		}
		else {
			while(temp_acc!=null) {
			    System.out.print("\nDetails of customer No. "+i);
				System.out.print("\nAccount Holder Name : "+temp_acc.name+"\nAccount Holder Address : "+temp_acc.add+"\nAccount Number : "+temp_acc.accNo+"\nAccount Balance(in Rs) : "+temp_acc.bal+"\n");
				temp_acc=temp_acc.next;
				i++;
			}
		}
	}
	
	public void search(){
	    if(head_acc==null){
	        System.out.println("\nAccount List is EMPTY.");
	    }
	    else{System.out.println("\nEnter Account Number : ");
	    int acc=sc.nextInt();
	    Node temp_acc=head_acc;
	    if(head_acc==null){
	        System.out.println("Account List is EMPTY.");
	    }
	    else {
	    	if(temp_acc!=null){
	    	  if(acc==temp_acc.accNo) {
	    		  System.out.print("\nDetails of Account Number="+acc+" : ");
	    		  System.out.print("\nAccount Holder Name : "+temp_acc.name+"\nAccount Holder Address : "+temp_acc.add+"\nAccount Number : "+temp_acc.accNo+"\nAccount Balance(in Rs) : "+temp_acc.bal+"\n");
	    		  return;}
	    	  else {
	            temp_acc=temp_acc.next;}
	    }
	    	System.out.println("Account number not found.");}
	}}
	
	public void add_new(){
	    System.out.println("\nEnter number of accounts you want to add = ");
		int n=sc.nextInt();
		int i=0;
		do {
		    sc.nextLine();
			System.out.println("\nEnter Account Holder Name :");
			String name=sc.nextLine();
			System.out.println("Enter Account Holder Address :");
			String add=sc.nextLine();
			System.out.println("Enter Account Number :");
			int accNo= sc.nextInt();
			System.out.println("Enter Account Balance(in Rs) :");
			int bal=sc.nextInt();
			Node new_acc=new Node(name,accNo,bal,add);
			Node temp_acc=head_acc;
			System.out.println("Enter the position where u want to add "+name+ "'s details : ");
		    int pos=sc.nextInt();
			if(head_acc==null) {
				head_acc=new_acc;
			}
			else {
			    int j=1;
			    Node prev_acc=null;
				while(j<pos) {
				    prev_acc=temp_acc;
					temp_acc=temp_acc.next;
					j++;
				}
				new_acc.next=temp_acc;
				prev_acc.next=new_acc;
				System.out.println("New account is inserted at "+pos+" position ");
			}
			i++;
		}while(i<n);
	}
	
	public void delete(){
	    System.out.println("Enter Account number you want to delete : ");
	    int acc=sc.nextInt();
	      if(head_acc==null)
		  {
			  System.out.println("Account List is EMPTY.");
		  }
		  else 
		  {
				  Node curr_acc=head_acc;
				  Node prev_acc=null;
				  
				  if((head_acc==curr_acc)&& (acc==curr_acc.accNo) ) 
				  {
						  head_acc=curr_acc.next;
						  curr_acc=null;
						  System.out.println("Account deleted successfully.");
				  }
				  
				  else 
				  {
					  while(acc!=curr_acc.accNo)
					  {
						  prev_acc=curr_acc;
						  curr_acc=curr_acc.next;
					  }
					  
					  prev_acc.next=curr_acc.next;
					  curr_acc=null;
					  System.out.println("Account deleted successfully.");
				  }
			}}
	
	public void deposit(){
	    System.out.println("Enter the account number : ");
	    int acc=sc.nextInt();
	    System.out.println("Enter the amount to deposit : ");
	    int amt=sc.nextInt();
	    Node curr_acc=head_acc;
	    while(acc!=curr_acc.accNo){
	        curr_acc=curr_acc.next;
	    }
	    curr_acc.bal+=amt;
	    System.out.println("Amount deposited successfully.");
	    System.out.println(curr_acc.name+" has current account balance of rupees "+curr_acc.bal+" only");
	}
	
	public void withdraw(){
	    System.out.println("Enter the account number : ");
	    int acc=sc.nextInt();
	    System.out.println("Enter the amount to withdraw : ");
	    int amt=sc.nextInt();
	    Node curr_acc=head_acc;
	    while(acc!=curr_acc.accNo)
		{
			curr_acc=curr_acc.next;
		}
		if(amt>curr_acc.bal)
		{
		    System.out.println(amt+" is greater than "+curr_acc.name+"'s current balance.\nTRY AGAIN");
		}
		else
		{
		  curr_acc.bal-=amt;
		  System.out.println("Amount withdrawn successfully");
		  System.out.println(curr_acc.name+" has current account balance of rupees "+curr_acc.bal+" only");
		}
	}
	public static void main(String args[]) {
	    Scanner sc=new Scanner(System.in);
		Main accList=new Main();
		int ch=0;
		do{
		    System.out.print("\nMENU\n0.EXIT\n1.Create new account\n2.Display details of all customers\n3.Search a particular customer\n4.Add a new member\n5.Delete a particular account\n6.Deposit amount\n7.Withdraw amount\n\nENTER YOUR CHOICE : ");
		    ch=sc.nextInt();
		    switch(ch){
		        case 0:
		            break;
		        case 1:
		            accList.create();
		            break;
		        case 2:
		            accList.display();
		            break;
		        case 3:
		            accList.search();
		            break;
		        case 4:
		            accList.add_new();
		            break;
		        case 5:
		            accList.delete();
		            break;
		        case 6:
		            accList.deposit();
		            break;
		        case 7:
		            accList.withdraw();
		            break;
		        default:
		            System.out.println("INVALD CHOICE");
		    }
		    }while(ch!=0);
		    System.out.println("\n*****THANK YOU!*****");
		    }}