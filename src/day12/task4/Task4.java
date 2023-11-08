package day12.task4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        List<String> listMembers1 = new ArrayList<>();
        listMembers1.add("Ivan Ivanov");
        listMembers1.add("Alexey Sidorov");
        listMembers1.add("Marina Petrova");
        List<String> listMembers2 = new ArrayList<>();
        listMembers2.add("Oleg Popov");
        listMembers2.add("Dmitriy Suvorov");
        listMembers2.add("Irina Markova");


        MusicBand musicBand1 = new MusicBand("De Press", 1980, listMembers1);
        MusicBand musicBand2 = new MusicBand("Dance", 1980, listMembers2);

        transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();


    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        List<String> newList = new ArrayList<>();
        Stream.of(musicBand1.getMembers(), musicBand2.getMembers()).forEach(newList::addAll);
        musicBand1.setMembers(newList);

    }

}
