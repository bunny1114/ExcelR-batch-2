public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        boolean b = false;

        // Unary Plus and Minus
        System.out.println(+a);  // 10
        System.out.println(-a);  // -10

        // Pre-Increment and Post-Increment
        System.out.println(++a); // 11
        System.out.println(a++); // 11 (then a becomes 12)
        System.out.println(a);   // 12

        // Pre-Decrement and Post-Decrement
        System.out.println(--a); // 11
        System.out.println(a--); // 11 (then a becomes 10)
        System.out.println(a);   // 10

        // Logical Complement
        System.out.println(!b);  // true

        // Bitwise Complement
        System.out.println(~a);  // -11
    }
}
