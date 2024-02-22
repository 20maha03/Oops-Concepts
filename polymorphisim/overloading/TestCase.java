public class TestCase {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("Addition:");
        System.out.println(calculator.add(5, 3)); 
        System.out.println(calculator.add(5, 3, 2)); 
        System.out.println(calculator.add(3.5, 2.5)); 
        System.out.println(calculator.add("Hello", "World")); 
        System.out.println(calculator.add("Hello", " ", "World")); 
        
        System.out.println("\nMultiplication:");
        System.out.println(calculator.multiply(5, 3)); 
    }
}