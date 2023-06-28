package HomeWork;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String[] employees = {"Иван Иванов", "Иван Иванов", "Иван Иванов", "Светлана Петрова",
                "Кристина Белова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Анна Крутова",
                "Анна Крутова", "Анна Крутова", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
                "Павел Чернов", "Павел Чернов", "Павел Чернов", "Петр Чернышов", "Мария Федорова"};
        repeatingEmployees(employees);
    }

    /**
     * @param listEmployees список сотрудников
     * @apiNote Выводит в порядке убывания повторяющихся сотрудников с количеством повторений
     */
    public static void repeatingEmployees(String[] listEmployees) {
        Map<String, Integer> repeatedEmployees = new HashMap<>();
        for (int i = 0; i < listEmployees.length; i++) {
            if (!repeatedEmployees.containsKey(listEmployees[i])) {
                repeatedEmployees.put(listEmployees[i], 1);
            } else {
                repeatedEmployees.put(listEmployees[i], repeatedEmployees.get(listEmployees[i]) + 1);
            }
        }
        for (int j = 0; j < listEmployees.length; j++) {
            if (repeatedEmployees.get(listEmployees[j]) <= 1) {
                repeatedEmployees.remove(listEmployees[j]);
            }
        }
        repeatedEmployees.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}