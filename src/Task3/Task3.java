package Task3;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        byte[] ticTacToe = readFromFile("task2");
        printArray(ticTacToe);
    }

    public static byte[] readFromFile(String fileName) {
        try {
            DataInputStream in = new DataInputStream(new FileInputStream(fileName));
            byte[] array = new byte[9];
            for (int i = 0; i < 9; i++) {
                array[i] = in.readByte();
            }
            return array;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return new byte[0];
    }

    public static void printArray(byte[] array) {
        for (byte b : array) {
            System.out.println(b);
        }
    }
}
