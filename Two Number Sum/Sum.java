/**
 * Complexity is O(n^2)
 */

import java.util.*;

class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers length : ");
        int length = sc.nextInt();
        int arr [] = new int[length];
        for(int i=0; i<length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        getSum(arr, target);

    }

    static void getSum(int arr[], int target) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = target - arr[i];

            // checking for condition
            if (s.contains(temp)) {
                System.out.println(
                        "Pair with given sum "
                                + target + " is (" + arr[i]
                                + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }
}