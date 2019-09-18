package day03;

import java.util.Scanner;

public class homework
{
    public void work1()
    {
        System.out.println("输入金额：");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if (money > 100)
        {
            System.out.println("宝马X5");
        }
        if (money > 50 && money <= 100)
        {
            System.out.println("奥迪A6");
        }
        if (money > 20 && money <= 50)
        {
            System.out.println("比亚迪");
        }
        if (money > 10 && money <= 20)
        {
            System.out.println("极品飞车");
        }

    }

    public static void main(String[] args)
    {
        homework homework = new homework();
        homework.work1();
    }
}

