package Users;

public class Athlete extends User
{
    private boolean professional;
    private int experienceLevel;

    public Athlete(String firstName, String lastName, String gender, String contactInformation, String dateOfBirth, int uniqueCode, boolean professional, int experienceLevel)
    {
        super(firstName, lastName, gender, contactInformation, dateOfBirth, uniqueCode);

        this.professional = professional;
        this.experienceLevel = experienceLevel;

    }

    public int getExperienceLevel()
    {
        return experienceLevel;
    }

    public void setExperienceLevel(int experienceLevel)
    {
        this.experienceLevel = experienceLevel;
    }

    public boolean isProfessional()
    {
        return professional;
    }

    public void setProfessional(boolean professional)
    {
        this.professional = professional;
    }
}
