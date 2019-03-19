package popular_vote;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int candidates = scanner.nextInt();
            int[] votes = new int[candidates];

            for (int j = 0; j < candidates; j++) {
                votes[j] = scanner.nextInt();
            }

            String currentOutput = popularVote(votes);
            System.out.println(currentOutput);
        }
    }

    static String popularVote(int[] input) {
        int recordValue = 0;
        int recordIndex = 0;
        double totalVotes = 0;

        for (int i = 0; i < input.length; i++) {
            int current = input[i];

            if (current > recordValue) {
                recordValue = current;
                recordIndex = i;
            }

            totalVotes += current;
        }

        int records = 0;

        for (int num : input) {
            if (num == recordValue) {
                records++;
                if (records > 1) {
                    return "no winner";
                }
            }
        }

        String text = recordValue > totalVotes / 2 ? "majority winner " : "minority winner ";

        return text + (recordIndex + 1);
    }
}
