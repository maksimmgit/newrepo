package home_work_1;

public class hw1p3valuem42andm15 {
    public static void main(String[] args) {
        int a = -42; //11111111111111111111111111010110
        int b = -15; //11111111111111111111111111110001

        int nota = ~a; //41 OR 101001
        int notb = ~b; //14 OR 1110
        int and = a & b;//-48 OR 11111111111111111111111111010000
        int anda = a, andb = b;
        anda &= b; //-48 OR 11111111111111111111111111010000
        andb &= a; //-48 OR 11111111111111111111111111010000


        int or = a | b; //-9 OR 11111111111111111111111111110111
        int ora = a, orb = b;
        ora |= b; //-9 OR 11111111111111111111111111110111
        orb |= a; //-9 OR 11111111111111111111111111110111


        int xor = a ^ b; //39 OR 100111
        int xor2 = b ^ a; //39 OR 100111
        int xora = a, xorb = b;
        xora ^= b; //39 OR 100111
        xorb ^= a; //39 OR 100111


        int righta = a >> b; //-1 OR 11111111111111111111111111111111
        int rightb = b >> a; //-1 или 11111111111111111111111111111111
        int right_assigment_a = a, right_assigment_b = b;
        right_assigment_a >>= right_assigment_b; //-1 OR 11111111111111111111111111111111
        right_assigment_b >>= right_assigment_a; //-1 OR 11111111111111111111111111111111

        int zerofill_right_a = a >>> b; //32767 OR 111111111111111
        int zerofill_right_b = b >>> a; //1023 OR 1111111111


        int lefta = a << b; //-5505024 OR 11111111101011000000000000000000
        int leftb = b << a; //-62914560 OR 11111100010000000000000000000000
        int left_assigment_a = a, left_assigment_b = b;
        left_assigment_a <<= left_assigment_b; //-5505024 OR 11111111101011000000000000000000
        left_assigment_b <<= left_assigment_a; //-15 OR 11111111111111111111111111110001


        int zfill_right_assigment_a = a, zfill_right_assigment_b = b;
        zfill_right_assigment_a >>>= zfill_right_assigment_b; //32767 OR 111111111111111
        zfill_right_assigment_b >>>= zfill_right_assigment_a; //1


        int notor = ~a | ~b; //47 OR 101111
        int notand = ~a & ~b; //8 OR 1000
        int notxor = ~a ^ ~b; //39 OR 100111



    }
}
