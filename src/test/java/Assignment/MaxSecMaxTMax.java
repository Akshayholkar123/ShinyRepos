package Assignment;

public class MaxSecMaxTMax {

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int tMax = Integer.MIN_VALUE;
        
        int[] a = {11,11, 10, 3, 5, 7, 9, 2, 5, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                tMax = secMax;
                secMax = max;
                max = a[i];
            } else if (a[i] > secMax && a[i] != max) {
                tMax = secMax;
                secMax = a[i];
            } else if (a[i] > tMax && a[i] != secMax && a[i] != max) {
                tMax = a[i];
            }
        }

        System.out.println("max: " + max);        // 11
        System.out.println("secMax: " + secMax);  // 10
        System.out.println("thirdMax: " + tMax);  // 9
    }
}
