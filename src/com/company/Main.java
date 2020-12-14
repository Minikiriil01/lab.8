package com.company;
import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("new.txt", false)) {
            // запись всей строки
            System.out.println("Enter text: ");
            Scanner text = new Scanner(System.in);
            String t = text.nextLine();
            writer.write(t);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        try {
            FileWriter writer = new FileWriter("new.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            System.out.println("Append text: ");
            Scanner text = new Scanner(System.in);
            String t = text.nextLine();
            bufferWriter.write(t);
            bufferWriter.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try(FileReader reader = new FileReader("new.txt"))
        {
            // читае мпо символьно
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
