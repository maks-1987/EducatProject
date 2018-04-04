package com.company.services.impl;

import com.company.model.Contact;
import com.company.services.ContactService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ContactServiceImpl implements ContactService {
    private List<Contact> contactList = new ArrayList<>();

    @Override
    public void createContact(String name, int age, String phoneNumber) {
        this.contactList.add(new Contact(name, age, phoneNumber));

        for (Contact contact : this.contactList) {
            System.out.println(contact);
        }

    }
    @Override
    public void deleteContact() throws IOException, IndexOutOfBoundsException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Deleting a contact by index (0 - ...) N_ ");
        int index = Integer.parseInt(br.readLine());
        // проверка на выход за пределы массива, если нет - вывод успешности выполнения
        try {
            if (index >= 0) {
                contactList.remove(index);
                System.out.println("Contact deleted");
            } else { // если число < 0 выведем это:
                System.out.println(" Incorrect index. Repeat! Delete Contact");
            } // если ввести число > чем индексов массива выведем это:
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" Incorrect index. Repeat! Delete Contact");
        }
    }
    @Override
    public void showContact() {
        if (contactList.isEmpty()) { // проверка, пустой ли список
            System.out.println(" ContactList is Empty! ");
        } else { // если не пустой, выводим контакты построчно
            for (int i = 0; i < contactList.size(); i++) {
                int j = contactList.size() - i - 1; // (arr.length - 1 - 0 = 0, потом 1,2...)
                System.out.println(contactList.get(j));
            }
        }
    }

}
