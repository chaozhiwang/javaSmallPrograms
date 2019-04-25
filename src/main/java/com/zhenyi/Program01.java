package com.zhenyi;

/**
 * 有36个人，36块砖，每人搬了一次，正好搬完。
 * 其中男每人每次搬4块，女每人每次搬3块，两个小孩每次搬一块。
 * 问 男、女、小孩各多少人？
 */
public class Program01 {
    public static void main(String[]   args) {
        int manNum = 0;
        int femalNum = 0;
        for (int i = 0; i < 10; i++) {
            for(int m = 0; m < 12; m++) {
                if(((i*4+m*3+(36-i-m)/2==36)&&((36-i-m)%2==0))){
                    manNum  = i;
                    femalNum  = m;
                    System.out.println("男孩人数："+ manNum);
                    System.out.println("女孩人数："+ femalNum);
                    System.out.println("男孩人数："+(36-manNum-femalNum));
                }
            }
        }
    }
}
