package Labelledbreak;

public class MainClass {

    public static void main(String[] args) {

        normalBreak();

        labelledBreak();

    }

    static void normalBreak() {

        int num = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (i == 5 && j == 5) {
                    break;
                    // this break will exit the inner for loop leaving num = 95
                }
                num++;
            }
        }
        System.out.println("num = " + num);
    }

    static void labelledBreak() {

        int num = 0;

        outermost:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (i == 5 && j == 5) {
                    break outermost;
                    // this break will exit outer for loop leaving num = 55
                }
                num++;
            }
        }
        System.out.println("num = " + num);

    }

}
