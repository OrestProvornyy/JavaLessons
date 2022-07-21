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
        System.out.println("Feeeding  " + super.getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking " + super.getName());
    }

    @Override
    public void play() {
        System.out.println("Playing with " + super.getName());
    }
}