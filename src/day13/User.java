package day13;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private List<User> subscriptions; //те пользователи, на которых подписан пользователь.

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User us1 : this.getSubscriptions()) {
            if (us1.getUsername().equals(user.getUsername())) return true;
        }
        return false;
    }

    public boolean isFriend(User user) {
        for (User us1 : this.getSubscriptions()) {
            for (User us2 : getSubscriptions()) {
                if (us1.getUsername().equals(user.getUsername()) &
                        us2.getUsername().equals(us1.getUsername())) return true;
            }
        }
        return false;
    }
    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this,user,text);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
