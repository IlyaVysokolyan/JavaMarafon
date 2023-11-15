package day13;

import java.util.Date;

public class Task {
    public static void main(String[] args) {
        User us1 = new User("us1");
        User us2 = new User("us2");
        User us3 = new User("us3");

        us1.sendMessage(us2,"Привет!");
        us1.sendMessage(us2,"Как твои дела?)");

        us2.sendMessage(us1,"Привет!!!");
        us2.sendMessage(us1,"Мои дела ОТЛИЧНО, спасибо,что спросил!");
        us2.sendMessage(us1,"Как твоя жизнь?Как Ребенок?");

        us3.sendMessage(us1,"us1 привет!");
        us3.sendMessage(us1,"us1 почему мне не отвечаешь так долго?!");
        us3.sendMessage(us1,"ау ????");

        us1.sendMessage(us3,"Привет u3");
        us1.sendMessage(us3,"я пропустил твои сообщения");
        us1.sendMessage(us3,"Что случилось???");

        us3.sendMessage(us1,"у меня срочное дело - позвони мне!!");

        MessageDatabase.showDialog(us1,us3);





    }
}
