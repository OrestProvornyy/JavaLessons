package HomeWork5Inheritance;

public class Cat extends Animal {
    //Приватні поля
    private String color;


    //Гетери і сетери
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //Конструктори
    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = "Clear Color";
    }


    //Прінт
    public void print() {
        System.out.println("vegetarian is " + this.isVegetarian());
        System.out.println("eats is " + this.getEats());
        System.out.println("noOfLegs is " + this.getNoOfLegs());
        System.out.println("Color is " + this.getColor());
    }
}
