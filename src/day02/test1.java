package day02;

import org.omg.Messaging.SyncScopeHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class test1
{
    public void work1()
    {
        int a=1;
        int b=2;
        System.out.println("交换前a:"+a);
        System.out.println("交换前b:"+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("交换后a:"+a);
        System.out.println("交换后b:"+b);

    }
    public void work2()
    {
        double a=1.5;
        double b=4.0;
        System.out.println("长方形面积为："+a*b);
        System.out.println("长方形周长为："+2*(a+b));
    }

    public void work3()
    {
        int v=40;
        double s=45678.9;
        System.out.println("所用时间为"+s/v);
    }

    public void work4()
    {
        char word='A';
        System.out.println((char)(word+32));
    }

    public void work5()
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("请输入第一个数：");
            String word1=bf.readLine();
            for (int i = 0; i < word1.length(); i++)
            {
                if (word1.charAt(i)<0||word1.charAt(i)>9)
                {
                    System.out.println("输入错误");
                    System.exit(0);
                }
            }
            System.out.println("请输入第二个数：");
            String word2=bf.readLine();
            for (int i = 0; i < word2.length(); i++)
            {
                if (word2.charAt(i)<0||word2.charAt(i)>9)
                {
                    System.out.println("输入错误");
                    System.exit(0);
                }
            }
            System.out.println(Integer.parseInt(word1)+Integer.parseInt(word2));

        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    public static void main(String[] args)
    {
        test1 test=new test1();
        test.work5();
    }
}
