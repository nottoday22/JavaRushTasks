package SyntaxLvl7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArrayCounts {

    public static void main(String[] args) throws IOException {
        int[] arrayOfCounts = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10 ; i++) {
            arrayOfCounts[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 9; i >= 0 ; i--) {
            System.out.println(arrayOfCounts[i]);
        }
    }
}

//1. Создать массив на 10 чисел.
//2. Ввести с клавиатуры 10 чисел и записать их в массив.
//3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
//
//Требования:
//•	Программа должна создавать массив на 10 целых чисел.
//•	Программа должна считывать числа для массива с клавиатуры.
//•	Программа должна выводить 10 строчек, каждую с новой строки.
//•	Массив должен быть выведен на экран в обратном порядке.

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//    }
//}