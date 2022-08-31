import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Main {
    private static final int MAXIMUM_AGE = 99;

    public static void main(String[] args) {
        Random random = new Random();
        List<Person> human = new ArrayList<>();
        human.add(new Person("Виктор", "Гавриловскимоский", random.nextInt(MAXIMUM_AGE) + 1));
        human.add(new Person("Станислав", "Мерч клиновский", random.nextInt(MAXIMUM_AGE) + 1));
        human.add(new Person("Николай", "де Бухловский", random.nextInt(MAXIMUM_AGE) + 1));
        human.add(new Person("Константин", "Мариарх де Жули", random.nextInt(MAXIMUM_AGE) + 1));
        human.add(new Person("Александр", "штрих Ля Вон", random.nextInt(MAXIMUM_AGE) + 1));
        human.add(new Person("Роман", "Матрос де мурк", random.nextInt(MAXIMUM_AGE) + 1));

        System.out.println(human);
        Collections.sort(human, new PeopleComparator(2));
        System.out.println(human);
    }
}