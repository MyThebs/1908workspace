package day03;

import java.util.Scanner;

public class test1
{
    public void work1()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a > b) ? a : b);
    }

    public void work2()
    {
        /*三目运算符的规则
         * 1.值1和值2都是常量的情况下向上转型
         * 2.值1和值2都是变量的情况下向上转型
         * 3，值1值2一个常量一个变量，按照取值范围大的那个转型
         * */
        char a = 'a';
        int b = 100;
        System.out.println(false ? b : (char) (a + 5));
        System.out.println(false ? 100 : (char) (a + 5));
        System.out.println(false ? 65536 : (char) (a + 5));
        System.out.println(1 + 2 + 'a' + '1' + 1 + 2);
    }

    public void work3()
    {
        char x = 'x';
        int i = 10;
        System.out.println(false ? i : x);
        System.out.println(false ? 100 : x);
        ;
    }

    public static void main(String[] args)
    {
        test1 test1 = new test1();
        test1.work3();
    }
}
