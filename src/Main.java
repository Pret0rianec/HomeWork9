import java.util.Arrays;

void main() {
    // Task_1
    System.out.println("Task_1");
    int inputArray1[] = {1000, 4000, 2000, 3000, 5000};
    int sum = 0;
    int max = -1;
    int min = inputArray1[0];
    for (int i = 0; i < inputArray1.length; i++) {
        sum = sum + inputArray1[i];
    }
    for (int i = 0; i < inputArray1.length; i++) {
        if (inputArray1[i] > max) {
            max = inputArray1[i];
        }
    }
    for (int i = 0; i < inputArray1.length; i++) {
        if (inputArray1[i] > min) {
            min = inputArray1[i];
        }
    }
    int avr = sum / inputArray1.length;
    int[] outputArray1 = {sum, max, min, avr};

    System.out.println("inputArray1: " + Arrays.toString(inputArray1));
    System.out.println("outputArray1: " + Arrays.toString(outputArray1));

    // Task_2
    System.out.println("Task_2");
    int inputArray2[] = {20_000, 40_000, 25_000, 30_000, 50_000};
    double outputArray2[] = new double[inputArray2.length];
    for (int i = 0; i < inputArray2.length; i++) {
        outputArray2[i] = inputArray2[i] * 0.13;
    }
    System.out.println("inputArray2: " + Arrays.toString(inputArray2));
    System.out.println("outputArray2: " + Arrays.toString(outputArray2));

    // Task_3
    System.out.println("Task_3");
    int inputArray3[] = {7_000, 4_000, 6_000, 3_000, 5_500};
    boolean outputArray3[] = new boolean[inputArray3.length];
    int a = 0;
    for (int i : inputArray3) {
        if (inputArray3[a] > 5000) {
            outputArray3[a] = true;
        }
        a++;
    }
    System.out.println("inputArray3: " + Arrays.toString(inputArray3));
    System.out.println("outputArray3: " + Arrays.toString(outputArray3));

    // Task_4
    System.out.println("Task_4");
    int inputArray4[] = {7_000, 4_000, 2_000, -500, 2_500};
    boolean[] outputArray4 = new boolean[1];
    outputArray4[0] = true;
    a = 0;
    for (int i : inputArray4) {
        if (i < 0) {
            outputArray4[0] = false;
            break;
        }
    }
    System.out.println("inputArray4: " + Arrays.toString(inputArray4));
    System.out.println("outputArray4: " + Arrays.toString(outputArray4));

    // Task_5
    System.out.println("Task_5");
    int inputArray5[] = {7_000_000, 4_000_000, -100, 1_000_000, 2_500_000};
    int[] outputArray5 = new int[1];
    int profitMonth = 0;
    for (int i : inputArray5) {
        if (i > 0) {
            profitMonth++;
        }
        outputArray5[0]=profitMonth;
    }
    System.out.println("inputArray5: " + Arrays.toString(inputArray5));
    System.out.println("outputArray5: " + Arrays.toString(outputArray5));
}