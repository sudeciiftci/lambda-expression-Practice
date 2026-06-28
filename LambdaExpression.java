interface Sum {

    int add(int a, int b);
}

public class LambdaExpression{
    public static void main(String[] args) {
        Sum sum = (a, b) -> a + b;

        System.out.println(sum.add(1, 2));
    }
}
