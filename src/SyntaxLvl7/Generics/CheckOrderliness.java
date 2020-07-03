package SyntaxLvl7.Generics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CheckOrderliness {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < 9; i++) {
            if(list.get(i).length() < list.get(i + 1).length()){
                continue;
            }
            else{
                System.out.println(i+1);
                break;
            }
        }
        
    }
}

//1. Введи с клавиатуры 10 слов в список строк.
//2. Определить, является ли список упорядоченным по возрастанию длины строки.
//3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
//
//Требования:
//•	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Считай 10 строк с клавиатуры и добавь их в список.
//•	Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
//•	Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        //напишите тут ваш код
//    }
//}
