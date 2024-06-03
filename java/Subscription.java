public class Subscription implements PriceList
{
    private String athlete;
    private String trainingProgram;
    private int uniqueCode;
    private int monthlyCost;

    public Subscription(String athlete, String trainingProgram, int uniqueCode)
    {
        this.athlete = athlete;
        this.trainingProgram = trainingProgram;
        this.uniqueCode = uniqueCode;
        this.monthlyCost = 0;
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

    public String getTrainingProgram()
    {
        return trainingProgram;
    }

    public void setTrainingProgram(String trainingProgram)
    {
        this.trainingProgram = trainingProgram;
    }

    public int getUniqueCode()
    {
        return uniqueCode;
    }

    public void setUniqueCode(int uniqueCode)
    {
        this.uniqueCode = uniqueCode;
    }

    public int getMonthlyCost()
    {
        return monthlyCost;
    }

    public void setMonthlyCost(int monthlyCost)
    {
        this.monthlyCost = monthlyCost;
    }
}
