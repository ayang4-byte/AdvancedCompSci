public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        for (int i = 0; i < hallwayToClean.length; i++) {
            if (hallwayToClean[i] < 0) {
                hallwayToClean[i] = 0;
            }
        }
        hallway = hallwayToClean;
        if (startingPosition < 0) {
            startingPosition = 0;
        } else if (startingPosition >= hallway.length) {
            startingPosition = hallway.length - 1;
        }
        position = startingPosition;
        isFacingRight = true;
        // to-do: implement constructor
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        if (position == (hallway.length - 1) && isFacingRight == true) {
            return true;
        } else if (position == 0 && isFacingRight == false) {
            return true;
        }
        return false;
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        if (hallway[position] > 0) {
            hallway[position] = hallway[position] - 1;
            if (hallway[position] == 0) {
                if (isRobotBlockedByWall() == true) {
                    isFacingRight = ! isFacingRight;
                } else if (isFacingRight() == true) {
                    position = position + 1;
                } else {
                    position = position - 1;
                }
            }
        } else {
            if (isRobotBlockedByWall() == true) {
                isFacingRight = ! isFacingRight;
            } else if (isFacingRight() == true) {
                position = position + 1;
            } else {
                position = position - 1;
            }
        } 
    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        while (hallIsClear() != true) {
            this.move();
            count = count + 1;
        }
        // to-do: implement this method

        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        // to-do: implement this method
        int count = 0;
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] == 0) {
                count = count + 1;
            }
        }
        if (count == hallway.length) {
            return true;
        }
        return false;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        for (int i = 0; i < hallway.length; i++) {
            System.out.print(hallway[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < hallway.length; i++) {
            if (i == position) {
                if (isFacingRight == true) {
                    System.out.print(">");
                } else {
                    System.out.print("<");
                }
            } else {
                System.out.print("  ");
            }
        }
        System.out.println("");
    }


    public int[] getHallway() {
        return hallway;
    }


    public void setHallway(int[] hallway) {
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] < 0) {
                hallway[i] = 0;
            }
        }
        this.hallway = hallway;
    }


    public int getPosition() {
        return position;
    }


    public void setPosition(int position) {
        if (position < 0) {
            position = 0;
        } else if (position >= hallway.length) {
            position = hallway.length - 1;
        }
        this.position = position;
    }


    public boolean isFacingRight() {
        return isFacingRight;
    }


    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }
}

