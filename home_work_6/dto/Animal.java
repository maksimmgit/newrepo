package home_work_6.dto;

import home_work_6.utils.Generators;

public class Animal {
    private int age;
    private String nick;

//переделать
    /*
    public Animal() {
        this.age = Generators.randomAgeGenerator();
        this.nick = Generators.randomNameGenerator();
    }

     */
    public Animal(int age, String nick) {
    this.age = age;
    this.nick = nick;
    }

    public Animal() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }




}
