
import java.util.Arrays;


public class CommonElementsBetweenTwoArrays
{

    public static void main(String[] args) // main static method
    {
        String[] numArray1 = {"Jagdish", "Vipul", "Manish","Rajneekant"}; // using array with string
        String[] numArray2 = {"Jagdish", "Yogesh", "Manish","Rajneekant", };

        for(int i = 0; i < numArray1.length; i++)     // Outer loop
        {
            for(int j = 0; j < numArray2.length; j++)   // inner loop
            {
                if(numArray1[i].equals(numArray2[j]))
                {
                    System.out.println(numArray1[i]);
                    break;
                }
            }
        }
    }
    }








