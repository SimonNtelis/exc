public class TrainingProgramReservation
{
    private String athlete;
    private String trainingProgram;
    private int uniqueCode;
    private int date;

    public TrainingProgramReservation(String athlete, String trainingProgram, int uniqueCode, int date)
    {
        this.athlete = athlete;
        this.trainingProgram = trainingProgram;
        this.uniqueCode = uniqueCode;
        this.date = date;
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

    public int getDate()
    {
        return date;
    }

    public void setDate(int date)
    {
        this.date = date;
    }
}
