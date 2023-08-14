import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> exchangeRates = new HashMap<>();
        
        // Populate exchange rates (replace with actual rates)
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.72);
        exchangeRates.put("INR", 74.33); // Example INR exchange rate
        // Add more currencies and their exchange rates
        
        System.out.println("Currency Converter");
        System.out.println("------------------");
        
        while (true) {
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            
            System.out.print("Enter source currency (e.g., USD, EUR, GBP, INR): ");
            String sourceCurrency = scanner.next().toUpperCase();
            
            System.out.print("Enter target currency (e.g., USD, EUR, GBP, INR): ");
            String targetCurrency = scanner.next().toUpperCase();
            
            if (exchangeRates.containsKey(sourceCurrency) && exchangeRates.containsKey(targetCurrency)) {
                double sourceRate = exchangeRates.get(sourceCurrency);
                double targetRate = exchangeRates.get(targetCurrency);
                double convertedAmount = (amount / sourceRate) * targetRate;
                
                System.out.println(amount + " " + sourceCurrency + " is approximately " + convertedAmount + " " + targetCurrency);
            } else {
                System.out.println("Invalid currency codes. Please enter valid currency codes.");
            }
            
            System.out.print("Do you want to convert another currency? (Y/N): ");
            String continueChoice = scanner.next();
            if (!continueChoice.equalsIgnoreCase("Y")) {
                System.out.println("Exiting the currency converter.");
                break;
            }
        }
        
        scanner.close();
    }
}
