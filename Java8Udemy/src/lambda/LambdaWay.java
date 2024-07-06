package lambda;

public class LambdaWay {
    public static void main(String[] args) {
//        HelloWorldInterface hwi = new HelloWorldInterface() {
//            @Override
//            public void printHellWorld() {
//                System.out.println("Hello World!");
//            }
//        };
        HelloWorldInterface hwi =()-> {
           return "Hello world !!!";
        };
        System.out.println(hwi.printHellWorld());
    }
}
