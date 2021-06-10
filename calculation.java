public int calculation (ArrayList map, int xcoordinate, int ycoordinate) 
{
    //variables
    int difficultyPercentage = wind + naturalHazards;
    
    //chunk of the whole thing
    if (traffic == true) 
    {
        difficultyPercentage+= 100;
    }
    
    difficultyPercentage == difficultyPercentage/3;
    
    return difficultyPercentage;

}