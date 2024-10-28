//Author:Samruddhi Kadam
//RollNo:2440
//Title:Java Application Demonstrating Exception Handling, Generics, and Lambda Functions
//Start Date:22nd October 2024
//Modified Date:22nd October 2024
//Description:This Java program test various programming concepts, including exception handling, generic classes, and lambda functions.
public class ExceptionTest {
	
	public void testexceptions() {
		// Test ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // Test ArrayIndexOutOfBoundsException
        try {
            int[] array = {1, 2, 3};
            int value = array[5]; // Accessing invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Test NullPointerException
        try {
            String str = null;
            int length = str.length(); // Null object access
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // Test NumberFormatException
        try {
            int num = Integer.parseInt("abc"); // Invalid number format
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

	}
}


