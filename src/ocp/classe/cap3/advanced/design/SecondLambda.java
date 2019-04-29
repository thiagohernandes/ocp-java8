package ocp.classe.cap3.advanced.design;

interface LambdaFunctionSecond {
    String call(int x);
}
class SecondLambda {
    public static void main(String []args) {

        LambdaFunctionSecond lambdaFunction = (int x) -> {
            return x + " x " + 2 + " = " + (x * 2);
        };

        System.out.println(lambdaFunction.call(3));
    }
}