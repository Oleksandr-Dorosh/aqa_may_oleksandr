package com.students;

public class string {
    public static String formatString(String lastName, int grade, String subject) {
        String formattedLastName = padRight(lastName, 15);
        String formattedGrade = padLeft(String.valueOf(grade), 3);
        String formattedSubject = padRight(subject, 10);

        return "Студент " + formattedLastName + " получил " + formattedGrade + " по " + formattedSubject + ".";
    }

    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    public static String padLeft(String s, int n) {
        return String.format("%" + n + "s", s);
    }
}
