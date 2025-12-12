public class DecompositionDemo {
    public static void main(String[] args) {
        bigMethodToDecompose();
    }

    public static double[] calculateStepInfo(int[] hours, int[] steps, int[] activeMinutes) {
        // Total and average steps
        // Also find min and max steps and the hour of max steps
        int n = hours.length;
        int totalSteps = 0;
        int minSteps = Integer.MAX_VALUE;
        int maxSteps = Integer.MIN_VALUE;
        int maxStepsHour = -1;
        for (int i = 0; i < n; i++) {
            int s = steps[i];
            totalSteps += s;
            if (s < minSteps)
                minSteps = s;
            if (s > maxSteps) {
                maxSteps = s;
                maxStepsHour = hours[i];
            }
        }
        double avgSteps = totalSteps / (double) n;
        double[] infoArray = new double[5];
        infoArray[0] = minSteps;
        infoArray[1] = maxSteps;
        infoArray[2] = maxStepsHour;
        infoArray[3] = totalSteps;
        infoArray[4] = avgSteps;
        return infoArray;
    }

    // This method is intentionally long and mixes many responsibilities.
    public static void bigMethodToDecompose() {
        // Daily Steps Analysis (12 hours): parallel arrays, arrays only
        int[] hours = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int[] steps = new int[] { 120, 90, 60, 50, 80, 300, 1200, 2200, 2800, 2500, 1800, 900 };
        int[] activeMinutes = new int[] { 2, 1, 0, 0, 1, 10, 35, 50, 55, 48, 32, 15 };

        // Validate equal lengths
        // Make sure all arrays have the same length
        int n = hours.length;
        if (steps.length != n || activeMinutes.length != n) {
            System.out.println("Invalid input: arrays must be the same length.");
            return;
        }
        double[] stepInfo = calculateStepInfo(hours, steps, activeMinutes);

        // Active minutes summary
        // Total active minutes and count of hours with >= 30 active minutes
        int totalActiveMinutes = 0;
        int activeHourCount = 0; // >= 30 minutes counts as active hour
        for (int i = 0; i < n; i++) {
            totalActiveMinutes += activeMinutes[i];
            if (activeMinutes[i] >= 30) {
                activeHourCount += 1;
            }
        }
        double avgActiveMinutes = totalActiveMinutes / (double) n;

        // Morning vs Midday vs Afternoon averages
        // Morning: 0-3, Midday: 4-7, Afternoon: 8-11
        // Calculate average steps for each period
        int sumMorning = 0, cntMorning = 0;
        int sumMidday = 0, cntMidday = 0;
        int sumAfternoon = 0, cntAfternoon = 0;
        for (int i = 0; i < n; i++) {
            if (i <= 3) {
                sumMorning += steps[i];
                cntMorning += 1;
            } else if (i <= 7) {
                sumMidday += steps[i];
                cntMidday += 1;
            } else {
                sumAfternoon += steps[i];
                cntAfternoon += 1;
            }
        }
        double avgMorning = cntMorning == 0 ? 0 : (sumMorning / (double) cntMorning);
        double avgMidday = cntMidday == 0 ? 0 : (sumMidday / (double) cntMidday);
        double avgAfternoon = cntAfternoon == 0 ? 0 : (sumAfternoon / (double) cntAfternoon);

        // Print a small report
        System.out.println("=== Daily Steps Report (Demo) ===");
        System.out.println("Hours recorded: " + n);
        System.out.println("Total steps: " + stepInfo[2]);
        System.out.println("Average steps/hour: " + round2(stepInfo[4]));
        System.out.println("Min steps in an hour: " + stepInfo[0]);
        System.out.println("Max steps in an hour: " + stepInfo[1] + " at hour " + stepInfo[3]);
        System.out.println("Total active minutes: " + totalActiveMinutes);
        System.out.println("Average active minutes/hour: " + round2(avgActiveMinutes));
        System.out.println("Active hours (>=30 min): " + activeHourCount);
        System.out.println("Average steps - Morning(0-3): " + round2(avgMorning));
        System.out.println("Average steps - Midday(4-7): " + round2(avgMidday));
        System.out.println("Average steps - Afternoon(8-11): " + round2(avgAfternoon));

        // Hourly lines
        // Print each hour's data
        System.out.println("--- Hourly (h, steps, activeMin) ---");
        for (int i = 0; i < n; i++) {
            System.out.println(hours[i] + ", " + steps[i] + ", " + activeMinutes[i]);
        }
    }

    // helper to round to 2 decimals without external libs
    private static double round2(double x) {
        return Math.round(x * 100.0) / 100.0;
    }
}
