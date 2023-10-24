import java.util.Arrays;
import java.util.Collections;

class abc {
    public static void main(String args[]) {
        int a[][] = {
                { 1, 5, 2 },
                { 1, 1, 3 },
                { 1, 4, 7 },
                { 1, 1, 1 },
                { 1, 1, 1, 1 } };
        Arrays.sort(a, (arr1, arr2) -> {
            if (arr1[0] == arr2[0] && arr1.length == arr2.length) {
                if (arr1[1] == arr2[1]) {
                    return arr1[2] - arr2[2];
                }
                return arr1[1] - arr2[1];
            }

            return arr1[0] - arr2[0];
        });
        for (int[] e : a) {
            for (int element : e) {
                System.out.print(element);

            }
            System.out.println();
        }

    }

}