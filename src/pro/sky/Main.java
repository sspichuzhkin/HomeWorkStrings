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

    public static String changeCharInPosition(int position, char ch, String str){
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }
    public static void Task3() {

        String fullName = "Иванов Семён Семёнович";
        String[] words = fullName.split(" ");
        String partOfPhrase = "";

        for (int i = 0; i < words.length; i++){
            partOfPhrase = partOfPhrase + words[i] + " ";
            if (partOfPhrase.contains("ё")) {
                int indexValue = partOfPhrase.indexOf("ё");
                partOfPhrase = changeCharInPosition(indexValue, 'е', partOfPhrase);
                }
            }
        String fullNameAdapted = partOfPhrase;
        fullNameAdapted = fullNameAdapted.replace("[", "");
        fullNameAdapted = fullNameAdapted.replace("]", "");
        System.out.println("Данные ФИО сотрудника — " + fullNameAdapted);
    }
}