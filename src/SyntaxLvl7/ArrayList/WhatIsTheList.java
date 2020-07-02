package SyntaxLvl7.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WhatIsTheList {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        System.out.println(list.size());
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}

//1. Создай список строк.
//2. Добавь в него 5 различных строк.
//3. Выведи его размер на экран.
//4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
//
//Требования:
//•	Программа не должна ничего считывать с клавиатуры.
//•	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
//•	Программа должна добавить 5 любых строк в список.
//•	Программа должна вывести размер списка на экран.
//•	Программа должна вывести содержимое списка на экран, каждое значение с новой строки.

//public class Solution {
//    public static void main(String[] args) {
//        //напишите тут ваш код
//    }
//}
