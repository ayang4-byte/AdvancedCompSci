public class Home {
    private String address;
    private String username;
    private String ownerName;
    private int cleanlinessLevel;
    private boolean isScheduled;

    public Home(String address, String ownerName, int cleanlinessLevel) {
        this.address = address;
        this.ownerName = CleanUtils.fixName(ownerName);
        this.username = CleanUtils.generateUsername(this.ownerName);
        this.cleanlinessLevel = CleanUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.isScheduled = false;
    }

    public Home() {
        this.username = CleanUtils.generateUsername(CleanUtils.fixName(ownerName));
        this.address = "611 Toyopa";
        this.ownerName = "John Doe";
        this.cleanlinessLevel = 9;
        this.isScheduled = false;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = CleanUtils.fixName(ownerName);
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = CleanUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isScheduled() {
        return isScheduled;
    }

    public void setIsScheduled(boolean isScheduled) {
        this.isScheduled = isScheduled;
    }

    public String toString() {
        String address = "Address: " + this.address;
        String owner = "Owner: " + this.ownerName;
        String username = "Username: " + this.username;
        String cleanlinessLevel = "Cleanliness Level: " + this.cleanlinessLevel;
        String yesOrNo = "No";
        if (this.isScheduled) {
            yesOrNo = "Yes";
        }
        String isScheduled = "Is Scheduled for Cleaning? " + yesOrNo;

        return "== ABOUT HOME ==\n" + address 
                                    + "\n" 
                                    + owner 
                                    + "\n" 
                                    + username 
                                    + "\n" 
                                    + cleanlinessLevel 
                                    + "\n" 
                                    + isScheduled;
    }

    public boolean equals(Home other) {
        if (this.toString().equals(other.toString())) {
            return true;
        }
        return false;
    }

    
}
