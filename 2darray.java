public int 2dArray () 
{
    //making the array
    ArrayList[][] map = new ArrayList[20][20]
    //variables
    int xcoordinate, ycoordinate;
    int difficultyPercentage


    for (int i = 0; i < 20; i++) 
    {
         for (int j = 0; j < 20; j++) 
         {
            //here i was going to automate making objects, but im not sure how
            //make the object use math.random with values from 0 to 100 (percentage) and randomly set the traffic either true or not
         }
    }
    
    //calling methods
    xcoordinate, ycoordinate =  input(xcoordinate, ycoordinate);
    difficultyPercentage = calculation(map, xcoordinate, ycoordinate);
    
    return difficultyPercentage, xcoordinate, ycoordinate;//don't know how to properly send multiple values
    
}