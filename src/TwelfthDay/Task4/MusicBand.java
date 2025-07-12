package TwelfthDay.Task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    String name;
    int year;
    List<String> artists = new ArrayList<>();

    public MusicBand(String name, int year, List<String> artists) {
        this.name = name;
        this.year = year;
        this.artists = artists;
    }

    public static void transferMembers(MusicBand A, MusicBand B){
        B.artists.addAll(A.artists);
        A.artists.clear();
    }

    public void printMembers(){
        System.out.println(artists);
    }

    @Override
    public String toString() {
        return "MusicBand [name=" + name + ", year=" + year + "]";
    }
}
