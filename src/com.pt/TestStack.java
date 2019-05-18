package com.pt;

public class TestStack {
    private int count = 0;
    public void recursion(){    //没有出口的递归函数
        count++;    //每次调用深度+1
        recursion();    //递归
    }

    public void testStack(){
        try {
            recursion();    //调用递归，等待溢出
        }catch (Throwable e){
            System.out.println("deep of stack is "+count);  //打印溢出的深度
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new TestStack().testStack();
    }

}

