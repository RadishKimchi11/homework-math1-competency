import java.util.*;
class Dataset {
    private Name studName;
    private String id;
    private int year;
    private String studClass;
    private double score;

    public Dataset(Name n, String id, int year, String studClass, double score){
        studName = n;
        this.id = id;
        this.year = year;
        this.studClass = studClass;
        this.score = score;
    }


    public double getScore(){
        return score;
    }

    public double getYear(){
        return year;
    }
}