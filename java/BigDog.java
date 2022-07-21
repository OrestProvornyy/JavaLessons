public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Woooow");
    }

    @Override
    void greets(Dog another) {
        System.out.println("WOOOOOOOOOOW");
    }
    void greets(BigDog another){
        System.out.println("WoOoOoOoW");
    }
}
