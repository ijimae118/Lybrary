/*
Create class LaptopCatalog in package Goods for managing a collection of Computers
- Fields:
max, cnt, cList – array of laptops
No-arg constructor to initialize the all the fields.
- Methods:
- addLaptop() - add a new laptop into array
- search (String laptopName) - search laptops by the name accepted by user.
- displayAll() - display all computers.
- remove(String laptopID): remove laptop by id
 */
package goods;

public class LaptopCatalog {

    final int max = 5;
    int cnt = 0;
    Laptop[] cList = new Laptop[max];

    public void addLaptop() {
        if (cnt == max) {
            System.out.println("Full memory");
            return;
        }
        Laptop a = new Laptop();
        a.accept();
        
        //làm cho ID ko in trùng:
        int count=0;
        for (int i = 0; i < cnt; i++) {
            if (a.id.equalsIgnoreCase(cList[i].id)) {
                count++;
            }
        }
        if (count!=0) {
            System.out.println("ID bị trùng.Mời nhập lại");
        } else {
        cList[cnt] = a;
        cnt++;
        }
        
    }

    public void search(String laptopName) {
        if (cnt == 0) {
            System.out.println("Don't have any memory");
        } else {
            int count = 0;
            for (int i = 0; i < cnt; i++) {
                if (cList[i].name.contains(laptopName)) {//equals cực kì chính xác ,equalIng chính xác chỉ ko phân biệt viết hoa vs thường ,contains ko cần chính xác lắm chỉ cần nhấn những chữ liên quan là nó tự tìm ra
                    cList[i].printInfo();
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Can't find out LaptopName");
            }
        }
    }

    public void displayAll() {
        if (cnt == 0) {
            System.out.println("Don't have any memory");
            return;
        }
        for (int i = 0; i < cnt; i++) {
            System.out.println(cList[i].toString());//toString có hay ko cũng đc vì nó auto khi gọi sout
        }
    }
    
    public void remove(String laptopID){
        if (cnt == 0) {
            System.out.println("Don't have any memory");
            return;
        }
        int count=0;
        for (int i = 0; i < cnt; i++) {
            if (cList[i].id.equalsIgnoreCase(laptopID)) {
                for (int j = i; j < cnt-1; j++) {
                    cList[j]=cList[j+1];
                }
                cnt--;
                
                count++;
                System.out.printf("đã xóa laptop %s \n",laptopID);
                break;
            }          
        }
        if (count==0) {
            System.out.println("Khong tim thay du lieu yeu cau.");
        }    
    }

}
