package TwelfthDay.Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MusicBand A = new MusicBand("Name1", 2007, new ArrayList<>(List.of("Джон Леннон", "Фредди Меркьюри", "Курт Кобейн")));
        MusicBand B = new MusicBand("Name2", 2008, new ArrayList<>(List.of("Том Йорк", "Дэн Рейнольдс", "Алекс Тёрнер")));

        A.printMembers();
        B.printMembers();

        MusicBand.transferMembers(A, B);

        B.printMembers();
        A.printMembers();
    }
}
