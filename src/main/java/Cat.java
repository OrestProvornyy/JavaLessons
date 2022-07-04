public class Cat {
    public static final String str ="Animal";
    private int age;
    private String color;
    private boolean steril;
    private char sex;
    public Eyes eyes;

    public Cat(int age, String color, boolean steril, char sex, Eyes eyes) {
        this.age = age;
        this.color = color;
        this.steril = steril;
        this.sex = sex;
        this.eyes = eyes;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSteril() {
        return steril;
    }

    public int getAge() {
        return age;
    }

}
