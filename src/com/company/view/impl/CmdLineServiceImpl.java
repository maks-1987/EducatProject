package com.company.view.impl;

import com.company.services.ContactService;
import com.company.view.CmdLineService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CmdLineServiceImpl implements CmdLineService {

    private ContactService contactService;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public CmdLineServiceImpl(ContactService contactService) {
        this.contactService = contactService;
    }
    private static void showMenu() {
        System.out.println("1. Create Contact");
        System.out.println("2. Delete Contact");
        System.out.println("3. Show Contact");
        System.out.println("0. Exit");
    }

    @Override
    public void runMenu() throws IOException {
        boolean isRunning = true;
        while (isRunning) { // переменная ПРАВДА, цикл повтор всегда
            showMenu();
            String line = br.readLine();
            switch (line) {
                case "1": {
                    createContact();
                    break;
                }
                case "2": {
                    deleteContact();
                    break;
                }
                case "3": {
                    showContact();
                    break;
                }
                case "0": {
                    isRunning = false;
                    break;
                }
                default:
                    System.out.println("Repeat");
            }
        }
    }

    private void showContact() {
        this.contactService.showContact();
    }

    private void createContact() throws IOException {
        System.out.println("Enter name");
        String name = br.readLine();
        System.out.println("Enter age");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Enter phoneNumber");
        String phoneNumber = br.readLine();
        this.contactService.createContact(name, age, phoneNumber);
    }

    private void deleteContact() throws IOException {
        this.contactService.deleteContact();
    }

}
