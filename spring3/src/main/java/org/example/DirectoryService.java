package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class DirectoryService {

    public void processDirectory(String name) {
        HashMap<File, Integer> hm = new HashMap<>();
        TreeSet<File> set = new TreeSet<>((a, b) -> Long.compare(b.length(), a.length()));

        File dir = new File(name);
        if (dir.exists() && dir.isDirectory()) {
            File[] list = dir.listFiles();
            if (list != null) {
                for (File fname : list) {
                    if (fname.isFile() && fname.getName().endsWith(".java")) {
                        set.add(fname);
                        try (FileReader fr = new FileReader(fname);
                             Scanner filesc = new Scanner(fr)) {
                            int count = 0;
                            while (filesc.hasNext()) {
                                String word = filesc.next();
                                if (word.equalsIgnoreCase("system")) {
                                    count++;
                                }
                            }
                            hm.put(fname, count);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                for (File f : set) {
                    System.out.println("File name : " + f + "\tLength : " + f.length());
                }
            }
        } else {
            System.out.println("Directory does not exist.");
        }

        System.out.println(hm);
    }
}