// Задание

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. 
// Вывод должен быть отсортирован по убыванию числа телефонов.

package Homeworks_Java.Homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task {
        public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        
        addContact(phoneBook, "Ivanov", "8113151353");
        addContact(phoneBook, "Petrov", "8313223121");
        addContact(phoneBook, "Sidorov", "556456564");
        addContact(phoneBook, "Ivanov", "1148898989");
        addContact(phoneBook, "Petrov", "66545656");
        addContact(phoneBook, "Petrov", "465646868");
        
        sortedPrint(phoneBook);
    }
    
    public static void addContact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        List<String> phoneList = phoneBook.getOrDefault(name, new ArrayList<>());
        phoneList.add(phoneNumber);
        phoneBook.put(name, phoneList);
    }
    
    public static void sortedPrint(Map<String, List<String>> phoneBook) {
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        entries.sort((a, b) -> b.getValue().size() - a.getValue().size());
        
        for (Map.Entry<String, List<String>> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size() + " phone numbers");
        }
    }

}
