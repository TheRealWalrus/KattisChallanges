package ladder;

class Solution {

    static int ladderHeight(int wallHeight, int angle) {
        double solution =  wallHeight / Math.sin(Math.toDegrees(angle));

        return (int) Math.ceil(solution);
    }
}
