public class Facility
{
    private String facilityName;
    private int maxAthletes;

    public Facility(String facilityName, int maxAthletes)
    {
        this.facilityName = facilityName;
        this.maxAthletes = maxAthletes;
    }

    public String getFacilityName()
    {
        return facilityName;
    }

    public void setFacilityName(String facilityName)
    {
        this.facilityName = facilityName;
    }

    public int getMaxAthletes()
    {
        return maxAthletes;
    }

    public void setMaxAthletes(int maxAthletes)
    {
        this.maxAthletes = maxAthletes;
    }
}
