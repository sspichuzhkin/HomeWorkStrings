package pro.sky;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }

    public static void Task1() {

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void Task2() {

        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameForReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameForReport);
    }

    public static String changeCharInPosition(int position, char ch, String str) {
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }

    public static void Task3() {

        String fullName = "Иванов Семён Семёнович";
        String[] words = fullName.split(" ");
        StringBuilder partOfPhrase = new StringBuilder();

        for (String word : words) {
            if (word.contains("ё")) {
                int indexValue = word.indexOf("ё");
                word = changeCharInPosition(indexValue, 'е', word);
            }
            partOfPhrase.append(word).append(" ");
        }
        String fullNameAdapted = partOfPhrase.toString();
        System.out.println("Данные ФИО сотрудника — " + fullNameAdapted);
    }
}