package com.company.services.impl;

import com.company.model.Contact;
import com.company.services.ContactService;

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
    public void deleteContact() {

    }

}
