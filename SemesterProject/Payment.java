package JavaOOP.SemesterProject;
public class Payment {
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
	public int getDigit(int number) {
		int digit = (number / 10) + (number % 10);
		return digit;
	}
	public int sumOfOddPlace(String number) {
		int sum = 0;
	    for (int i = number.length() - 1; i >= 0; i -= 2) {
	      int digit = Character.digit(number.charAt(i), 10);
	      sum += digit;
	    }
	    return sum;
	}
	public boolean prefixMatched(String number) {
        if (number.startsWith("4") || number.startsWith("5") ||
            number.startsWith("37") || number.startsWith("6")) {
            return true;
        }
        return false;
	}
	public boolean getSize(String number) {
		int length = number.length();
		if (length >= 13 && length <= 16)
			return true;
		return false;
	}
}