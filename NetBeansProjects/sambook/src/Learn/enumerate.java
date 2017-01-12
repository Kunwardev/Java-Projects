package Learn;

public enum enumerate
{
    kunwar("nice","22"),
    dev("good","12"),
    ujwal("finicky","8");
    
    private final String desc;
    private final String year;

    private enumerate(String description, String birthyear)
    {
        desc = description;
        year = birthyear;
    }
    
    public String desc()
    {
        return desc;
    }
    
    public String year()
    {
        return year;
    }
}
