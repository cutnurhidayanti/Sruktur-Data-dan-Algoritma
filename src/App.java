public class App {
    public static void main(String[] args) throws Exception {
        String s1 = new String("hello");
        String s2 = new String("HeLlO");

        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
