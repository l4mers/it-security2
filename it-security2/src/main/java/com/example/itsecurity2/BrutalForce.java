package com.example.itsecurity2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class BrutalForce {

    public static void main(String[] args) throws IOException {

        String password = "pass";
        String urlString = "http://localhost:8080/credentials/login/user1/" + password;

        password = "loop combination";
        urlString = "http://localhost:8080/credentials/login/user1/" + password;

        URL users = new URL(urlString);
        BufferedReader in1 = new BufferedReader(new InputStreamReader(users.openStream()));
        String inlines = "";



        while((inlines = in1.readLine()) != null){
            System.out.println(inlines);
        }
        in1.close();
    }
}
