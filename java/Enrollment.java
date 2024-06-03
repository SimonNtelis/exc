public class Enrollment implements PriceList
{
    private String athlete;
    private int date;
    private int cost;
    private int discountPercentage;
    private int uniqueCode;

    public Enrollment(String athlete, int date, int cost, int discountPercentage, int uniqueCode)
    {
        this.athlete = athlete;
        this.date = date;
        this.cost = cost;
        this.discountPercentage = discountPercentage;
        this.uniqueCode = uniqueCode;
    }

    public double calculateTotalPrice()
    {
        return 0;
    }

    public String getAthlete()
    {
        return athlete;
    }

    public void setAthlete(String athlete)
    {
        this.athlete = athlete;
    }

    public int getDate()
    {
        return date;
    }

    public void setDate(int date)
    {
        this.date = date;
    }

    public int getCost()
    {
        return cost;
    }

    public void setCost(int cost)
    {
        this.cost = cost;
    }

    public int getDiscountPercentage()
    {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage)
    {
        this.discountPercentage = discountPercentage;
    }

    public int getUniqueCode()
    {
        return uniqueCode;
    }

    public void setUniqueCode(int uniqueCode)
    {
        this.uniqueCode = uniqueCode;
    }
}
