package SyntaxLvl7.ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShortExpression {

    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() ; i++) {
            int length = list.get(i).length();
            if(minLength > length) {
                minLength = length;
            }
        }
        for (int i = 0; i < list.size() ; i++) {
            if(minLength == list.get(i).length()){
                System.out.println(list.get(i));
            }
        }
    }
}

//1. Создай список строк.
//2. Считай с клавиатуры 5 строк и добавь в список.
//3. Используя цикл, найди самую короткую строку в списке.
//4. Выведи найденную строку на экран.
//5. Если таких строк несколько, выведи каждую с новой строки.
//
//Требования:
//•	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Программа должна считывать 5 строк с клавиатуры и записывать их в список.
//•	Программа должна выводить самую короткую строку на экран.
//•	Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.

//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//    }
//}