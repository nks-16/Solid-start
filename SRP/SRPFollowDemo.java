//  Follows SRP: Separate classes for compilation and printing
class ReportCompiler {
    public String compileReport() {
        // Compilation logic
        return "Report Data: Sales for Q1 increased by 20%";
    }
}

class ReportPrinter {
    public void printReport(String report) {
        // Printing logic
        System.out.println("----- Printing Report -----");
        System.out.println(report);
        System.out.println("---------------------------");
    }
}

public class SRPFollowDemo {
    public static void main(String[] args) {
        ReportCompiler compiler = new ReportCompiler();
        String report = compiler.compileReport();

        ReportPrinter printer = new ReportPrinter();
        printer.printReport(report);
    }
}
