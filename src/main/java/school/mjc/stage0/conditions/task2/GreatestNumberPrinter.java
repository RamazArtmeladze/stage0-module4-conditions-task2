package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if (first >= second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }

    public static void main(String[] args) {
        GreatestNumberPrinter printer = new GreatestNumberPrinter();
        printer.printGreatest(5, 10);  // Output will be "10"
        printer.printGreatest(7, 7);   // Output will be "7"
        printer.printGreatest(20, 15); // Output will be "20"
    }
}
