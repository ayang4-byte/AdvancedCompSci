public class TheaterMember {
    private String name;
    private boolean[] loyaltyCredits;

    public TheaterMember(String name) {
        this.name = name;
        this.loyaltyCredits = new boolean[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    public void grantLoyaltyCredit() {
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == false) {
                loyaltyCredits[i] = true;
                break;
            }
        }
    }

    public int countLoyaltyCredits() {
        int count = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                count = count + 1;
            }
        }
        return count;
    }

    public String determineMembershipStatus() {
        if (6 <= countLoyaltyCredits()) {
            return "Gold Member";
        } else if (3 <= countLoyaltyCredits() && countLoyaltyCredits() <= 5) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }
    }

    public String loyaltyHistory() {
        String loyaltyHistory = "[";
        for (int i = 0; i < loyaltyCredits.length - 1; i++) {
            if (loyaltyCredits[i] == true) {
                loyaltyHistory = loyaltyHistory + "X, ";
            } else {
                loyaltyHistory = loyaltyHistory + "-, ";
            }
        }
        if (loyaltyCredits[loyaltyCredits.length - 1] == true) {
            loyaltyHistory = loyaltyHistory + "X]";
        } else {
            loyaltyHistory = loyaltyHistory + "-]";
        }
        return loyaltyHistory;
    }

    public String toString() {
        return name + "(" + determineMembershipStatus() + "), Loyalty History: "
                + loyaltyHistory();
    }

    public boolean equals(TheaterMember other) {
        if (other.toString().equals(this.toString())) {
            return true;
        }
        return false;
    }

}
