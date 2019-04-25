package com.zhenyi;

import java.util.Scanner;

/**
 * 2、倒计时的算法：输入一个秒数，要求转换为XX小时XX分XX秒的格式输出出来;
 */
public class Program02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int hour = num/3600;
//        int minutes = 0;
//        int seconds = num%3600;
//        if(seconds >= 60) {
//            minutes = seconds/60;
//            seconds = seconds%60;
//        }else {
//            minutes = 0;
//        }
//        System.out.println(hour + " 小时" + minutes +" 分"+seconds +"秒");

        //优化1
        int hour = num/3600;
        int minutes = num%3600/60;
        int seconds = num%60;
        System.out.println(hour + " 小时" + minutes +" 分"+seconds +"秒");
    }

}
