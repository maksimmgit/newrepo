package home_work_6.comparators;

import home_work_6.Person;

import java.util.Comparator;

public class PasswordUserComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        String password1 = o1.getPassword();
        String password2 = o2.getPassword();
        int passlength1 = password1.length();
        int passlength2 = password2.length();

        return passlength1 - passlength2;
    }



}
