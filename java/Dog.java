public class Dog extends Animal implements Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println(super.getName() + " says Wooof");
    }

    void greets(Dog another){
        System.out.println("Woooooooof");
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + super.getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking with " + super.getName());
    }

    @Override
    public void play() {
        System.out.println("Playing with "+super.getName());
    }
}
