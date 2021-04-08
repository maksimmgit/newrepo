package home_work_1;

public class hw6 {

    public static void main(String[] args) {
        int[] numbers = {3, 2, 3, 5, 7, 8, 9, 6, 4, 0};
        System.out.println(createPhoneNumber(numbers));
    }


        public static String createPhoneNumber(int[] numbers){

            String phone = "";
            for(int i = 0; i<numbers.length; i++){
                if(i == 0)
                    phone = phone + "(";
                else if (i == 3)
                    phone += ") ";
                else if (i == 6)
                    phone += "-";

                phone = phone + numbers[i];
            }


            return phone;
        }

}
