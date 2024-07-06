package lambda;

public class LambdaWay {
    public static void main(String[] args) {
        //        Method -1
//        HelloWorldInterface hwi = new HelloWorldInterface() {
//            @Override
//            public void printHellWorld() {
//                System.out.println("Hello World!");
//            }
//        };
//        Method -2
//        HelloWorldInterface hwi =()-> {
//           return "Hello world !!!";
//        };
//        Method -3
        HelloWorldInterface hwi =()->"Hello world !!!";
                System.out.println(hwi.printHellWorld());
    }
}
