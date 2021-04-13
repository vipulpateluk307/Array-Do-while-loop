public class TotalNumberOfAInThatString
{
    public static void main(String[] args) // static method
    {
        String str = ("america,ahmedabad"); //variable declaration
        int count=0;
        int i=0;
        // do while condition
        do{
            if(str.charAt(i)=='a'){    // this condition is used for count a
                count++;
            }
            i++;
        }while(i<str.length());
//display the total number of a  in te given string
        System.out.print("Total number of 'a' in string : " + count);
    }
}
