package Users;

public class User
{
    private String firstName;
    private String lastName;
    private String gender;
    private String contactInformation;
    private int uniqueCode;
    private String dateOfBirth;

    public User(String firstName, String lastName, String gender, String contactInformation, String dateOfBirth, int uniqueCode)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.contactInformation = contactInformation;
        this.uniqueCode = uniqueCode;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getContactInformation()
    {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation)
    {
        this.contactInformation = contactInformation;
    }

    public int getUniqueCode()
    {
        return uniqueCode;
    }

    public void setUniqueCode(int uniqueCode)
    {
        this.uniqueCode = uniqueCode;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }
}
