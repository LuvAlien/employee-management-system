public class PayStatement {
    private int payId;
    private double grossPay;
    private double deductions;
    private double netPay;

    public PayStatement() {
        payId = 0;
        grossPay = 0.0;
        deductions = 0.0;
        netPay = 0.0;
    }

    public PayStatement(int payId, double grossPay, double deductions) {
        this.payId = payId;
        this.grossPay = grossPay;
        this.deductions = deductions;
        this.netPay = calculateNetPay();
    }

    public double calculateNetPay() {
        return grossPay - deductions;
    }

    public void generateStatement() {
        netPay = calculateNetPay();

        System.out.println("Pay ID: " + payId);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions: $" + deductions);
        System.out.println("Net Pay: $" + netPay);
    }

    public int getPayId() {
        return payId;
    }

    public void setPayId(int payId) {
        this.payId = payId;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
        netPay = calculateNetPay();
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
        netPay = calculateNetPay();
    }

    public double getNetPay() {
        return netPay;
    }
}
