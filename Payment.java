public class Payment implements PriceList
{
    private String paymentMethods;
    private int date;
    private int uniqueCode;
    private int totalCost;

    public Payment(String paymentMethods, int date, int uniqueCode, int totalCost)
    {
        this.paymentMethods = paymentMethods;
        this.date = date;
        this.uniqueCode = uniqueCode;
        this.totalCost = totalCost;
    }

    public double calculateTotalPrice()
    {
        return 0;
    }

    public String getPaymentMethods()
    {
        return paymentMethods;
    }

    public void setPaymentMethods(String paymentMethods)
    {
        this.paymentMethods = paymentMethods;
    }

    public int getDate()
    {
        return date;
    }

    public void setDate(int date)
    {
        this.date = date;
    }

    public int getUniqueCode()
    {
        return uniqueCode;
    }

    public void setUniqueCode(int uniqueCode)
    {
        this.uniqueCode = uniqueCode;
    }

    public int getTotalCost()
    {
        return totalCost;
    }

    public void setTotalCost(int totalCost)
    {
        this.totalCost = totalCost;
    }
}

