package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public void printMembers() {
        members.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Музыкальная группа: " + name +
                "\nГод ее рождения: " + year + "\n" + members;
    }
}
