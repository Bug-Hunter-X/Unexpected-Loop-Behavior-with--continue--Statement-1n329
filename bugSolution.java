public class MyClass {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // Skip iteration when i is 5
            }
            System.out.println(i);
        }
    }
}