package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    private static List<Message> messageList = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text){
        messageList.add(new Message(u1,u2,text));
    }

    public static List<Message> getMessageList() {
        return messageList;
    }
    public static void showDialog(User u1, User u2){
        for(Message messlist:messageList){
            if(messlist.getSender().getUsername().equals(u1.getUsername())&&messlist.getReceiver().getUsername().equals(u2.getUsername())
            || messlist.getSender().getUsername().equals(u2.getUsername())&&messlist.getReceiver().getUsername().equals(u1.getUsername()))
                System.out.println(messlist.getSender().getUsername()+": "+messlist.getText());
        }
    }



}
