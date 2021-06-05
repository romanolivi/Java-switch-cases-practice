package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int value = 4;
	    if (value == 1) {
	        System.out.println("Value was 1");
        } else if (value == 2) {
	        System.out.println("Value was 2");
        } else {
	        System.out.println("Was not 1 or 2");
        }

	    int switchValue = 3;

	    switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;

            default:
                System.out.println("Value is neither 1 or 2");
                break;
        };

        char switchChar = 'D';

        switch(switchChar) {
            case 'A':
                System.out.println("Your Char is A");
                break;

            case 'B':
                System.out.println("Your Char is B");
                break;

            case 'C':
                System.out.println("Your Char is C");
                break;

            case 'D':
                System.out.println("Your Char is D");
                break;

            case 'E':
                System.out.println("Your Char is E");
                break;

            default:
                System.out.println("Char not found");

        };

        char newSwitchChar = 'C';

        switch(newSwitchChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Your new Char is " + newSwitchChar);
                break;

            default:
                System.out.println("Char not found");

        }


    }


}
