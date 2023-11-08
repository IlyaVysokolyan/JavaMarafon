package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> listMusicBand = new ArrayList<>();
        listMusicBand.add(new MusicBand("De Press", 1980));
        listMusicBand.add(new MusicBand("Level 42", 1979));
        listMusicBand.add(new MusicBand("Katedra", 1986));
        listMusicBand.add(new MusicBand("17 Hippies", 1995));
        listMusicBand.add(new MusicBand("Darzamat", 1973));
        listMusicBand.add(new MusicBand("Каста", 2000));
        listMusicBand.add(new MusicBand("Akcent", 2001));
        listMusicBand.add(new MusicBand("Ангел НеБес", 2009));
        listMusicBand.add(new MusicBand("Fleet Foxes", 2014));
        listMusicBand.add(new MusicBand("Elysion", 2022));

        Collections.shuffle(listMusicBand);

        groupsAfter2000(listMusicBand).forEach(System.out::println);

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        return bands.stream().filter(s -> s.getYear() > 2000).toList();
    }
}
