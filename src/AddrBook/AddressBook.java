package AddrBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

	ArrayList<Contact> list = new ArrayList();
	Scanner sc = new Scanner(System.in);
	public void add() {

		System.out.println(" Enter FirstName: ");
		String firstName = sc.next();
		System.out.println(" Enter LastName: ");
		String lastName = sc.next();
		System.out.println("Enter Address: ");
		String address = sc.next();
		System.out.println("Enter City: ");
		String city = sc.next();
		System.out.println("Enter State: ");
		String state = sc.next();
		System.out.println("Enter ZipCode: ");
		long zipCode = sc.nextLong();
		System.out.println("Enter Phone No.: ");
		String phoneNo = sc.next();
		System.out.println("Enter EmailID: ");
		String email = sc.next();

		Contact contact = new Contact(firstName, lastName, address, city, state, zipCode, phoneNo, email);
		list.add(contact);
		System.out.println("Input 1 for storing multiple address");
		int n = sc.nextInt();
		if (n == 1) {
			add();
		} else
			System.out.println("Invalid");
			System.out.println();

	}

	public void editContact(){
	     System.out.println("Enter first name and last name to edit your details");
	     System.out.println("Enter first name");
	     String firstName = sc.next();
	     System.out.println("Enter last name");
	     String lastName = sc.next();
	     for (Contact contact:list){
	      if(contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)){
	    	  contact.print();
	         contact.editExistingContact();
	      }
	     }
	    }
	public void deleteContact(){
		if (list.size() == 0) {
			System.out.println("No Record Found !!!!!!");
		} else {
        System.out.println("Enter first name :");
        String firstName = sc.next();

        for (int i = 0; i < list.size(); i++) {
			Contact contact = list.get(i);
			if (firstName.equals(contact.firstName)) {
				list.remove(i);
				System.out.println("Deleted Successfully !!!");
			}
		}
		}
    }
	public void show(){
		System.out.println(list.size());
		if (list.size() == 0) {
			System.out.println("No Record Found !!!!!!");
		} else {
			for (int i = 0; i < list.size(); i++) {
				Contact contact = list.get(i);
				System.out.println(list.get(i));
				System.out.println("");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book\n");
		AddressBook addressBook = new AddressBook();

		int input;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println(" Enter 1 for Add Contact");
			System.out.println(" Enter 2 for Update Contact ");
			System.out.println(" Enter 3 for DeleteContact");
			System.out.println(" Enter 4 for showing");

			input = sc.nextInt();
			switch (input) {
			case 1:
				addressBook.add();
				System.out.println(addressBook.list);
				System.out.println("Contact Added Successfully");
				System.out.println();
				break;
			case 2:
				addressBook.editContact();
			     System.out.println(addressBook.list);
				break;
			case 3:
				 addressBook.deleteContact();
			     System.out.println(addressBook.list);
				break;

			case 4:
				System.out.println("");

				addressBook.show();
				break;

			case 5:
				System.exit(0);
			}

		}



	}

}
