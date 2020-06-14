/*
Mo ta 1 san pham ,bao gom:
-thuoc tinh:ma so,ten,don gia
-phuong thuc toString()
 */
package data;

/**
 *
 * @author PC
 */
public class Product implements java.io.Serializable{//ghi theo dang doi tuong thi can thiet imp...se
    public String id,name;
    public int price;

    @Override
    public String toString() {
        return String.format("%s,%s,%d",id,name,price);
    }
    
    
    
}
