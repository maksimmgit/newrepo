package home_work_6.utils;

import java.security.SecureRandom;
import java.util.Random;

public class Generators {
    /**
     * getPeriod метод для генерации длины пароля/имени. указывая границы можем ограничивать длину.
     * @return возвращаем имя в строке
     */
    public static String randomNameGenerator(){
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
    public static String randomPassGenerator(){
        final String characters = "123456789!@#$%^&*()QWERTYUIOPASDFGHJKLZXCVBNM{}|?><";
        Random random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        int length = getPeriod(10,5);
        for(int i = 0; i < length; i++){
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        return sb.toString();
    }

    public static int randomAgeGenerator(){
        return getPeriod(15,1);
    }

    //генерим число для длины имени или пароля.
    public static int getPeriod(int max, int min) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
