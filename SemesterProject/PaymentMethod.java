package JavaOOP.SemesterProject;

import java.util.Scanner;
public class PaymentMethod {

    public void PayMethod() {
        Scanner input = new Scanner(System.in);
        System.out.println("How do you want to pay the bill?\n1) Online Payment\n2) Cash ");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.print("Enter your Credit Card Number: ");
            String CreditCard = input.next();
            System.out.print(CreditCard);
		    System.out.print(isCCValid(CreditCard)? " is valid." : " is invalid. Try Again!");
            System.out.println();
            if (!isCCValid(CreditCard)) {
                PayMethod();
            }
            else {
                System.out.print("Payment Successful. Thank you!");
            }     
        }
        else if (choice == 2) {
            System.out.print("Thank you for visiting!");
        }
        input.close();
    }
	public boolean isCCValid(String number) {
		boolean valid = false;
		int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		if ((sum % 10 == 0) && (prefixMatched(number)) && (getSize(number))) 
			valid = true;
		else
			valid = false;
		return valid;		
	}
	//method to get sum of even places
	public int sumOfDoubleEvenPlace(String number) {
		int sum = 0;
		 for (int i = number.length() - 2; i >= 0; i -= 2) {
		      int digit = Character.digit(number.charAt(i),10);
		      //getDigit method is invoked to break two digit number to single
		      sum += getDigit(digit * 2);
		    }
		return sum;
	}
	//method for getting single digit number
	public int getDigit(int number) {
		int digit = (number / 10) + (number % 10);
		return digit;
	}
	//method to get sum of odd places in CC
	public int sumOfOddPlace(String number) {
		int sum = 0;
	    for (int i = number.length() - 1; i >= 0; i -= 2) {
	      int digit = Character.digit(number.charAt(i), 10);
	      sum += digit;
	    }
	    return sum;
	}
	//method to check if the prefix of CC match the prefix of CC worldwide
	public boolean prefixMatched(String number) {
        if (number.startsWith("4") || number.startsWith("5") ||
            number.startsWith("37") || number.startsWith("6")) {
            return true;
        }
        return false;
	}
	//method to check the length of CC
	public boolean getSize(String number) {
		int length = number.length();
		if (length >= 13 && length <= 16)
			return true;
		return false;
	}
}
