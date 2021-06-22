package home_work_7;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathof = "src\\home_work_7\\files\\";
        File path = new File(pathof);
        String[] list = path.list();
        int i = 1;
        try{
            for (String s:list) {

                System.out.println("ID: "+ i++ + ". Книга: " + s );

            }
        } catch (NullPointerException e){
            System.out.println("Не передавайте неверную директорию.");
        }


    }
}
