package InterFace;

public class Car implements Engine,Break {
    @Override
    public void brake() {
        System.out.println("i will stop like normal");
    }

    @Override
    public void start() {
        System.out.println("i will start");
    }

    @Override
    public void stop() {
        System.out.println("i will stop ");
    }

    @Override
    public void acc() {
        System.out.println("i will stop like acc");
    }
}
