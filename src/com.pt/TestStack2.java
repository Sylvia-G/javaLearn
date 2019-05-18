package com.pt;

public class TestStack2 {
    private int count = 0;
    public void recursion(long a, long b, long c){    //没有出口的递归函数
        long d=0, e=0, f=0;
        count++;    //每次调用深度+1
        recursion(a,b,c);    //递归
    }

    public void testStack(){
        try {
            recursion(1L,2L,3L);    //调用递归，等待溢出
        }catch (Throwable e){
            System.out.println("deep of stack is "+count);  //打印溢出的深度
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new TestStack2().testStack();
    }

}

