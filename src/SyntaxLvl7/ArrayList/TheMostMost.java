package SyntaxLvl7.ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TheMostMost {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() > maxLength){
                maxLength = list.get(i).length();
            }
            if(list.get(i).length() < minLength){
                minLength = list.get(i).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() == maxLength){
                System.out.println(list.get(i));
                break;
            }
            if (list.get(i).length() == minLength){
                System.out.println(list.get(i));
                break;
            }
        }
    }
}

//1. Создай список строк.
//2. Добавь в него 10 строчек с клавиатуры.
//3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//Если таких строк несколько, то должны быть учтены самые первые из них.
//4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
//
//Требования:
//•	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
//•	Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
//•	Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
//•	Должна быть выведена только одна строка.

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        //напишите тут ваш код
//    }
//}