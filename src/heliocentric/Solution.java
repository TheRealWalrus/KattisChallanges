package heliocentric;

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseId = 1;

        while (scanner.hasNextInt()) {
            int earth = scanner.nextInt();
            int mars = scanner.nextInt();

            int currentResult = heliocentric(earth, mars);

            System.out.println("Case " + caseId + ": " + currentResult);

            caseId++;
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
