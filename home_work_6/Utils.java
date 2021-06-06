package home_work_6;

import java.security.SecureRandom;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.function.Supplier;

public class Utils<T> {

    public void supplierPerson(){
        Supplier<String> namePerson = this::randomNameGenerator;

        Supplier<String> passwordPerson = this::randomPassGenerator;

    }

    /**
     * getPeriod метод для генерации длины пароля/имени. указывая границы можем ограничивать длину.
     * @return возвращаем имя в строке
     */
    public String randomNameGenerator(){
        final String characters = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЭЮЯабвгдеёжзийклмнопрстуфхцчшщэюя";
        Random random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        int length = getPeriod(10,3);
        for(int i =0; i< length; i++){
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }

    /**
     *
     * @return возвращаем строку с паролем
     * размер пароля от 5 до 10 символов
     */
    public String randomPassGenerator(){
        final String characters = "123456789!@#$%^&*()QWERTYUIOPASDFGHJKLZXCVBNM{}|?><";
        Random random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        int length = getPeriod(10,5);
        for(int i = 0; i < length; i++){
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }

    public int randomAgeGenerator(){
       return getPeriod(15,1);
    }

    //генерим число для длины имени или пароля.
    public static int getPeriod(int max, int min) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }


}
