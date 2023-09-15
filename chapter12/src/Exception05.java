public class Exception05 {
    public static void main(String[] args) {
        try {
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;
        } finally {
            System.out.println("finally...");
        }
        System.out.println("继续执行了");
    }
}
