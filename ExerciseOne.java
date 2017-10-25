package exercises;

/*
Lesson _01
In this exercise, we will use variables to print a sample ID card
A sample ID Card will look like this:
***************************************
Surya Madhan         Millennium Falcons
Programming                   Team 3647
Proficient in Java            2017-2018
***************************************
Good Luck Completing the exercise!
*/

/*
 * @author Surya
 */

public class ExerciseOne 
{

    public static void main(String[] args) 
	{
		String name, teamName, department, somethingToBragAbout, schoolYear;
        int teamNumber;
		name = "Allison Jung";
		teamName = "Millenium Falcons";
		department = "Programming";
		somethingToBragAbout = "I play flute.";
		schoolYear = "2017-18";
		teamNumber = 3647;
		
		
		System.out.println("***************************************");
		System.out.println(name+"          "+teamName); 
		System.out.println(department+"                        "+teamNumber);
		System.out.println(somethingToBragAbout+"                   "+schoolYear);
		System.out.println("***************************************");
  	}
    
}

