package HomeWork5Inheritance;

public class testtest {
    public static void main(String[] args) {
        Cat cat = new Cat(true, "apple", 2, "blue"),
                cat1 = new Cat(false, "carrot", 1);

        cat.print();
        System.out.println("\n");
        cat1.print();
    }
}
