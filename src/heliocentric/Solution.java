package heliocentric;

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //TODO: reading inputs to be corrected
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int earth = scanner.nextInt();
            int mars = scanner.nextInt();

            int currentResult = heliocentric(earth, mars);

            System.out.println("Case " + (i + 1) + ": ");
        }
    }

    static int heliocentric(int earth, int mars) {
        int days = 0;

        while (!((earth + days) % 365 == 0 && (mars + days) % 687 == 0)) {
            days++;
        }

        return days;
    }
}
