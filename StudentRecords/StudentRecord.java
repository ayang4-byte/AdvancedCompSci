public class StudentRecord {
    // instance variables
    private String name;
    private int[] scores;

    // constructors
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public String toString() {
        String result = name + ": [" + scores[0];
        for (int i = 1; i < scores.length; i++) {
            result = result + ", " + scores[i];
        }
        result = result + "]";
        return result;
    }

    public boolean equals(StudentRecord other) {
        if (this.toString().equals(other.toString())) {
            return true;
        }
        return false;
    }

    public double getAverage(int first, int last) {
        double average = (scores[first] + scores[last]) / 2;
        return average;
    }

    /*
     * Determines if each successive value in scores is greater
     * than or equal to the previous value
     * 
     * @return true if student has improved, false otherwise
     */
    public boolean hasImproved() {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /*
     * The method determines if the student has improved and returns the average
     * score appropriately:
     * If the student has improved, returns the average
     * of the top half of the scores array.
     * Otherwise, returns the average of all of the values in scores
     * 
     * @return the double average of test scores
     */

    public double getFinalAverage() {
        if (hasImproved() == true) {
            double finalAverage = getAverage(scores.length / 2, scores.length);
            return finalAverage;
        } else {
            double finalAverage = getAverage(0, scores.length);
            return finalAverage;
        } 
    }

    public int getTestScore(int testNumber) {
        if (testNumber < 1 || testNumber > scores.length) {
            return -1;
        }
        return scores[testNumber - 1];
    }
}
