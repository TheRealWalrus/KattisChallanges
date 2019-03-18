package ladder;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wallHeight = scanner.nextInt();
        int angle = scanner.nextInt();

        System.out.println(ladderHeight(wallHeight, angle));
    }

    static int ladderHeight(int wallHeight, int angle) {
        double solution =  wallHeight / Math.sin(Math.toRadians(angle));

        return (int) Math.ceil(solution);
    }
}
