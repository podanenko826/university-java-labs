void main() {
    double productCost = 9.99;
    double vatRate = 0.05;

    long costIn = Math.round(productCost * 100.0);
    int unitsToProcess = 10_000;

    long totalNetSales = 0L;
    long totalVAT = 0L;
    long totalGross = 0L;

    for (int i = 0; i < unitsToProcess; i++) {
        long unitVat = Math.round(costIn * vatRate);
        long unitGross = costIn + unitVat;

        totalNetSales += costIn;
        totalVAT += unitVat;
        totalGross += unitGross;
    }

    double totalNet = totalNetSales / 100.0;
    double totalVatAmount = totalVAT / 100.0;
    double totalGrossSales = totalGross / 100.0;

    System.out.println("Total Net Sales Value: " + totalNet);
    System.out.println("Total VAT Amount: " + totalVatAmount);
    System.out.println("Total Gross Value: " + totalGrossSales);
}
