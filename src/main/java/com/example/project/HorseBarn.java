package com.example.project;

public class HorseBarn {
    /** The stalls in the barn. Each array element holds a reference to the Horse
     *  that is currently occupying the stall. A null value indicates an empty stall.
     */
    private Horse[] stalls;

    /** Initializes stalls to an array with a length equal to numStalls
     *  (all elements remain null initially)
     *
     *  @param numStalls  the number of stalls in the barn
     */
    public HorseBarn(int numStalls) {
        /* to be implemented in part (a) */
        stalls = new Horse[numStalls];
    }

    /** Assigns stalls to reference sampleHorses
     */
    public HorseBarn(Horse[] sampleStalls) {
        /* to be implemented in part (a) */
        stalls = sampleStalls;
    }

    /** Getter/accessor method for stalls
     *
     *  @return  a references to the stalls array
     */
    // to be added in part (a)
    public Horse[] getStalls() {
        return stalls;
    }

    /** Returns a string that shows which horses are in which stalls
     */
    public String horseBarnInfo() {
        /* to be implemented in part (b) */
        String info = "";
        for (int i = 0; i < stalls.length; i ++) {
            if (stalls[i] == null) {
                info += "Stall " + i + ":" + " empty\n";
            }
            else {
                info += "Stall " + i + ": " + stalls[i].horseInfo() + "\n";
            }
        }
        return info;
    }

    /** Places a Horse into stalls at the index indicated by stall
     *
     *  PRECONDITION: stall is a valid index of stalls
     *
     *  @param horse  the Horse object to place into stalls
     *  @param stall  the index of stalls to place the Horse
     */
    public void placeHorse(Horse horse, int stall) {
        /* to be implemented in part (c) */
        stalls[stall] = horse;
    }

    /** Returns the index of the stall that contains the horse with the specified name.
     *
     * Precondition: No two horses in the barn have the same name.
     *
     * @param  name the name of the horse to find
     * @return  the index of the stall containing the horse with the specified name;
     *          -1 if no horse with the specified name is in the barn.
     */
    public int findHorseStall(String name) {
        /* to be implemented in part (d) */
        for (int i = 0; i < stalls.length; i ++) {
            if (stalls[i] != null) {
                if (stalls[i].getName().equals(name)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /** Consolidates the barn by moving horses so that the horses are in adjacent
     *  stalls, starting at index 0, with no empty stall between any two horses.
     *
     *  POSTCONDITION: The order of the horses is the same as before the consolidation.
     */
    public void consolidate() {
        /* to be implemented in part (e) */
        // Horse lastHorse;
        // for (int i = stalls.length - 1; i > 0; i --) {
        //     if(!stalls[i].getName().equals(null)) {
        //         lastHorse = stalls[i];
        //         break;
        //     }
        // }
        // Horse lastHorse = 
        // for (int i = 0; )
        int count = 0;
        Horse[] copy = new Horse[stalls.length];
        for (int i = 0; i < stalls.length; i ++) {
            if (stalls[i] != null) {
                copy[count] = stalls[i];
                count ++;
            }
        }
        stalls = copy;
    }
    public static void main(String[] args) {
        HorseBarn barn1 = new HorseBarn(3);
        barn1.placeHorse(new Horse("Silver",1210), 2);
        barn1.placeHorse(new Horse("Trigger", 1340), 0);
        System.out.println(barn1.findHorseStall("Silver"));
    }
}
