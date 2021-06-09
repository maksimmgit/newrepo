package home_work_6;

import home_work_6.utils.Generators;

public class Person {
    private String nick;
    private String password;    //5 to 10 symbols

    //конструктор ошибочный? при создании с помощью сапплаера посылает.
    /*
    public Person(T nick, T password) {
        this.nick = Generators.randomNameGenerator();
        this.password = Generators.randomPassGenerator();
    }

     */

    public Person() {
        this.nick = Generators.randomNameGenerator();
        this.password = Generators.randomPassGenerator();
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
