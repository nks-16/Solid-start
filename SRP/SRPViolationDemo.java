//  Violates SRP: One class handles both compilation and printing
class ReportManager {
    public String compileReport() {
        // Compilation logic
        return "Report Data: Sales for Q1 increased by 20%";
    }

    public void printReport(String report) {
        // Printing logic
        System.out.println("----- Printing Report -----");
        System.out.println(report);
        System.out.println("---------------------------");
    }
}

public class SRPViolationDemo {
    public static void main(String[] args) {
        ReportManager reportManager = new ReportManager();
        String report = reportManager.compileReport();
        reportManager.printReport(report);
    }
}