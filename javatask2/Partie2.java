import java.util.Scanner;
import java.math.*;
public class Partie2
{
    public static void main(String[] args)
    {
    int l = 0;
    String n = " ";
    String m = " ";
    double o = 0;
    Scanner in = new Scanner(System.in);

        // task 1 Создайте функцию, которая повторяет каждый символ в строке n раз.

        System.out.println("Первая программа");
        System.out.println("Введите слово");
        n = in.nextLine();
        System.out.println("Введите количество повторений");
        l = in.nextInt();
        System.out.println(" ответ "+Repeat.repeat(n,l)+"\n"+"----------------------------"+"\n"+"второе задание");

        // task 2 Создайте функцию, которая принимает массив и возвращает разницу между
        //самыми большими и самыми маленькими числами.

        System.out.println("Введите количество чисел в массиве");
        l = in.nextInt();
        System.out.println("Введите числа через Enter ");
        int[] pop2 = new int [l];
        for (int i=0; i<l ; i++)
        {
            pop2[i] = in.nextInt();
        }
        System.out.println(" ответ " + DifferenceMaxMin.differenceMaxMin(l,pop2) + "\n" + "---------------------------" + "\n" + "третье задание");



        //task3 Создайте функцию, которая принимает массив в качестве аргумента и возвращает
        // true или false в зависимости от того, является ли среднее значение всех элементов
        //массива целым числом или нет.
        System.out.println("Введите количество чисел в массиве");
        l = in.nextInt();
        System.out.println("Введите массив");
        int[] pop3 = new int[l];
        for (int i=0; i<l ; i++)
        {
            pop3[i] = in.nextInt();
        }
        System.out.println("ответ " + IsAvgWhole.isAvgWhole(l,pop3) + "\n" + "----------------------------" + "\n" + "четвертое задание");



        //task4 Создайте метод, который берет массив целых чисел и возвращает массив, в
        //котором каждое целое число является суммой самого себя + всех предыдущих
        //чисел в массиве.
        System.out.println("Введите количество чисел в массиве");
        l = in.nextInt();
        System.out.println("Введите массив");
        int[] pop4 = new int[l];
        for (int i=0; i<l ; i++)
        {
            pop4[i] = in.nextInt();
        }
        pop4 = CumulativeSum.cumulativeSum(l,pop4);
        System.out.println("ответ :");
        for (int j=0; j<l ; j++)
        {
            System.out.println(pop4[j]);
        }
        System.out.println( "---------------------------" + "\n" + "Пятый задание");



        // task 5 Создайте функцию, которая возвращает число десятичных знаков, которое имеет
        //число (заданное в виде строки). Любые нули после десятичной точки
        //отсчитываются в сторону количества десятичных знаков.
        System.out.println("Введите число");
        n = in.nextLine();
        System.out.println(" ответ : " + GetDecimalPlaces.getDecimalPlaces(n) + "\n" + "----------------------------" + "\n" + "шестое задание");


        // task 6 Создайте функцию, которая при заданном числе возвращает соответствующее
        //число Фибоначчи.
        System.out.println("Введите число");
        l = in.nextInt();
        System.out.println(" ответ : " + Fibonacci.fibonacci(l) + "\n" + "----------------------------" + "\n" + "седьмое задание");



        // task 7 напишите функцию, чтобы определить, является ли вход действительным
        //почтовым индексом.
        System.out.println("Введите индекс");
        n = in.nextLine();
        System.out.println(" ответ : " + IsValid.isValid(n) + "\n" + "----------------------------" + "\n" + "восемое задание");



        // task 8 Создайте функцию, которая возвращает true, если пара строк представляет собой
        //странную пару, и false в противном случае
        //isStrangePair("ratio", "orator") ➞ true
        System.out.println("Введите первое слово");
        System.out.print("word 1 : ");
        n = in.nextLine();
        System.out.println("Введите второе слово");
        System.out.print("word 2 : ");
        m = in.nextLine();
        System.out.println(" ответ : " + IsStrangePair.isStrangePair(n,m) + "\n" + "----------------------------" + "\n" + "девятое задание");




        // task 9 Создайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).
        ////– isPrefix должен возвращать true, если он начинается с префиксного аргумента.
        ////– isSuffix должен возвращать true, если он заканчивается аргументом суффикса.
        ////– В противном случае верните false.
        System.out.println("Введите первое слово");
        n = in.nextLine();
        System.out.println("Введите второе слово");
        m = in.nextLine();
        System.out.println(" Prefix : " + IsPrefixSuffix.isPrefix(n,m) + "\n" + "----------------------------" + "\n" );
        System.out.println(" Suffix : " +  IsPrefixSuffix.isSuffix(n,m) + "\n" + "----------------------------" + "\n" + "десятое задание");



        // task 10 Создайте функцию, которая принимает число (шаг) в качестве аргумента и
        //возвращает количество полей на этом шаге последовательности.
        System.out.println("Введите число");
        System.out.print("steps : ");
        l = in.nextInt();
        System.out.println(" ответ : " + BoxSeq.boxSeq(l) + "\n" + "----------------------------" + "\n" + "Задачи для практических занятий. Уровень сложности: 2/6 закончены");

    }

}