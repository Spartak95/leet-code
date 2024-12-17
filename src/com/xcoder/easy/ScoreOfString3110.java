package com.xcoder.easy;

public class ScoreOfString3110 {
    public static void main(String[] args) {
        int score = scoreOfString("hello");
        assert score == 13;
    }

    private static int scoreOfString(String s) {
        int sum = 0;
        for (int i = 1; i < s.length(); i++) {
            sum += abs(s.charAt(i - 1) - s.charAt(i));
        }
        return sum;
    }

    private static int abs(int number) {
        return number < 0 ? -number : number;
    }
}
