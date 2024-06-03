public class Sport
{
    private String sportName;
    private boolean professionalsOnly;

    public Sport(String sportName, boolean professionalsOnly)
    {
        this.sportName = sportName;
        this.professionalsOnly = professionalsOnly;
    }

    public String getSportName()
    {
        return sportName;
    }

    public void setSportName(String sportName)
    {
        this.sportName = sportName;
    }

    public boolean isProfessionalsOnly()
    {
        return professionalsOnly;
    }

    public void setProfessionalsOnly(boolean professionalsOnly)
    {
        this.professionalsOnly = professionalsOnly;
    }
}
