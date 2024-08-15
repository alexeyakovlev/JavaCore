package Task2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Предположить, что числа в исходном массиве из 9 элементов имеют диапазон [0,
//3], и представляют собой, например, состояния ячеек поля для игры в крестикинолики, где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3
//– резервное значение. Такое предположение позволит хранить в одном числе типа
//int всё поле 3х3. Записать в файл 9 значений так, чтобы они заняли три байта.
public class Task2 {
    public static void main(String[] args) {
        byte[] array = {0, 1, 2, 3, 0, 1, 2, 0, 1};

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("task2.txt"))) {
            for (byte b : array) {
                dos.writeByte(b);
            }
            System.out.println("Данные записаны в файл!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
