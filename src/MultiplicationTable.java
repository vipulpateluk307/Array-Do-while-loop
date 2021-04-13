public class MultiplicationTable
{
    public static void main(String[] args)  // static main method
    {


        int num1 = 1;  // integer
        int num2 = 2;
        int j = 1;
        int k = 1;
        // use do while loop
        do
            {
            System.out.println(num1 + " * " + j + " = " + num1 * j);
            j++;

        }
        while (j <= 3);
        do {
            System.out.println(num2 + " * " + k + " = " + num2 * k);
            k++;
        }
        while (k <= 3);


    }
}
