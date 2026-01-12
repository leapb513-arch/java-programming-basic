public class oparator {
    public static void main(String[] args) {
        //oparator
        // 1. Arithmetic Operator

        int a = 10;
        int b = 20;
        int total = a + b;
        int subtotal = a - b;
        int mult = a * b;
        int div = b / a;
        int remainder = b % 3;
//        System.out.println("")
        System.out.println("Toltal = " + total);
        System.out.println("Subtotal = " + subtotal);
        System.out.println("Mult = " + mult);
        System.out.println("Div = " + div);
        System.out.print("Remainder = " + remainder);

        //2. Comparison Operators
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);

        //3. Logical Oparators
        System.out.println("Logical Operators");
        boolean x = true;
        boolean y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x  || !y);
    }

}