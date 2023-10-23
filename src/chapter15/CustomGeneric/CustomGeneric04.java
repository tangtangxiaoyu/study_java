package chapter15.CustomGeneric;

import java.util.ArrayList;
import java.util.List;

public class CustomGeneric04 {
    public static void main(String[] args) {
        Object o = new String("111");

        // 泛型没有继承性
        // List<Object> objects = new ArrayList<String>(); 错误

        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        ArrayList<AAA> list3 = new ArrayList<>();
        ArrayList<BBB> list4 = new ArrayList<>();
        ArrayList<CCC> list5 = new ArrayList<>();

        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);


//        printCollection2(list1); //错误
//        printCollection2(list2); //错误
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);

        printCollection3(list1);
//        printCollection3(list2); //错误
        printCollection3(list3);
//        printCollection3(list4); //错误
//        printCollection3(list5); //错误

    }
    // List<?> 表示任意的泛型类型都可以接收
    public static void printCollection1(List<?> c){}

    // List<? extends AAA> 表示AAA为上限 可以接收AAA或者它的子类
    public static void printCollection2(List<? extends AAA> c){}

    // List<? super AAA> 支持AAA类以及它的父类  不限于直接父类 规定了泛型的下限
    public static void printCollection3(List<? super AAA> c){}
}

class AAA{}
class BBB extends AAA{}
class CCC extends BBB{}
