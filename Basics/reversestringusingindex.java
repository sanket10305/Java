import java.util.Scanner;
public class reversestringusingindex
{
    public static void main(String[] args)
    {
        String rev = "";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        
        for(int i=str.length()-1; i>=0; i--) //length() function gives the length of the string
        {
            rev = rev + str.charAt(i); //charAt(i) function extracts a character from the String based on the given index value i, where i=0,1,2,...
        }
        System.out.println("String after being reversed: "+rev);
    }
}
/*Scanner class Input
for char: char ch = sc.next().charAt(0);
for String: String str = sc.nextLine();
*/
/*conversion
string to integer:Interger.parseInt(str)
integer to string:String.valueof(num)
*/