//Author:Samruddhi Kadam
//RollNo:2440
//Title:Java Application Demonstrating Exception Handling, Generics, and Lambda Functions
//Start Date:22nd October 2024
//Modified Date:22nd October 2024
//Description:This Java program test various programming concepts, including exception handling, generic classes, and lambda functions.
class Box<T> {
    private T content;

    // Constructor
    public Box(T content) {
        this.content = content;
    }

    // Getter for content
    public T getContent() {
        return content;
    }

    // Setter for content
    public void setContent(T content) {
        this.content = content;
    }

    // Method to display content type and value
    public void displayContent() {
        System.out.println("Content: " + content + " (Type: " + content.getClass().getSimpleName() + ")");
    }
}
