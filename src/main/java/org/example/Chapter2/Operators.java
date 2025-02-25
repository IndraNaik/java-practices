package org.example.Chapter2;

public class Operators {

    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 4;
        int b = 6;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(b/a);
        System.out.println(b*a);
//      int b = 6 % a;  // % is modulo operator
        int ab = 67;
        b *=3;
        System.out.println(b);
        System.out.println(a == b); // Comparison Operator
        System.out.println(10>6 || 10 <6 ); // logical Operator

        int HH = b+20;
        System.out.println(HH);
        System.out.println(2&3);

        // Unary Operators
        int x = 2;
        System.out.println(x++); // 2
        System.out.println(++x); // 4
        System.out.println(x--); // 4
        System.out.println(--x); // 2

        // Assignment Operators
        int c = 7;
        int d = 8;
        c += 2; // c = c + 2
        System.out.println(c); // 9
        c -= 2; // c = c - 2
        System.out.println(c); // 7
        c *= 2; // c = c * 2
        System.out.println(c); // 14
        c /= 2; // c = c / 2
        System.out.println(c); // 7
        c %= 2; // c = c % 2
        System.out.println(c); // 1

        // Comparison and Logical Operators
        int e = 4;
        int f = 8;
        System.out.println(e == f); // false
        System.out.println(e != f); // true
        System.out.println(e > f); // false
        System.out.println(e < f); // true
        System.out.println(e >= f); // false
        System.out.println(e <= f); // true

        boolean g = true;
        boolean h = false;
        System.out.println(g && h); // false
        System.out.println(g || h); // true

    }
}
