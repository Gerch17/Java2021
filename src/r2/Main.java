package r2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        list.add(new Human(12, "abter", "Potter", LocalDate.of(2009, 1, 4), 50));
        list.add(new Human(18, "cdter", "Longer", LocalDate.of(2002, 6, 27), 69));
        list.add(new Human(30, "bcter", "Finger", LocalDate.of(1991, 2, 10), 72));
        list.add(new Human(51, "dater", "Priler", LocalDate.of(1969, 9, 2), 59));
        System.out.println("Первая часть(сортировка в обратном порядке по второй букве)");
        Stream<Human> stream = list.stream().sorted(Comparator.comparing((Human c) -> c.getFirstName().charAt(1)).reversed());
        stream.forEach(e -> {
            System.out.println(e.toString());
        });
        System.out.println("Вторая часть(фильтрация по весу больше, чем 60)");
        stream = list.stream().filter(c -> c.getWeight() > 60);
        stream.forEach(e -> {
            System.out.println(e.toString());
        });
        System.out.println("Треться часть(сортировка по возрасту)");
        stream = list.stream().sorted(Comparator.comparingInt(Human::getAge));
        stream.forEach(e -> {
            System.out.println(e.toString());
        });
    }
}
