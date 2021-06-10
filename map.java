public class map extends 2dArray () 
{
    //for the object
    public map (int wind, int naturalHazards, boolean traffic) 
    {
        this.wind = wind;
        this.naturalHazards = naturalHazards;
        this.traffic = traffic;
    }
    
    public int wind () 
    {
        return super(wind);
    }

    public int naturalHazards () 
    {
        return super(naturalHazards);
    }

    public boolean traffic () 
    {
        return super(traffic);
    }


}