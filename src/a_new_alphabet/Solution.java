package a_new_alphabet;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String solution = newAlphabet(input);

        System.out.println(solution);
    }

    static String newAlphabet(String input) {
        input = input.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();
        String[] symbols = {"@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "|<",
        "1", "[]\\/[]", "[]\\[]", "0", "|D", "(,)", "|Z", "$", "']['", "|_|",
        "\\/", "\\/\\/", "}{", "`/", "2"};

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            int symbolIndex = currentChar - 65;

            if (symbolIndex >= 0 && symbolIndex < symbols.length) {
                stringBuilder.append(symbols[symbolIndex]);
            } else {
                stringBuilder.append(currentChar);
            }
        }

        return stringBuilder.toString();
    }
}
