package com.ExaminationQuestions;

//编程: 分组和遍历
//构造一个User对象, 属性有userName, age, school
//构造一个User列表, List<User>, User内容随意
//基于school分组, 即Map<String, List<User>>, 相同school放在一个List中
//然后遍历每个分组中的所有User
//要求: 考虑健壮性

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q5 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        Map<String, List<User>> map = new HashMap<>();

        User u1 = new User("安大叔", 35, "北京大学");
        User u2 = new User("道哥", 35, "清华大学");
        User u3 = new User("胖哥", 35, "清华大学");
        User u4 = new User("牛牛", 35, "北京大学");
        User u5 = new User("楠哥", 35, "复旦大学");

        List<User> users1 = new ArrayList<>();
//        map.put(u1.school, users1.add(u1));
        users.add(u2);


        users.add(u3);
        users.add(u4);
        users.add(u5);





    }
}
