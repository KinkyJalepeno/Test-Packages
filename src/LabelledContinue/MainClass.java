package LabelledContinue;

public class MainClass {

    public static void main(String[] args) {

        normalContinue();

        labelledContinue();

    }

    static void normalContinue() {

        int num = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (i == 5 && j == 5) {
                    // this is skipping 1 iteration of the inner for loop so 100 - 1 = 99
                    continue;
                }
                num++;
            }
        }
        System.out.println("num = " + num); // num = 99
    }

    static void labelledContinue() {

        int num = 0;

        outermost:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (i == 5 && j == 5) {
                    // this is skipping 1 iteration of the inner for loop for every iteration of the outer so 100 - 5 = 95
                    continue outermost;
                }
                num++;
            }
        }
        System.out.println("num = " + num); // num = 95
    }
}
