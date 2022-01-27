import java.util.*;
import java.text.*;

public class CurrencyConversion 
{
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
            
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        String us = currencyFormatter.format(payment);

        Locale locale = new Locale("en", "IN");      
        NumberFormat currencyFormatter1 = NumberFormat.getCurrencyInstance(locale);
        String india = currencyFormatter1.format(payment);
        
    
        NumberFormat currencyFormatter2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = currencyFormatter2.format(payment);
        
        NumberFormat currencyFormatter3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = currencyFormatter3.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}