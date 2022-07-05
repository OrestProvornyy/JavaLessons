public class Homework4WorkWithClasses {
    public static void main(String[] args) {
        Dog bailey = new Dog("Bailey", 2, "Black", 55);
        String baileyName = bailey.getName();
        int baileyAge = bailey.getAge();
        String baileyColor = bailey.getColor();
        int baileyHeight = bailey.getHeight();

        bailey.print();
        System.out.println();
        Dog barsik = new Dog("barsik", 4);
        barsik.print();
        System.out.println();
        Dog tuzik = new Dog();
        tuzik.print();
    }
}
