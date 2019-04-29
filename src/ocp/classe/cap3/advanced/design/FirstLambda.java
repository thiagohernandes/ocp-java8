package ocp.classe.cap3.advanced.design;

interface LambdaFunction {
    void call();
}
class FirstLambda {
    public static void main(String []args) {
        LambdaFunction lambdaFunction = () -> {
            System.out.println("Hello world");
            System.out.println("Hello world again");
        };
        lambdaFunction.call();
    }
}