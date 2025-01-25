public class Example {
    boolean isLightGreen = false;
    
    static void waitForLight(boolean isLightGreen) {
        while (isLightGreen == false) {
            System.out.println("waiting...");
        }
    }

    boolean isPassengersBoarding = true;
    
    static void waitForPassengers(boolean isPassengersBoarding) {
        while (isPassengersBoarding == true) {
            System.out.println("waiting for passengers to board...");
        }
    }
    public static void main(String[] args) {
        //waitForLight(false);
        waitForPassengers(true);
    }
}