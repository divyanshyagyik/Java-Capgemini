package org.example;

import java.io.*;
public class Capge {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        try{
            FileReader fileReader = new FileReader("abc.txt");
        }catch (Exception E){
            System.out.println("File not found !!");
        }

        InputStream stream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(stream);
        BufferedReader r1 = new BufferedReader(inputStreamReader);
        String s = r1.readLine();
        System.out.println(s);
    }
}
