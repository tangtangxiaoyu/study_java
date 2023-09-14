public class Exception01 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        try {
            int res = n1 / n2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("程序继续运行...");
    }
}
