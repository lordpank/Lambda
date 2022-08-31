import java.util.Comparator;

public class PeopleComparator implements Comparator<Person> {

    private int limitSurname = Integer.MAX_VALUE;

    public PeopleComparator(int wordsInSurname) {
        if (wordsInSurname > 0) {
            this.limitSurname = wordsInSurname;
        }
    }

    @Override
    public int compare(Person o1, Person o2) {
        int o1words, o2words;
        String[] strings1 = o1.getSurname().split(" ");
        String[] strings2 = o2.getSurname().split(" ");
        o1words = strings1.length;
        o2words = strings2.length;
        if (o1words > limitSurname) {
            o1words = limitSurname;
        }
        if (o2words > limitSurname) {
            o2words = limitSurname;
        }
        if (o1words == o2words) {
            return o2.getAge() - o1.getAge();
        } else {
            return o2words - o1words;
        }
    }
}
