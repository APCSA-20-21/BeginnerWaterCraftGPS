public static void messaging (int difficultyPercentage, int xcoordinate, int ycoordinate) 
{
    //messaging
    System.out.print("Looks like the area that you chose: [" + xcoordinate + " , " + ycoordinate + "] is ");
    
    //ifs are for the reccomendations to navigate or not
    if(difficultyPercentage <= 20) 
    {
        System.out.println("fairly easy to navigate with a score of: ");
    } else if (difficultyPercentage <= 40) 
    {
        System.out.println("moderately difficult to navigate with a score of: ");
    } else if (difficultyPercentage <= 60) 
    {
        System.out.println("Hard to navigate with a score of: ");
    } else if (difficultyPercentage <= 80) 
    {
        System.out.println("Dangerous to navigate with a score of: ");
    } else 
    {
        System.out.println("EXTREMELY Dangerous to navigate with a score of: ");
    }
    
    System.out.print(difficultyPercentage);
    
}