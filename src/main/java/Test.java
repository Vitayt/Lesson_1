public class Test {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void сheckSumSign() {
        int a = 2;
        int b = 3;
        if (a + b >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void printColor(){
        int value = 100;
        if(value<=0) System.out.println("Красный");
        else if (value<=100) System.out.println("Желтый");
        else  System.out.println("Зеленый");
    }
    public static void compareNumbers(){
        int a = 3;
        int b = 3;
        if(a>=b) System.out.println("a >= b");
        else System.out.println("a < b");

    }
}
