package org.tnsif.acc.c2tc.Scanner;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class BufferReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("TNSIFJAVA/src/org/tnsif/acc/c2tc/Scanner/test.txt"));){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
}

