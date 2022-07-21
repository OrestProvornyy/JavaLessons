public class Cat extends Animal implements Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println(super.getName()+" says meow");

    }

    @Override
    public void feed() {
        System.out.println("Feeeding cat " + super.getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking with cat named" + super.getName());
    }

    @Override
    public void play() {
        System.out.println("Playing with cat named" + super.getName());
    }
}
