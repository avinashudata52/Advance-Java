package lambda.demo;
import java.util.*;
interface Validator
{
    boolean validate(String input);
}
class ValidationDemo
{
    public static void main(String args[])
    {
        String regex = "[A-Z]{5}[1-9]{4}[A-Z]{1}";
        Validator v = (input)->
        {
            boolean status = input.matches(regex);
            return status;
        };

        Scanner sc =  new Scanner (System.in);
        System.out.println("Enter Pan Number");
        String pan = sc.next();
        boolean result = v.validate(pan);
        if(result)
        {
            System.out.println("Pan IS Valid");
        }
        else
        {
            System.out.println("Pan IS not Valid");
        }

    }
}
