public class OrderProcessor {
    public static void itemSummary(double price, String name, String[] expensiveItemsTemp, int premiumCount) {
        // Fully independent
        // Just prints a bunch of stuff, so doesn't need to pass the information around
        if (price > 50.0) {
            expensiveItemsTemp[premiumCount] = name;
            premiumCount += 1;
            System.out.println(name + " is a premium item at $" + price);
        } else {
            System.out.println(name + " is a regular item at $" + price);
        }
    }

    public static double itemTotal(Item[] items, double price, int quantity, double subtotal) {
        // Calculate item total
        // This was the first one I did
        // I encountered a lot of trouble because I didn't want to copy the for each
        // loop to more than one method
        // I broke this one off because this one is relatively independent
        // This one is kind of recursive, because I'm modifying a variable I'm calling
        double itemTotal = price * quantity;
        subtotal += itemTotal;
        return subtotal;
    }

    public static String[] trimExpensiveItems(int premiumCount, String[] expensiveItemsTemp) {
        // Trim premium items to exact size
        // This one is fully independent
        // Relatively self-explanatory
        String[] expensiveItems = new String[premiumCount];
        for (int i = 0; i < premiumCount; i++) {
            expensiveItems[i] = expensiveItemsTemp[i];
        }
        return expensiveItems;
    }

    public static double calculateTax(double subtotal, double taxRate) {
        // Very straightforward - but needed to separate from totals
        double tax = 0;
        if (subtotal > 0) {
            tax = subtotal * taxRate;
        }
        return tax;
    }

    public static double calculateTotal(double subtotal, double tax) {
        // see calculateTax
        double total = 0;
        if (subtotal > 0) {
            total = subtotal + tax;
        }
        return total;
    }

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        // I left the printed summary in because I didn't think it was really necessary
        // to put the print statements in a separate method
        double subtotal = 0;
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;
        for (Item item : items) {
            String name = item.getName();
            double price = item.getPrice();
            int quantity = item.getQuantity();

            subtotal = itemTotal(items, price, quantity, subtotal);
            itemSummary(price, name, expensiveItemsTemp, premiumCount);
        }
        String[] expensiveItems = trimExpensiveItems(premiumCount, expensiveItemsTemp);
        double tax = calculateTax(subtotal, taxRate);
        double total = calculateTotal(subtotal, tax);

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);

        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }
}
