package Homework.homework2_3;

import java.util.HashMap;
import java.util.HashSet;

class Phonebook {
    private HashMap<String, HashSet<String>> pb;

    Phonebook() {
        this.pb = new HashMap<>();
    }

    void addContact(String name, String phone) {
        HashSet<String> book = pb.getOrDefault(name, new HashSet<>());
        book.add(phone);
        pb.put(name, book);
    }

    void findAndPrint(String name) {
        System.out.println("Contact " + name + " / Phone number " + pb.getOrDefault(name, new HashSet<>()));
    }
}
