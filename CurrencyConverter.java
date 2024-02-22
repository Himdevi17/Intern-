
    import java.util.Scanner;
// Import necessary classes for HTTP requests if making real API calls

    public class CurrencyConverter {
        // Placeholder method to fetch the exchange rate
        private static double getExchangeRate(String baseCurrency, String targetCurrency) {
            // In a real application, you would make an HTTP request to an API here.
            // This is a placeholder value.
            return 0.74; // Example: 1 USD to EUR
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Currency Converter");
            System.out.print("Enter base currency (e.g., USD): ");
            String baseCurrency = scanner.next().toUpperCase();

            System.out.print("Enter target currency (e.g., EUR): ");
            String targetCurrency = scanner.next().toUpperCase();

            System.out.print("Enter amount to convert: ");
            double amount = scanner.nextDouble();

            double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);
            double convertedAmount = amount * exchangeRate;

            System.out.println(amount + " " + baseCurrency + " = " + convertedAmount + " " + targetCurrency);
        }
    }

