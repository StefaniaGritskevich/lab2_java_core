package by.belstu.it.Gritskevich;

import static java.lang.Math.log;
import static java.lang.Math.*;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 * @author vika
 * @version 1.0
 */
class WrapperString{
    private String stroka;

    public WrapperString(String stroka) {
        this.stroka = stroka;
    }

    public String getStroka() {
        return stroka;
    }

    public void setStroka(String stroka) {
        this.stroka = stroka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(stroka, that.stroka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stroka);
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "stroka='" + stroka + '\'' +
                '}';
    }

    /**
     *
     * @param oldchar
     * @param newchar
     */
    public void replace(char oldchar, char newchar) {
        stroka = stroka.replace(oldchar, newchar);
    }

    public void delete(char charToDelete) {
        stroka = stroka.replace(String.valueOf(charToDelete), "");
    }
}


public class JavaTest {
    static int sint;
    final int wer;
    public final int ops;
    public static final int uip = 0;

    public JavaTest() {
        wer = 0;
        ops = 0;
    }
    /**
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        /**
         * @value: d
         * */
        char word = 'd';
        int i = 1;
        short u = 2;
        byte b = 3;
        long l = 123456;
        boolean bool = false;
        boolean bool1 = true;
        String s = "somestring";
        System.out.println(s);
        String ss = s + i;
        System.out.println(ss);
        ss= s + word;
        System.out.println(ss);
        ss = s + 3.56443;
        System.out.println(ss);
        //byte by = b + i;
        // int y = 3.543 + l;
        long ll = i + 2147483647L;
        System.out.println(ll);
        boolean bip = bool &&  bool1;
        System.out.println(bip);
        boolean bip1 = bool ^  bool1;
        System.out.println(bip1);
        //boolean bip2 = bool + bool1;
        long number1 = 9223372036854775807L;
        long number2 = 0x7fff_ffff_fffL;
        char ch = 'a';
        char ch1 = '\u0061';
        char ch2 = 97;
        char sum = (char) (ch + ch1 + ch2);
        System.out.println(sum);
        double dooblic =  3.45 % 2.4;
        System.out.println(dooblic);
        double doblic =  1.0/0.0;
        System.out.println(doblic);
        double doblic1 =  0.0/0.0;
        System.out.println(doblic1);
        double dublic = log(-345);
        System.out.println(dublic);
        float flat = Float.intBitsToFloat(0x7F800000);
        System.out.println(flat);
        flat = Float.intBitsToFloat(0xFF800000);
        System.out.println(flat);
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.round(Math.E));
        System.out.println(Math.min(PI,E));
        Random rand = new Random();
        double randnum = rand.nextDouble();
        System.out.println(randnum);
        Boolean bol = Boolean.valueOf(true);
        Boolean bol1 = Boolean.valueOf(true);
        Character char1 = Character.valueOf('l');
        Character char2 = Character.valueOf('k');
        Integer int1 = Integer.valueOf(5);
        Integer int2 = Integer.valueOf(3);
        Byte bute1 = Byte.valueOf((byte)5);
        Byte bute2 = Byte.valueOf((byte)3);


        boolean res = bol && bol1;
        System.out.println(res);
        boolean res1 = !bol;
        System.out.println(res1);
        int res4 = char1 + char2;
        System.out.println(res4);
        int resu5 = int1 * int2;
        System.out.println(resu5);
//MAX/MIN
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
//packing, unpacking
        Integer num1 = Integer.valueOf(10); // Упаковка
        int num2 = num1.intValue(); // Распаковка

        Byte byte1 = Byte.valueOf((byte) 7); // Упаковка
        byte byte2 = byte1.byteValue(); // Распаковка
//Integer methods
        Integer num = Integer.parseInt("123");
        String hexString = Integer.toHexString(255);
        int comparison = Integer.compare(5, 10);
        String stringRep = num.toString();
        int bitCount = Integer.bitCount(123);
        double dnum = 7.9;
        boolean isNaN = Double.isNaN(dnum);
        System.out.println((isNaN));

        //f
        String f1 = "2345";
        int f2 = Integer.parseInt(f1);

        String f3 = "2345";
        int f4 = Integer.valueOf(f3);

        String f5 = "2345";
        int f6 = Integer.parseInt(f5);

        String str = "Hello, World!";
        byte[] byteArray = str.getBytes();
        String str2 = new String(byteArray);
        System.out.println(byteArray);
        System.out.println(str2);

        String boolStr = "false";
        boolean bolt = Boolean.valueOf(boolStr);
        String boolStr2= "true";
        boolean bolt2 = Boolean.parseBoolean(boolStr2);
        System.out.println(bolt);
        System.out.println(bolt2);

        String str1 = "Hello";
        String strr2 = "Hello";

        boolean isEqual1 = (str1 == strr2); // Сравнение с использованием оператора ==
        boolean isEqual2 = str1.equals(strr2); // Сравнение с использованием метода equals()
        int comparisonResult = str1.compareTo(strr2); // Сравнение с использованием метода compareTo()

        System.out.println(isEqual1); // Выводит true
        System.out.println(isEqual2); // Выводит true
        System.out.println(comparisonResult); // Выводит 0

        //String str3 = "Hello";
        String str4 = "Hello";
        String str3 = null;

        boolean isEqual3 = (str3 == str4);
      // boolean isEqual4 = str3.equals(str4);  //NullPointerException
        //int comparisonResult2 = str3.compareTo(str4); //NullPointerException

        System.out.println(isEqual3);

        String sttr = "Hello, World!";
        String[] splitArray = sttr.split(",");
        boolean contains = sttr.contains("World");
        int hashCode = sttr.hashCode();
        int indexOf = sttr.indexOf("o");
        int length = sttr.length();
        String replacedStr = sttr.replace("Hello", "Hi");

        System.out.println(Arrays.toString(splitArray));
        System.out.println(contains);
        System.out.println(hashCode);
        System.out.println(indexOf);
        System.out.println(length);
        System.out.println(replacedStr);

         char[][] c1;
        //char[] c2[];
        //char c3[][];
        c1 = new char[3][];
        c1[0] = new char[1];
        c1[1] = new char[2];
        c1[2] = new char[3];
        System.out.println(c1.length);
        System.out.println(c1[0].length);
        System.out.println(c1[1].length);
        System.out.println(c1[2].length);

        char[][] c2 = { {'a', 'b', 'c'}, {'d', 'e', 'f', 'g'}, {'h', 'i'} };
        char[][] c3 = { {'a', 'b', 'c'}, {'d', 'r', 'f', 'g'}, {'h', 'i'} };
        boolean comRez = c2 == c3;
        System.out.println(comRez);
        c2 = c3;
        comRez = c2 == c3;
        System.out.println(comRez);
        for (char[] row : c2) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        int[] array = {1, 2, 3};
        // System.out.println(array[3]); // ArrayIndexOutOfBoundsException


        WrapperString wrapperString = new WrapperString("Hello, world!");


        System.out.println(wrapperString.getStroka());
        wrapperString.replace('H', 'u');
        System.out.println(wrapperString.getStroka());
        WrapperString wrapper = new WrapperString("Hello, world!") {
            @Override
            public void replace(char oldchar, char newchar) {
                setStroka(getStroka().replace(oldchar, newchar));
            }

            public void delete(char charToDelete) {
                setStroka(getStroka().replace(String.valueOf(charToDelete), ""));
            }
        };

        wrapper.replace('o', 'x');

        System.out.println(wrapper.getStroka());
        wrapper.delete('x');

        System.out.println(wrapper.getStroka());

    }
}

