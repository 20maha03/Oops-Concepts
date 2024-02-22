public class TestCase{
    public static void main(String args[]){
        HP b = new HP();

        String sizeOfHP = b.sayDisplaySize();
        System.out.println("HP display size: "+sizeOfHP);

        String proOfHP = b.sayProcessor();
        System.out.println("HP processor: "+proOfHP);

        Dell d = new Dell();

        String sizeOfDell = d.sayDisplaySize();
        System.out.println("HP display size: "+sizeOfDell);
        
        String proOfDell = d.sayProcessor();
        System.out.println("HP processor: "+proOfDell);

    }

}
