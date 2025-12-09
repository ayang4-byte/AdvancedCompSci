public class Theater {
    private String theaterName;
    private TheaterMember[] registeredMembers;

    public Theater(String theaterName, TheaterMember[] registeredMembers) {
        this.theaterName = theaterName;
        this.registeredMembers = registeredMembers;
    }

    public Theater(String theaterName, int initialCapacity) {
        this.theaterName = theaterName;
        registeredMembers = new TheaterMember[initialCapacity];
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public TheaterMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public void setRegisteredMembers(TheaterMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        TheaterMember[] newArray = new TheaterMember[2 * registeredMembers.length];
        for (int i = 0; i < registeredMembers.length; i++) {
            newArray[i] = registeredMembers[i];
        }
        setRegisteredMembers(newArray);
    }

    public void registerMember(TheaterMember member) {
        int count = 0;
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                registeredMembers[i] = member;
                break;
            } else {
                count = count + 1;
            }
        }
        if (count == registeredMembers.length) {
            increaseCapacity();
            registeredMembers[count] = member;
        }
    }

    public String toString() {
        String title = "==" + theaterName + "==\n";
        for (int i = 0; i < registeredMembers.length; i++) {
            title = title + registeredMembers[i].toString() + "\n";
        }
        return title;
    }

    public boolean deleteMember(TheaterMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i].equals(member)) {
                registeredMembers[i] = null;
                return true;
            }
        }
        return false;
    }
}
