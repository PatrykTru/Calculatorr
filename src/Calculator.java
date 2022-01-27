public class Calculator {

    public int add(int a , int b)
    {
        return a+b;
    }

    public int minus(int a  , int b)
    {
        return a-b;

    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,2));
        System.out.println(calculator.minus(5,3));



    }
}
