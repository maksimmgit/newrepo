package home_work_1;

public class hw1p2value42and15 {
    public static void main(String[] args) {
        int a = 42; //101010
        int b = 15; //1111


        int nota = ~a; //-43 OR 11111111111111111111111111010101
        int notb = ~b; // -16 OR    11111111111111111111111111110000
        int and = a & b;// 1010 или 10 в десятичной

        int anda = a, andb = b; // здесь и далее создаю отдельные переменные для операций присваивания
        anda &= b; //10 OR 1010
        andb &= a; //10 OR 1010


        int or = a | b; //47 OR 101111
        int ora = a, orb = b;
        ora |= b; //47 OR 101111
        orb |= a; //47 OR 101111





        int xor = a ^ b; //37 OR 100101
        int xor2 = b ^ a; //37 OR 100101
        int xora = a, xorb = b;
        xora ^= b; //37 OR 100101
        xorb ^= a; //37 OR 100101





        int righta = a >> b; //всё сдвинулось, вправо, 0
        int rightb = b >> a; //0
        int right_assigment_a = a, right_assigment_b = b;
        right_assigment_a >>= right_assigment_b; //0
        right_assigment_b >>= right_assigment_a; //15 OR 1111

        int zerofill_right_a = a >>> b; //0
        int zerofill_right_b = b >>> a; //0






        int lefta = a << b; //1376256 OR 101010000000000000000
        int leftb = b << a; //15360   OR 11110000000000
        int left_assigment_a = a, left_assigment_b = b;
        left_assigment_a <<= left_assigment_b; //1376256 OR 101010000000000000000
        left_assigment_b <<= left_assigment_a; //15 OR 1111




        int zfill_right_assigment_a = a, zfill_right_assigment_b = b;
        zfill_right_assigment_a >>>= zfill_right_assigment_b; //0
        zfill_right_assigment_b >>>= zfill_right_assigment_a; //15 OR 1111

        /*
        Комбинированные ниже
         */

        int notor = ~a | ~b; //-11 OR 11111111111111111111111111110101
        int notand = ~a & ~b; //-48 OR 11111111111111111111111111010000
        int notxor = ~a ^ ~b; //37 OR 100101



    }
}
