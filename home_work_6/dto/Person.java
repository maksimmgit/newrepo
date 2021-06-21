package home_work_6.dto;

import home_work_6.utils.Generators;

public class Person {
    private String nick;
    private String password;    //5 to 10 symbols

//переделать
    public Person(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public Person() {

    }


    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
