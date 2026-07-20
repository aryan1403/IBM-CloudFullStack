package java03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filesh {
    public static void main(String[] args) {
        File f = new File("java03/names.txt");

        try (Scanner sc = new Scanner(f)) {
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }

        try (FileWriter fw = new FileWriter(f)) {
            fw.write("Ritik");
            fw.append("\nRohan");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // try (FileReader fr = new FileReader(f)) {
        //     while(fr.ready()) {
        //         System.out.print((char) fr.read());
        //     }
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e1) {
        //     e1.printStackTrace();
        // }
    }
}
