public class LibraryFineCalculator {

    public double calculateFine(int overdueDays) {

        if (overdueDays <= 0) {
            return 0.0;
        }

        return overdueDays * 5.0;
    }

    public static void main(String[] args) {

        LibraryFineCalculator calculator =
                new LibraryFineCalculator();

        int overdueDays = 5;

        double fine = calculator.calculateFine(overdueDays);

        System.out.println("Overdue Days: " + overdueDays);
        System.out.println("Fine Amount: ₹" + fine);
    }
}