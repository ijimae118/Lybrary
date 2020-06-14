/*
Mo ta 1 san pham, bao gom:
- thuoc tinh: ma so, ten, don gia
- phuong thuc toString()
 */
package data;

public class Product {
    public String id, name;
    public int price;

    @Override
    public String toString() {
        return String.format("%s, %s, %d", id, name, price);
    }
}
