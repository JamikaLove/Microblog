public class User
{
    private static int nextUserNumber = 0;
    private int userNumber;
    private String name;
    private String userName;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String webAddress;
    
    public User(String name, String userName, String firstName, String lastName, String emailAddress, String webAddress)
    {
        this.userNumber = nextUserNumber;
        nextUserNumber++;
        this.name = name;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.webAddress = webAddress;
        
    }
    public String getName()
    {
        return name;
    }
    public String getuserName()
    {
        return userName;
    }
    public int getuserNumber()
    {
        return userNumber;
    }
    public String getfirstName()
    {
        return firstName;
    }
    public String getlastName()
    {
        return lastName;
    }
    public String getemailAddress()
    {
        return emailAddress;
    }
    public String getwebAddress()
    {
        return webAddress;
    }
}
    
        
    
