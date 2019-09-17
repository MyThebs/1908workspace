package day02;

import java.util.Scanner;

class calender
{
    public static void main(String[] args)
    {
        print();
    }


    //打印输出
    public static void print()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println("请输入月份（1~12）：");
        int month = sc.nextInt();


        int days = getDays(year, month);//getDays方法详细请往下看
//days+1:day是总天数，输入月份的总天数只是这个月之前的天数，
//加上1变为这个月开始的第一天
        int week = (days + 1) % 7;//开始的第一天是星期几
        System.out.println("日\t一\t二\t三\t四\t五\t六");

//输出第一行（第一个星期）空出来部分
        for (int i = 1; i <= week; i++)
        {
            System.out.print(" \t");
        }


//输出第一行（第一个星期）各天
        for (int i = 1; i <= 7 - week; i++)
        {
            System.out.print(i + "\t");
        }


        System.out.println();


        //1~12月的个月天数
        int monthDay = 0;
        switch (month)
        {
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                {
                    monthDay = 29;
                } else
                {
                    monthDay = 28;
                }
                break;


            case 3:
            case 5:
            case 6:
            case 9:
            case 11:
                monthDay = 30;
                break;


            default:
                monthDay = 31;
                break;
        }


//输出剩下的日期，从第二周开始了，所以是8-week
        for (int i = 8 - week; i <= monthDay; i++)
        {

            System.out.print(i + "\t");

//每七天换一行则当日期能整除7就换行
            if ((i + week) % 7 == 0)
            {
                System.out.println();
            }
        }


    }


    /*
    计算当年当月的距1900年1.1的总天数
    */
    public static int getDays(int year, int month)
    {
//判断这年是闰年或者平年,得到年的总天数
        int day1 = 0, day2 = 0;


        for (int i = 1900; i < year; i++)
        {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
            {
                day1 += 366;
            } else
            {
                day1 += 365;
            }
        }

//得到月的总天数
        for (int i = 1; i < month; i++)
        {
            switch (i)
            {
                case 2:
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    {
                        day2 += 29;
                    } else
                    {
                        day2 += 28;
                    }
                    break;


                case 3:
                case 5:
                case 6:
                case 9:
                case 11:
                    day2 += 30;
                    break;


                default:
                    day2 += 31;
                    break;
            }
        }

        return day1 + day2;


    }
}
