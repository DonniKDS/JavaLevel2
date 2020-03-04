package homework3;

import java.util.*;

public class Phonebook {

    private Map<String, String> phonebook = new LinkedHashMap<>();
    private Set<String> set = phonebook.keySet();

    public void add(String phoneNumber, String secondName){
        phonebook.put(phoneNumber, secondName);

    }

    public void get(String secondName){
        System.out.print(secondName + ": ");
        if(phonebook.containsValue(secondName)){
            for (String phoneNumber : set){
                if(secondName.equals(phonebook.get(phoneNumber))){
                    System.out.print(phoneNumber + "; ");
                }
            }
        }else {
            System.out.print("Данного абонента нет в телефонной книге");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("1111", "Петров");
        phonebook.add("2222", "Сидоров");
        phonebook.add("1111", "Куликов");
        phonebook.add("3333", "Петров");
        phonebook.add("4444", "Сидоров");

        phonebook.get("Петров");
        phonebook.get("Сидоров");
        phonebook.get("Куликов");
        phonebook.get("Горький");
    }
}
