package AddrBook;

import java.util.Scanner;

public class Contact {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	long zipCode;
	String phoneNo;
	String email;
	Scanner sc = new Scanner(System.in);

	public Contact(String firstName, String lastName, String address, String city, String state, long zipCode,
			String phoneNo, String email) {
		this.firstName = firstName; // Constructor
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	@Override
    public String toString() {
        return "Added New Contact: " +
                " \nFirstName = " + firstName +
                " \nLastName = " + lastName +
                " \nAddress = " + address +
                " \nCity = " + city +
                " \nState = " + state +
                " \nZipCode = " + zipCode +
                " \nPhoneNo = " + phoneNo +
                " \nEmail = " + email ;
	}

	public void print() {
		System.out.println("First Name: " + firstName + "\nLast Name: " + lastName + "\nAddress: " + address
				+ "\nCity:" + city + "\nState: " + state + "\nZip: " + zipCode + "\nContact number:" + phoneNo
				+ "\nEmail ID:" + email + "\n");
	}

	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void remove() {
    	System.out.println("Deleted Contact Details SuccessFully");
    }

    public void editExistingContact(){
        System.out.println("Enter firstname");
        firstName = sc.next();
        System.out.println("Enter lastname");
        lastName = sc.next();
        System.out.println("Enter address");
        address =  sc.next();
        System.out.println("Enter city");
        city = sc.next();
        System.out.println("Enter state");
        state = sc.next();
        System.out.println("Enter zip code");
        zipCode = sc.nextInt();
        System.out.println("Enter your phone number");
        phoneNo = sc.next();
        System.out.println("Enter email");
        email = sc.next();
    }



}
