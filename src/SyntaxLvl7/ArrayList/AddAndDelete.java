package SyntaxLvl7.ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AddAndDelete {

    public static void main(String[] args)throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        for (int i = 0; i < 13; i++) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}

//1. Создай список строк.
//2. Добавь в него 5 строк с клавиатуры.
//3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
//4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
//
//Требования:
//•	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Программа должна считывать 5 строк с клавиатуры.
//•	Удали последнюю строку и вставь её в начало. Повторить 13 раз.
//•	Программа должна выводить список на экран, каждое значение с новой строки.

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//    }
//}