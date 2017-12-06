

public class Post

{
    private static int nextPostNumber=0;
    private int postNumber;
    private String userName;
    private String postContent;
    
    
    
   
    
    public Post(String userName,  String postContent)
    {
        this.postNumber=nextPostNumber;
        nextPostNumber++;
        this.userName = userName;
        this.postContent = postContent;
        
    }
    public String getUsername()
    {
        return userName;
    }
    public String getPostContent()
    {
        return postContent;
    }
    public int getPostNumber()
    {
        return postNumber;
    }
    
    
}
    
