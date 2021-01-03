import java.util.Scanner;
import java.math.*;

public class Partie1
{
    public static void main(String[] args)
    {
        int l = 0;
        int n = 0;
        int m = 0;
        char o = 0;
        double p = 0;
        int nums[];
        //double q = 0;
        Scanner in = new Scanner(System.in);



        //tast1 remainder
        System.out.println("Введите два числа");
        n = in.nextInt();
        m = in.nextInt();
        System.out.println("Итог " + Remainder.remainder(n,m) + "\n" + "----------------------------" + "\n" +"второе задание" );


        // task 2 triangle square с высотой и длиной
        System.out.println("Введите основание и высоту");
         n = in.nextInt();
         m = in.nextInt();
        System.out.println("Площадь " + Trisquare.trisquare(n,m) + "\n" + "---------------------------" + "\n" + "третье задание" );


        // task 3 количество ног на ферме (курица + коров + свининей)
        System.out.println("Введите количество животных");
        System.out.println("Куры ");
        n = in.nextInt();
        System.out.println("Коровы ");
        m = in.nextInt();
        System.out.println("Свиньи ");
        l = in.nextInt();
        System.out.println("Количество ног " + Animals.animals(n,m,l) + "\n" + "----------------------------" + "\n" + "четвертое задание");


        // task 4 три аргумента (prob, prize, pay) если (prob * prize > pay) = true;
        System.out.println("Введите ");
        System.out.println("Prob ");
        n = in.nextInt();
        System.out.println("Prize ");
        m = in.nextInt();
        System.out.println("Pay ");
        l = in.nextInt();
        System.out.println(" ответ " + ProfitableGamble.profitableGamble(n,m,l) + "\n" + "---------------------------" + "\n" + "Пятый задание");


        // task 5  что нужно сделать с a и b: они должны быть сложены,
        // вычитаны, умножены или разделены, чтобы получить N
        System.out.println("Введите N, a, b");
        n = in.nextInt();
        m = in.nextInt();
        l = in.nextInt();
        System.out.println("операция :");
        System.out.println(" ответ : " + Operation.operation(n,m,l) + "\n" + "----------------------------" + "\n" + "шестое задание");


        //task 6 Создайте функцию, которая возвращает значение ASCII переданного символа.
        System.out.println("Введите символ");
        o = in.next().charAt(0);
        System.out.println(" ответ : " + Ascii.ascii(o) + "\n" + "----------------------------" + "\n" + "седьмое задание");


        //  task 7  . Напишите функцию, которая берет последнее число из последовательного списка чисел
        //  и возвращает сумму всех чисел до него и включая его.
        System.out.println("Введите число");
        System.out.print("Prob ");
        n = in.nextInt();
        System.out.println(" ответ : " + AddUpTo.addUpTo(n) + "\n" + "----------------------------" + "\n" + "восемое задание");

        // task 8 Создайте функцию, которая находит максимальное значение третьего ребра
        ////треугольника, где длины сторон являются целыми числами.
        System.out.println("Введите стороны треугольника");
        n = in.nextInt();
        m = in.nextInt();
        System.out.println(" ответ : " + NextEdge.nextEdge(n,m) + "\n" + "----------------------------" + "\n" + "девятое задание");


        // task 9 Создайте функцию, которая принимает массив чисел и возвращает сумму его кубов.
        System.out.println("Введите первое число");
        n = in.nextInt();
        System.out.println("Введите второе число");
        m = in.nextInt();
        System.out.println("Введите третье число");
        l = in.nextInt();
        System.out.println("Сумма кубов трех чисел");
        System.out.println(" ответ : " + SumOfCubes.sumOfCubes(n,m,l) + "\n" + "----------------------------" + "\n" + "десятое задание");

        // task 10 Добавьте A к себе B раз и проверьте, делится ли результат на C.
        // abcmath(5, 2, 1) ➞ true 5+5=10 , 10+10=20 , 20 est divisible par 1

        System.out.println("Введите A B C");
        System.out.print("A :");
        n = in.nextInt();
        System.out.print("B :");
        m = in.nextInt();
        System.out.print("C :");
        l = in.nextInt();

        System.out.println(" ответ : " + AbcMath.abcMath(n,m,l) + "\n" + "----------------------------" + "\n" + "Задачи для практических занятий. Уровень сложности: 1/6 закончены");



    }


}

