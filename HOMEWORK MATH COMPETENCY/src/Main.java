import java.util.*;
public class Main
{
    public static void main(String[] args) {
        // create object of SchoolGroup
        SchoolGroup schRec = new SchoolGroup();

        // create object of school
        // fill in the data for schoolname, schAddr, principal name
        School sch1 = new School(
                "SM St Francis Xavier",
                new Address("Jln Kgu Apin- Apin", "89000", "Keningau", "Sabah"),
                new Name("Annie", "Komulakan", "Langgou")
        );

        School sch2 = new School(
                "MRSM TMFS",
                new Address("Jln Sg. Batang", "90000", "Sandakan", "Sabah"),
                new Name("Bun", "Bun", "Ahmad")
        );

        // add both the school object into arraylist of object schRec
        schRec.addSchool(sch1);
        schRec.addSchool(sch2);

        // assign data for dataset variables
        sch1.addDataset(new Dataset(new Name("Jennet" , "Joyce", "William"), "161010", 2020, "Aquamarine", 95.0));
        sch1.addDataset(new Dataset(new Name("Queenferra", "Fuentes", "Narius"), "161038", 2020, "Aquamarine", 90.0));
        sch1.addDataset(new Dataset(new Name("Luodais", "Pro", "Salon"), "171200", 2021, "Zircon", 97.0));
        sch1.addDataset(new Dataset(new Name("Vaseline", "Aloe", "Jelly"), "171201", 2021, "Topaz", 93.0));

        sch2.addDataset(new Dataset(new Name("Grace", "And", "Glow"), "16001", 2020, "Ag", 90.0));
        sch2.addDataset(new Dataset(new Name("Simple", "Micellar", "Water"), "16101", 2020, "Iq", 92.0));
        sch2.addDataset(new Dataset(new Name("Elseve", "Extraordinary", "Oil"), "17111", 2021, "Ak", 96.0));
        sch2.addDataset(new Dataset(new Name("Mary", "Kay", "Mask"), "17056", 2021, "Akh", 99.0));

        schRec.dispPerformance();
        schRec.sortSch();


    }}
