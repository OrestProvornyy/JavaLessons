public class Dog extends Animal implements Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Dog " super.getName() + " says Wooof");
    }

    void greets(Dog another){
        System.out.println("Woooooooof");
    }

    @Override
    public void feed() {
        System.out.println("Feeding the dog" + super.getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking with dog" + super.getName());
    }

    @Override
    public void play() {
        System.out.println("Playing with dog "+super.getName());
    }
}
