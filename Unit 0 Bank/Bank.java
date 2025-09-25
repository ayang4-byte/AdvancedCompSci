public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }
    
    public String toString() {
        return "This bank has " + numberOfLoanOfficers 
            + " loan officers and " + numberOfTellers + " tellers";
    }

    public int computeTotalEmployees() {
        return numberOfLoanOfficers + numberOfTellers;
    }

    public boolean equals(Bank other) {
        if ((other.numberOfLoanOfficers == this.numberOfLoanOfficers) 
            && (other.numberOfTellers == this.numberOfTellers)) {
            return true;
        } else {
            return false;
        }  
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers = numberOfLoanOfficers + numberToHire;
        } else {
            numberOfTellers = numberOfTellers + numberToHire;
        }
    }

    public double getEmployeeRatio() {
        return numberOfLoanOfficers / (double) numberOfTellers;
    }

    public void fireMembers(int numberToFire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            numberOfLoanOfficers = numberOfLoanOfficers - numberToFire;
        } else {
            numberOfTellers = numberOfTellers - numberToFire;
        }

        if (numberOfLoanOfficers < 0) {
            numberOfLoanOfficers = 0;
        } else if (numberOfTellers < 0) {
            numberOfTellers = 0;
        }
    }

    public void transferEmployee(boolean fromLoanOfficer) {
        if (fromLoanOfficer) {
            numberOfLoanOfficers = numberOfLoanOfficers - 1;
            numberOfTellers = numberOfTellers + 1;
        } else {
            numberOfTellers = numberOfTellers - 1;
            numberOfLoanOfficers = numberOfLoanOfficers + 1;
        }
    }

    public int estimateTotalSalary() {
        return (1000 * (75 * numberOfLoanOfficers) + (45 * numberOfTellers));
    }
}
