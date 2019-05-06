package com.zhenyi;

public class Program04 {
    public static void main(String[] args) {
        char[] passWords = new char[62];
        for (int i = 0; i < 26; i++) {
            passWords[i] = (char)('A'+i);
        }
        for (int i = 26; i < 52; i++) {
            passWords[i] = (char)('a'+(i-26));
        }
        for (int i = 52; i < 62; i++) {
            passWords[i] = (char)('0'+(i-52));
        }
        show(passWords);

    }

    public static void show(char[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
