package dice_game;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] gunnar = new int[4];
        int[] emma = new int[4];

        for (int j = 0; j < 4; j++) {
            gunnar[j] = scanner.nextInt();
        }

        for (int j = 0; j < 4; j++) {
            emma[j] = scanner.nextInt();
        }

        System.out.println(diceGame(gunnar, emma));

    }

    static String diceGame(int[] gunnar, int[] emma) {
        double probGunnar = (gunnar[1] + gunnar[0]) / 2d;
        probGunnar += (gunnar[3] + gunnar[2]) / 2d;
        double probEmma = (emma[1] + emma[0]) / 2d;
        probEmma += (emma[3] + emma[2]) / 2d;

        String out = "Tie";

        if (probGunnar > probEmma) {
            out = "Gunnar";
        } else if (probEmma > probGunnar) {
            out = "Emma";
        }

        return out;
    }
}
