/*
Mo ta 1 doi tuong lop hoc:  ma so, chuong trinh hoc, hoc phi
 */
package data;

public class Batch {
    public String batchno, description;
    public int fee;

    @Override
    public String toString() {
        return String.format("%s, %s, %d", batchno, description, fee);
    }
}
