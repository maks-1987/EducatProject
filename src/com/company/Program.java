package com.company;

import com.company.services.impl.ContactServiceImpl;
import com.company.view.CmdLineService;
import com.company.view.impl.CmdLineServiceImpl;
import java.io.*;

public class Program {

    public static void main(String[] args) throws IOException {
        CmdLineService cmd = new CmdLineServiceImpl(new ContactServiceImpl());
        cmd.showMenu();

        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Insert data...");
            String s = br.readLine();
            System.out.println("Input data: " + s+ "\n" +
                                "for exit written 'exit'" + "\n");

            if (s.equals("exit")) { // || s.equals("Exit") || s.equals("EXIT")) {
                return;
            }
        }

    }

}
