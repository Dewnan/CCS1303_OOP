import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.toFarenheit();
        temp.disregard();
    }
}

class testLoop {
    static void loop(String[] args) {
        System.out.println("With Contine Statement.");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("With Break Statement.");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}

class Temperature {
    double[] Region_1 = {27.7, 31.5, 30.2, 29.8, 31.1};
    double[] Region_2 = {28.1, 30.3, 32.1, 29.5, 31.0};

    double[] Region_1_Fahrenheit = new double[5];
    double[] Region_2_Fahrenheit = new double[5];

    public void errorCorrection() {
        for (int i = 0; i < Region_2.length; i++) {
            Region_2[i] = Region_2[i] - 1.5;
        }
    }

    public void toFarenheit() {
        for (int i = 0; i < Region_1.length; i++) {
            Region_1_Fahrenheit[i] = Region_1[i] * (9.0/5) + 32;
        }
        System.out.println("Region 1 Temperature in Farenhite: " + Arrays.toString(Region_1_Fahrenheit));

        for (int i = 0; i < Region_2.length; i++) {
            Region_2_Fahrenheit[i] = Region_2[i] * (9.0/5) + 32;
        }
        System.out.println("Region 2 Temperature in Farenhite: " + Arrays.toString(Region_2_Fahrenheit));
    }

    public void disregard() {
        for (int i = 0; i < Region_1_Fahrenheit.length; i++) {
            if (Region_1_Fahrenheit[i] < 84.2) {
                Region_1_Fahrenheit[i] = 0;
            }
        }
        System.out.println("Region 1 Temperature after making values unere 84.2 to 0: " + Arrays.toString(Region_1_Fahrenheit));

        for (int i = 0; i < Region_2_Fahrenheit.length; i++) {
            if (Region_2_Fahrenheit[i] < 84.2) {
                Region_2_Fahrenheit[i] = 0;
            }
        }
        System.out.println("Region 2 Temperature after making values unere 84.2 to 0: " + Arrays.toString(Region_2_Fahrenheit));
    }
}