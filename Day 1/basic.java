package org.example;

import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter name && roll : ");
        String s = sc.nextLine();
        String [] arr = s.split(" ");
        String name = arr[0];
        if(arr.length==1){
            int roll1 = sc.nextInt();
            System.out.println("Information : \nRoll : "+roll1+"\nName : "+name);
        }else {
            String roll = arr[1];
            System.out.println("Information : \nRoll : " + roll + "\nName : " + name);
        }
    }
}
