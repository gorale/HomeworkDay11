package com.company;

import java.util.Scanner;


public class Main {
    public static void asteriskD(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    /**
     * Asterisk C
     * @param n
     */
    public static void asteriskC(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
    /**
     * Asterisk B
     * @param n
     */
    public static void asteriskB(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j+i < n; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    /**
     * Asterisk A
     * @param n
     */
    public static void asteriskA(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }


    /**
     * multiplication Table
     *
     * @param n
     */
    public static void multiplicationTable(int n) {
        for (int i = -1; i <= n; i++) {
            if (i == -1) {
                System.out.print("\t|");
            } else if (i == 0) {
                System.out.print("--");
            } else if (i > 0) {
                System.out.printf("%1$d\t|", i);
            }
            for (int j = 1; j <= n; j++) {
                if (i == -1) {
                    System.out.printf("\t%1$d", j);
                    continue;
                } else if (i == 0) {
                    System.out.print("--------");
                    continue;
                }
                System.out.printf("\t%1$d", i * j);
            }
            System.out.println();
        }
    }

    /**
     * Checkerboard
     *
     * @param n
     */
    public static void checkerboard(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("# ");
                    if (j == n) {
                        System.out.print("\n");
                    }
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    System.out.print(" #");
                    if (j == n) {
                        System.out.print("\n");
                    }
                }
            }
        }
    }

    /**
     * Asterisk
     *
     * @param n
     */
    public static void asterisk(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
                if (j == n) {
                    System.out.print("\n");
                }

            }
        }
    }

    public static void emulator(int n) {
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                while (j < n) {
                    System.out.print(i+" ");
                    break;
                }
            }
        }
    }

    /**
     * Count zero,positive or negative
     *
     * @param n
     */
    public static void zeroPositiveNegative(int n) {
        Scanner sc = new Scanner(System.in);
        int countZero = 0;
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (k == 0) {
                countZero++;
            }
            if (k < 0) {
                countNegative++;
            }
            if (k > 0) {
                countPositive++;
            }


        }
        System.out.println("zero: " + countZero);
        System.out.println("positive: " + countPositive);
        System.out.println("negative: " + countNegative);

    }

    /**
     * Binary to decimal
     *
     * @param x
     */
    public static void binaryToDecimal(int x) {
        int y = 0;
        int k = 0;
        for (int i = 0; x > 0; i++) {
            y = x % 10;
            x = x / 10;
            k += y * Math.pow(2, i);

        }
        System.out.println(k);
    }

    /**
     * 10 number sum
     */
    public static void tenNumbers() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            sum += n;
        }
        System.out.println(sum);


    }

    /**
     * Count All Natural Divisors
     *
     * @param x
     */
    public static void countAllNaturalDivisors(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     * All Natural Divisors
     *
     * @param x
     */
    public static void allNaturalDivisors(int x) {
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * Smallest Natural Divisor
     *
     * @param x
     */
    public static void smallestNaturalDivisor(int x) {
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    /**
     * reverse number
     *
     * @param x
     */
    public static void reverse(int x) {
        String y = "";
        for (int i = x; x > 0; i--) {
            if (x % 10 != 0) {
                y += x % 10;
            }

            x = x / 10;
        }
        System.out.println(y);


    }

    /**
     * how many times the digit d occurs in
     * the representation of a natural number x.
     *
     * @param x
     * @param d
     */

    public static void representationOfX(int x, int d) {
        int count = 0;
        for (int i = x; i > 0; i--) {
            if (x % 10 == d) {
                count++;
            }
            x = x / 10;
        }
        System.out.println(count);

    }

    /**
     * remainder of c when divided by d
     *
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public static void dividedByD(int a, int b, int c, int d) {
        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.println(i);
            } else {
                continue;
            }
        }
    }

    /**
     * Squares
     *
     * @param a
     * @param b
     */
    public static void squares(int a, int b) {
        for (int i = a; i <= b; i++) {
            for (int j = 1; j <= b / 2; j++) {
                if (j * j == i) {
                    System.out.println(i);
                }
            }
        }
    }

    /**
     * Even numbers a to b
     *
     * @param a
     * @param b
     */
    public static void evenNumbersAToB(int a, int b) {

        for (int i = a; i <= b; i++) {
            if ((i & 1) == 0) {
                System.out.println("even number: " + i);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        System.out.println("Enter a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter b: ");
//        int b = sc.nextInt();
//        evenNumbersAToB(a, b);

//        System.out.println("Enter a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter b: ");
//        int b = sc.nextInt();
//        System.out.println("Enter c: ");
//        int c = sc.nextInt();
//        System.out.println("Enter d: ");
//        int d = sc.nextInt();
//        dividedByD(a, b, c, d);

//        System.out.println("Enter a: ");
//        int a = sc.nextInt();
//        System.out.println("Enter b: ");
//        int b = sc.nextInt();
//        squares(a, b);

//        System.out.println("Enter x: ");
//        int x = sc.nextInt();
//        System.out.println("Enter d: ");
//        int d = sc.nextInt();
//        representationOfX(x, d);

//        System.out.println("Enter x: ");
//        int x = sc.nextInt();
//        reverse(x);

//        System.out.println("Enter x: ");
//        int x = sc.nextInt();
//        smallestNaturalDivisor(x);

//        System.out.println("Enter x: ");
//        int x = sc.nextInt();
//        allNaturalDivisors(x);

//        System.out.println("Enter x: ");
//        int x = sc.nextInt();
//        countAllNaturalDivisors(x);

//        tenNumbers();

//        System.out.println("Enter x: ");
//        int x = sc.nextInt();
//        binaryToDecimal(x);


//            System.out.println("Enter n: ");
//            int n = sc.nextInt();
//            zeroPositiveNegative(n);

//            System.out.println("Enter n: ");
//            int n = sc.nextInt();
//            emulator(n);

//            System.out.println("Enter n: ");
//            int n = sc.nextInt();
//            asterisk(n);

//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//        checkerboard(n);

//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//        multiplicationTable(n);

        System.out.println("Enter n: ");
        int n = sc.nextInt();
        asteriskD(n);


//        int a = 40;
//        int x = 1;
//        int y = 1;
//        int z = 1;
//        int e = 1;
//        for (x = 1; x <= 40; x++) {
//            for (y = 1; y <= 40; y++) {
//                for (z = 1; z <= 40; z++) {
//                    for (e = 1; e <= 40; e++) {
//                        if (x+y+z+e == 40 && x+z ==10 && y+e == 30){
//                            System.out.println(x+" "+y+" "+z+" "+e);
//                        }
//                    }
//                }
//            }
//        }


    }
}
