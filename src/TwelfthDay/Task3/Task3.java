package TwelfthDay.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("The Beatles", 1960));
        bands.add(new MusicBand("Queen", 1970));
        bands.add(new MusicBand("Nirvana", 1987));
        bands.add(new MusicBand("Radiohead", 1985));
        bands.add(new MusicBand("Imagine Dragons", 2008));
        bands.add(new MusicBand("Arctic Monkeys", 2002));
        bands.add(new MusicBand("Maroon 5", 2001));
        bands.add(new MusicBand("Twenty One Pilots", 2009));
        bands.add(new MusicBand("The 1975", 2002));
        bands.add(new MusicBand("Greta Van Fleet", 2012));

        System.out.println(bands);
        System.out.println(bandsAfter2000(bands));
    }
    public static List<MusicBand> bandsAfter2000(List<MusicBand> bands) {
        List<MusicBand> result = new ArrayList<>();
        for (MusicBand band : bands) {
            if(band.year >= 2000) {
                result.add(band);
            }
        }
        return result;
    }
}
