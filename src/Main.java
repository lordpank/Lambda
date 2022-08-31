import java.util.*;
import java.util.Collections;

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
        Collections.sort(human, (a, b) ->
                {
                    int intPerson = a.getSurname().split(" ").length;
                    int outPerson = b.getSurname().split(" ").length;
                    int whole = outPerson - intPerson;
                    if ((intPerson >= 2 && outPerson >= 2) || whole == 0) {
                        return b.getAge() - a.getAge();
                    } else {
                        return whole;
                    }
                }
        );

        System.out.println(human);
    }
}