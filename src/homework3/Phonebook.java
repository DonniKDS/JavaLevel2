package homework3;

import java.util.ArrayList;

public class Phonebook {

    private String secondName;
    private String phoneNumber;
    private ArrayList<String> surnames = new ArrayList<>();
    private ArrayList<String> phoneNumbers = new ArrayList<>();

    public void add(String secondName, String phoneNumber){
        boolean check = false;
        for (int i = 0; i < phoneNumbers.size(); i++){
            if (phoneNumber.equals(phoneNumbers.get(i))){
                System.out.println("Не удалось добавить абонента " + secondName + ". Указанный номер принадлежит человеку с фамилией " + surnames.get(i) + "!");
                check = true;
            }
        }
        if (!check){
            surnames.add(secondName);
            phoneNumbers.add(phoneNumber);
        }
    }

    public void get(String secondName){
        boolean check = false;
        System.out.print(secondName + ": ");
        for (int i = 0; i < surnames.size(); i++){
            if (secondName.equals(surnames.get(i))){
                System.out.print(phoneNumbers.get(i) + "; ");
                check = true;
            }
        }
        if(!check){
            System.out.println("Данного абонента нет в телефонной книге");
        }else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Петров", "1111");
        phonebook.add("Сидоров", "2222");
        phonebook.add("Куликов", "1111");
        phonebook.add("Петров", "3333");

        phonebook.get("Петров");
        phonebook.get("Сидоров");
        phonebook.get("Куликов");
    }
}
