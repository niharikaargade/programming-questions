/**
 * Complexity is O(n)
 */

import java.util.Scanner;

class ValidateSequence {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter str1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter str2 : ");
        String str2 = sc.nextLine();
        int m = str1.length();
        int n = str2.length();

        //Recursive implementation
        if(isSubsequence_Recursive(str1, str2, m, n)) {
            System.out.println("str1 is a subsequence of str2");
        } else {
            System.out.println("str1 is not a subsequence of str2");
        }

        //Iterative implementation
        if(isSubsequence_Iteration(str1, str2, m, n)) {
            System.out.println("str1 is a subsequence of str2");
        } else {
            System.out.println("str1 is not a subsequence of str2");
        }

    }

    /**
     * Recursive function to find if str1 is subsequence of str2
     * @param str1
     * @param str2
     * @param m
     * @param n
     * @return
     */
    private static boolean isSubsequence_Recursive(String str1, String str2, int m, int n) {
        // Base Cases
        if (m == 0)
            return true;
        if (n == 0)
            return false;
        //If last char are matching
        if(str1.charAt(m - 1) == str2.charAt(n - 1)) {
            return isSubsequence_Recursive(str1, str2, m-1, n-1);
        }

        //If last char are not matching
        return isSubsequence_Recursive(str1, str2, m, n-1);
    }

    /**
     * Iterative function to find if str1 is subsequence of str2
     * @param str1
     * @param str2
     * @param m
     * @param n
     * @return
     */
    private static boolean isSubsequence_Iteration(String str1, String str2, int m, int n) {
        int j=0;
        for(int i=0 ; i<n; i++) {
            if(str1.charAt(j) == str2.charAt(i)) {
                j++;
            }
        }
        return (j == m);
    }
}