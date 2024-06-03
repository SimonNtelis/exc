public class TrainingProgram
{
    private String sport;
    private String facility;
    private String coach;
    private String day;
    private String athleteGenders;
    private boolean reservationEveryWeek;
    private int uniqueCode;
    private int minExpirienceLevel;
    private int duration;

    public TrainingProgram(String sport, String facility, String coach, String day, String athleteGenders, boolean reservationEveryWeek, int uniqueCode, int minExpirienceLevel, int duration)
    {
        this.sport = sport;
        this.facility = facility;
        this.coach = coach;
        this.day = day;
        this.athleteGenders = athleteGenders;
        this.reservationEveryWeek = reservationEveryWeek;
        this.uniqueCode = uniqueCode;
        this.minExpirienceLevel = minExpirienceLevel;
        this.duration = duration;
    }

    public String getSport()
    {
        return sport;
    }

    public void setSport(String sport)
    {
        this.sport = sport;
    }

    public String getFacility()
    {
        return facility;
    }

    public void setFacility(String facility)
    {
        this.facility = facility;
    }

    public String getCoach()
    {
        return coach;
    }

    public void setCoach(String coach)
    {
        this.coach = coach;
    }

    public String getDay()
    {
        return day;
    }

    public void setDay(String day)
    {
        this.day = day;
    }

    public String getAthleteGenders()
    {
        return athleteGenders;
    }

    public void setAthleteGenders(String athleteGenders)
    {
        this.athleteGenders = athleteGenders;
    }

    public boolean isReservationEveryWeek()
    {
        return reservationEveryWeek;
    }

    public void setReservationEveryWeek(boolean reservationEveryWeek)
    {
        this.reservationEveryWeek = reservationEveryWeek;
    }

    public int getUniqueCode()
    {
        return uniqueCode;
    }

    public void setUniqueCode(int uniqueCode)
    {
        this.uniqueCode = uniqueCode;
    }

    public int getMinExpirienceLevel()
    {
        return minExpirienceLevel;
    }

    public void setMinExpirienceLevel(int minExpirienceLevel)
    {
        this.minExpirienceLevel = minExpirienceLevel;
    }

    public int getDuration()
    {
        return duration;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }
}
