package chapter14.Homework_;

public class Homework03 {
    public static void main(String[] args) {
        /**
         * 问题： HashSet和TreeSet是分别如何实现去重的？
         *
         * 答案：
         * HashSet去重机制：
         * hashCode() + equals() 底层先通过存入对象进行运算得到一个hash值  通过hash值得到对应的索引，
         * 如果发现table表索引所在的位置没有值 就直接存放  如果有数据  就进行equals比较 不相同就加入
         *
         * TreeSet去重机制：
         * 如果你传入了一个Comparator匿名对象  就使用实现的compare去重  如果方法返回0  认为相同就不添加
         * 如果没有传入Comparator匿名对象  则以你添加的对象实现的Compareable接口的compareTo去重
         * */

    }
}
