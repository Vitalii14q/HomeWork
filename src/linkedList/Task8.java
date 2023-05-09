package linkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human(3400, "Василий"));
        humans.add(new Human(150, "Гена"));
        humans.add(new Human(190, "Ваня"));
        humans.add(new Human(333, "Дима"));

        List<Human> sort = humans.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sort);

        List<Human> sortName = humans.stream()
                .sorted((human, human2) -> human.getName().compareTo(human2.getName()))
                .collect(Collectors.toList());

        System.out.println(sortName);
    }
}
