package ArrayProg;

public class MinSecMin {

    public static void main(String[] args) {

        // int[] a = {55, 14, 54, 12, 12, 23, 57, 98, 9, -18, -18, 9, 0, 9};
        int[] a = {12, 34, 56, 32, 12, 78, 85, 79};
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        int thirdMin = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                thirdMin = secMin;
                secMin = min;
                min = a[i];
            } else if (a[i] < secMin && a[i] != min) {
                thirdMin = secMin;
                secMin = a[i];
            } else if (a[i] < thirdMin && a[i] != secMin && a[i] != min) {
                thirdMin = a[i];
            }
        }

        System.out.println("min: " + min);
        System.out.println("secmin: " + secMin);
        System.out.println("third min: " + thirdMin);
    }
}
