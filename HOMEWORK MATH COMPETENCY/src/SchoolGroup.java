import java.util.Scanner;
import java.util.*;
class SchoolGroup{
    private ArrayList<School> school = new ArrayList<>();
    Scanner take = new Scanner(System.in);
    public SchoolGroup (){

    }

    public void addSchool(School s){
        school.add(s);
    }

    public void dispPerformance(){
        for (School sch : school){
            System.out.println(sch.getSchName() );
            System.out.println("Average : " + sch.getAvg());
            System.out.println("Standard deviation : " + sch.getStdDev());
            System.out.println();
        }
    }

    public void sortSch(){
        Collections.sort(school);
        System.out.println("School sorted in ascending order of average score");
        for (School sch : school){
            System.out.println(sch.getSchName() + " : " + sch.getAvg());
        }
    }
}