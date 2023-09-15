public class Exception03 {
    public static void main(String[] args) {
        try {
            String name = "1234r";
            int num = Integer.parseInt(name);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
