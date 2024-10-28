//Author:Samruddhi Kadam
//RollNo:2440
//Title:Java Application Demonstrating Exception Handling, Generics, and Lambda Functions
//Start Date:22nd October 2024
//Modified Date:22nd October 2024
//Description:This Java program test various programming concepts, including exception handling, generic classes, and lambda functions.
public class Main {

	public static void main(String[] args) {
		ExceptionTest e=new ExceptionTest();
		e.testexceptions();
		
		
		
		Box<Integer> intBox = new Box<>(123);
        intBox.displayContent();
        System.out.println("Integer content: " + intBox.getContent());

        // Test with String type
        Box<String> strBox = new Box<>("Hello, Generics!");
        strBox.displayContent();
        System.out.println("String content: " + strBox.getContent());

        // Changing content of the Box
        intBox.setContent(456);
        System.out.println("Updated Integer content: " + intBox.getContent());
        
        
        
        Greeting greeting = (name) -> System.out.println("Hello, " + name + "!");

        // Test the lambda expression
        greeting.greet("Alice");
        greeting.greet("Bob");
        greeting.greet("Charlie");
        
        

 }

}