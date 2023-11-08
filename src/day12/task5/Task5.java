package day12.task5;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {

        MusicArtist mebmer1 = new MusicArtist("Ivan", 33);
        MusicArtist mebmer2 = new MusicArtist("Petr", 40);
        MusicArtist mebmer3 = new MusicArtist("Alex", 29);
        List<MusicArtist> listMembers1 = new ArrayList<>();
        Stream.of(mebmer1, mebmer2, mebmer3)
                .forEach(listMembers1::add);

        MusicArtist mebmer4 = new MusicArtist("Dmitriy", 53);
        MusicArtist mebmer5 = new MusicArtist("Senya", 27);
        MusicArtist mebmer6 = new MusicArtist("Vladimir", 18);
        List<MusicArtist> listMembers2 = new ArrayList<>();
        Stream.of(mebmer4, mebmer5, mebmer6)
                .forEach(listMembers2::add);

        MusicBand musicBand1 = new MusicBand("De Press", 1980, listMembers1);
        MusicBand musicBand2 = new MusicBand("Dance", 1975, listMembers2);

        transferMembers(musicBand1, musicBand2);

        musicBand1.getMembers().forEach(System.out::println);

    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        List<MusicArtist> newList = new ArrayList<>();
        Stream.of(musicBand1.getMembers(), musicBand2.getMembers()).forEach(newList::addAll);
        musicBand1.setMembers(newList);
    }
}
