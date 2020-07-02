package SyntaxLvl7.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TheMostLongString {
    private static ArrayList<String> strings ;

    public static void main(String[] args) throws IOException {
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);//создаю список строк
        }

        int maxLength = 0;//создаю переменную maxLength, которая будет хранить в себе мах длину строки
        for (int i = 0; i < strings.size(); i++) {
            int length = strings.get(i).length();//узнаю размер текущей по циклу строки
            if(length > maxLength){//если длина больше мах, то теперь махLength меняет своё значение
                maxLength = length;
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if(maxLength == strings.get(i).length()){//если мах длина совпадает с длиной введённого слова, то выводим его
                System.out.println(strings.get(i));
            }
        }
    }
}

//1. Создай список строк.
//2. Считай с клавиатуры 5 строк и добавь в список.
//3. Используя цикл, найди самую длинную строку в списке.
//4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
//
//Требования:
//•	В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
//•	Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
//•	Программа должна выводить самую длинную строку на экран.
//•	Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки

//public class Solution {
//    private static ArrayList<String> strings;
//
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//    }
//}