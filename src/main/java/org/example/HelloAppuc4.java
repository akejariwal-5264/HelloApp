package org.example;

public class HelloAppuc4 {
    public static void main(String[] args){
        String name="";
        String with=" is ";
        String status="Grandmaster";

        if(args.length>0) {
            for (int i = 0; i < args.length; i++) {
                name = name + args[i] + " ";
            }
        }
        else {
            name="Anushka";
            }
        System.out.println("Hello,"+ name.trim() + with+status+"!");
        }
    }