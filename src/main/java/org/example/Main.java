package org.example;

import java.util.Stack;

public class Main {

    public static boolean checkForPalindrome(String text) {
        if (text == null || text.trim().isEmpty()) {
            return false;
        }

        // KRİTİK SATIRLAR BURADA ────────────────────────────────
        String cleaned = text
                .replaceAll("[^a-zA-Z]", "")   // boşluk, nokta, virgül, ?, !, :, vs. hepsini sil
                .toLowerCase();

        if (cleaned.isEmpty()) {
            return false;
        }
        // ────────────────────────────────────────────────────────

        Stack<Character> stack = new Stack<>();

        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return cleaned.equals(reversed.toString());
    }

    // binary çevirme kısmı aynı kalabilir
    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) return "0";

        Stack<Integer> stack = new Stack<>();
        while (decimal > 0) {
            stack.push(decimal % 2);
            decimal /= 2;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}