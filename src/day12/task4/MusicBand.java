package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members ;

    public MusicBand(String name, int year, List<String> members) {
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

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public void printMembers(){
        members.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Музыкальная группа: " + name +
                "\nГод ее рождения: " + year+ "\n"+members;
    }
}
