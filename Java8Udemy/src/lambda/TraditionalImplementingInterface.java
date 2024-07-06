package lambda;

public class TraditionalImplementingInterface implements HelloWorldInterface{
    @Override
    public void printHellWorld() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        new TraditionalImplementingInterface().printHellWorld();
    }
}
