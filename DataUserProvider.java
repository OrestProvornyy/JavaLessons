import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataUserProvider {

    static List<String> names = Arrays.asList("Bill", "Mark", "Tom", "Andriy", "Ivan", "John", "Ken");

    static List<Integer> ages = Arrays.asList(12, 15, 10, 85, 69, 45, 25);




    public static String getRandomName() {
        return names.get(new Random().nextInt(names.size()));
    }
    public static Integer getRandomAge() {
        return ages.get(new Random().nextInt(ages.size()));
    }
}
