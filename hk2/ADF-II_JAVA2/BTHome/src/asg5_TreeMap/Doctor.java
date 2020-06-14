
package asg5_TreeMap;

import java.io.Serializable;

public class Doctor implements Serializable{
    public String id,name,specialization;
    public int availHours;

    public Doctor() {
    }

    public Doctor(String id, String name, String specialization, int availHours) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.availHours = availHours;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d",id,name,specialization,availHours);
    }

    
}
