package chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Example15 {
    public static void main(String[] args) {
        try {
             FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\semicolonProject\\src\\chapter15\\timo.txt");
            byte[] bytes = fileInputStream.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            for (byte b : bytes) {
                System.out.print(Character.toString(b)+" ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
