package Users;

public class Coach extends User
{
    private String sport;
    private String degrees;

    public Coach(String firstName, String lastName, String gender, String contactInformation, int uniqueCode, String dateOfBirth,  String sport, String degrees)
    {
        super(firstName, lastName, gender, contactInformation,dateOfBirth, uniqueCode);

        this.sport = sport;
        this.degrees = degrees;
    }

    public String getSport()
    {
        return sport;
    }

    public void setSport(String sport)
    {
        this.sport = sport;
    }

    public String getDegrees()
    {
        return degrees;
    }

    public void setDegrees(String degrees)
    {
        this.degrees = degrees;
    }
}
