public class TestCase {
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("maha");
        std.setAge(20);
        std.setEmail("mahalakshmi.lives@gmail.com");
        System.out.println(std.getName() + " " + std.getAge() + " " + std.getEmail());
    }
}