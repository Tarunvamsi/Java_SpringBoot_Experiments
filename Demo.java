class Calculator {
    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public int add(int n1, int n2, int n3){
        int result = n1+n2+n3;
        return result;

    }
}

public class Demo {
    public static void main(String a[]) {
        int num1 = 4;
        int num2 = 5;
        int num3 = 1;

        Calculator calc = new Calculator();
        int twoSum = calc.add(num1, num2);
        int threeSum = calc.add(num1, num2, num3);
        System.out.println(twoSum);


    }
}