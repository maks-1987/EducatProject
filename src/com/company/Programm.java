package com.company;

import com.company.services.impl.ContactServiceImpl;
import com.company.view.CmdLineService;
import com.company.view.impl.CmdLineServiceImpl;
import java.io.*;

public class Programm {

    public static void main(String[] args) throws IOException {
        CmdLineService cmd = new CmdLineServiceImpl(new ContactServiceImpl());
        cmd.showMenu();

        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            System.out.println("Входные данные: " + s);

            if (s.equals("exit") || s.equals("Exit") || s.equals("EXIT")) {
                return;
            }
        }

    }

}
