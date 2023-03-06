import java.util.*;
class Name {
    private String fname;
    private String mname;
    private String lname;
    private String fullName;

    public Name(String f, String m, String l){
        this.fullName = f + " " + m + " " + l;
        fname = f;
        mname = m;
        lname = l;
    }

    public void setLongname (String f, String m, String l){
        this.fullName = f + " " + m + " " + l;
        fname = f;
        mname = m;
        lname = l;
    }

    public String getFull(){
        return fullName;
    }
}