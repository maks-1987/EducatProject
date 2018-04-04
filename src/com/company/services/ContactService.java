package com.company.services;

import java.io.IOException;

public interface ContactService {

    void createContact(String name, int age, String phoneNumber);
    void deleteContact() throws IOException;
    void showContact();

}
