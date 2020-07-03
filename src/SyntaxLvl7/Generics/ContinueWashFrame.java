package SyntaxLvl7.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class ContinueWashFrame {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for (int i = 0; i < list.size(); i++) {
            list.add(i=i+1, "именно");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}

//1. Создай список из слов "мама", "мыла", "раму".
//2. После каждого слова вставь в список строку, содержащую слово "именно".
//3. Вывести результат на экран, каждый элемент списка с новой строки.
//
//Требования:
//•	Программа не должна считывать данные с клавиатуры.
//•	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Добавь в список слова: «мама», «мыла», «раму».
//•	После каждого слова добавь в список строку, содержащую слово «именно».
//•	Выведи элементы списка на экран, каждый с новой строки.

//public class Solution {
//    public static void main(String[] args) {
//        //напишите тут ваш код
//    }
//}
