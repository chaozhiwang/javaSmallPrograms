package com.zhenyi;

import java.util.Scanner;

/**
 * 3、编写一个小游戏：把从起始数到100之内的所有的整数中的是7的倍数的和含有7的数字数都剔除掉，打印其它的数；
 */
public class Program03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = sc.nextInt();
        for (int i = num; i <= 100; i++) {
            if(!((i%7==0)||(i%10==7))) {
                System.out.print(i+"\t");
            }
        }
    }




}
