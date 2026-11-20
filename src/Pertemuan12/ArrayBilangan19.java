//P=19
package Pertemuan12;

import java.util.Arrays;

public class ArrayBilangan19 {
    public static void main(String[] args) {
        int[] bil = { 19, 27, -6, 24 };

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));
    }
}
