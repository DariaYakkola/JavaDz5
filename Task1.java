package HomeWork;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        StringBuffer phrase = new StringBuffer("Россия идет вперед всей планеты. Планета — это не Россия.");
        filterText(phrase);
        Scanner sc = new Scanner(System.in);
        String[] filterText = phrase.toString().split(" ");
        System.out.println("Введите слово для поиска: ");
        String search = sc.nextLine().toLowerCase();
        search(filterText, search);
    }

    /**
     * @param text       текст, где будем искать вхождение слова
     * @param searchWord слово, которое будем искать
     * @apiNote Метод для подсчета конкретного слова в тексе
     */
    public static void search(String[] text, String searchWord) {
        int count = 0;
        for (int j = 0; j < text.length; j++) {
            if (text[j].toLowerCase().equals(searchWord)) {
                count += 1;
            }
        }
        System.out.println("Слово " + searchWord + " встретилось " + count + " раз(а)");
    }

    /**
     * @param text текст, который нужно очистить от знаков препинания
     * @apiNote Убирает знаки из текса
     */
    public static void filterText(StringBuffer text) {
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) == '.') || (text.charAt(i) == ',') || (text.charAt(i) == '!')
                    || (text.charAt(i) == '?') || (text.charAt(i) == ':')) {
                text.setCharAt(i, ' ');
            }
        }
    }
}