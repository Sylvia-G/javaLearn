package com.headFirstJava.chapter1;

public class PhraseOMatic {
    public static void main(String[] args) {
//        你可以随意加上其他术语
        String[] wordListOne = {"24/7","multi-Tier","30,000 foot","B-to-B","win-win","front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
        String[] wordListTwo = {"234f","loopy","java","fan","rockey"};
        String[] wordListThree = {"http","core competency","space","solution","portal"};

//        计算每一组有多少个名词术语
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        System.out.println(oneLength + " " + twoLength + " " + threeLength);

//        产生随机数字, Math.random()返回一个double,区间[0.0, 1.0]
        int rand1 = (int)(Math.random() * oneLength);
        int rand2 = (int)(Math.random() * twoLength);
        int rand3 = (int)(Math.random() * threeLength);
        System.out.println(rand1 + " " + rand2 + " " + rand3);

//        组合出专家术语
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

//        输出
        System.out.println("What we need is a " + phrase);
    }
}
