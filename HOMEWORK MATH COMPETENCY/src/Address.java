import java.util.*;
class Address{
    private String street;
    private String pcode;
    private String dist;
    private String state;
    private String schAdd;


    public Address (String street, String pc, String dist, String state){
        this.schAdd = street + ", " + pc + ", " + dist + ", " + state;
        this.street = street;
        this.pcode = pc;
        this.dist = dist;
        this.state = state;
    }
}