package lambda;

public class TraditionalImplementingInterface implements HelloWorldInterface{
    @Override
    public String printHellWorld() {
        System.out.println("Hello World!");
        return null;
    }

    public static void main(String[] args) {
        new TraditionalImplementingInterface().printHellWorld();
    }
}
