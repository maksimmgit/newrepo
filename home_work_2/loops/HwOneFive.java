package home_work_2.loops;

public class HwOneFive {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            for(int j = 2; j < 6; j++) {
                System.out.print(j +"\t"+ "x" + "\t" + i + "\t" + " = " + "\t" + i * j + "\t\t\t\t\t");
                //так много табов, чтобы столбики были ровные

            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        for(int i = 1; i<=10; i++){
            for(int j = 6; j < 10; j++) {
                System.out.print(j +"\t"+ "x" + "\t" + i + "\t" + " = " + "\t" + i * j + "\t\t\t\t\t");
            }
            System.out.println();
        }
    }
}
