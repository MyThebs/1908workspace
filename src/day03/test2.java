package day03;

public class test2
{
    public void work1()
    {
        int result = 0;
        int flag = 2;
        if (flag == 2)
        {
            System.out.println(1);
        }
        if (flag == 0)
        {
            System.out.println(2);
        }
        if (flag == 2)
        {
            System.out.println(3);
        }
        //如果是return的话，最后return 3

        if (flag == 2)
        {
            System.out.println(4);
        } else if (flag == 0)
        {
            System.out.println(5);
        } else if (flag == 2)
        {
            System.out.println(6);
        }
        //如果是return的话，最后return的是4
    }

    public static void main(String[] args)
    {
        test2 test = new test2();
        test.work1();
    }
}
