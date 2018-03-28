package com.company.view.impl;

import com.company.services.ContactService;
import com.company.view.CmdLineService;

public class CmdLineServiceImpl implements CmdLineService {

    private ContactService contactService;

    public CmdLineServiceImpl(ContactService contactService) {
        this.contactService = contactService;

    }
    @Override
    public void showMenu() {
        System.out.println("Menu");
    }

}
