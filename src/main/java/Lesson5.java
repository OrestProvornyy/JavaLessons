public class Lesson5 {
    public static void main(String[] args) {
        int hhhg=55;

        Student student = new Student("Provornyy", "Orest", 27);
        //    System.out.println(student.age);
        student.print();

        Student student1 = new Student("Ivanov", "Ivan", 23);
        student1.print();

        Student student2 = new Student( "Tarasov", "Taras", 42,13 );
        student2.print();

        System.out.println("\n\n\n\n");

        Student.str="animal";
        student.print();
 //       student.print();
 //       student2.print();

//        Student student3=new Student();
 //       student3.print();

        /////////////////////////// ENCAPSULATION //////////////////////////////
        System.out.println(student2.getAge());
        System.out.println(student.toString());

      //  Eyes eyes = new Eyes("red", 3, true, 2));

        Cat cat = new Cat(12, "blue", false, 'm', new Eyes("red", 3, true, 2));

    }
}

