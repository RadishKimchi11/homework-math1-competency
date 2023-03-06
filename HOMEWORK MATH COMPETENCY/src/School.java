import java.util.*;

// means that the School class that u created implements interface Comparable with parameter School
// means that School objects can be compared to each other using the compareTo() method

class School implements Comparable<School>{
    private String schName;
    private Address schAddr;
    private Name principal;
    private ArrayList<Dataset> record = new ArrayList<>();


    public School(String n, Address a, Name p){
        schName = n;
        schAddr = a;
        principal = p;
    }

    public String getSchName(){
        return schName;
    }

    public float getAvg(){
        float sum = 0;
        for (Dataset data : record){
            sum += data.getScore();
        }
        return sum / record.size();
    }


    public double getStdDev(){
        double avg = getAvg();

        // calculate the sum of the squared differences from the mean
        double sumOfSquaredDifferences = 0;
        for (Dataset data : record) {
            sumOfSquaredDifferences += Math.pow(data.getScore() - avg, 2);
        }

        // calculate the variance
        double variance = sumOfSquaredDifferences / record.size();

        // return the standard deviation (square root of variance)
        return Math.sqrt(variance);
    }


    public void addDataset (Dataset rec){
        this.record.add(rec);
    }

    // compareTo method is by default already defined under Comparable
    // but here we need to modify it according to how we want it to work
    // to modify, keyword @Override is used
    // but this is only for comparing 2 schools

    @Override
    public int compareTo(School otherSchool) {
        if (this.getAvg() < otherSchool.getAvg()) {
            return 1;
        } else if (this.getAvg() > otherSchool.getAvg()) {
            return -1;
        } else {
            return 0;
        }
    }
}