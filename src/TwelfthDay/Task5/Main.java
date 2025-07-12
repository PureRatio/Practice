package TwelfthDay.Task5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MusicBand A = new MusicBand("Name1", 2007, new ArrayList<>(List.of(new MusicArtist("Джон Леннон", 25), new MusicArtist("Фредди Меркьюри", 35), new MusicArtist("Курт Кобейн", 45))));
        MusicBand B = new MusicBand("Name2", 2008, new ArrayList<>(List.of(new MusicArtist("Том Йорк", 20), new MusicArtist("Дэн Рейнольдс", 30), new MusicArtist("Алекс Тёрнер", 40))));

        A.printMembers();
        B.printMembers();

        MusicBand.transferMembers(A, B);

        B.printMembers();
        A.printMembers();
    }
}
