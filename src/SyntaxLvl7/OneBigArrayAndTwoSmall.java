package SyntaxLvl7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OneBigArrayAndTwoSmall {

    public static void main(String[] args) throws IOException {
        int[] arr = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < smallArray1.length; i++) {
            smallArray1[i] = arr[i];
        }
        

        for (int i = 0; i < smallArray2.length; i++) {
            smallArray2[i] = arr[i + 10];
        }
        System.out.println(Arrays.toString(smallArray2));
    }
}

//1. Создать массив на 20 чисел.
//2. Ввести в него значения с клавиатуры.
//3. Создать два массива на 10 чисел каждый.
//4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
//
//Требования:
//•	Программа должна создавать большой массив на 20 целых чисел.
//•	Программа должна считывать с клавиатуры 20 чисел для большого массива.
//•	Программа должна создавать два маленьких массива на 10 чисел каждый.
//•	Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести второй маленький массив на экран.

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//    }
//}