/*
 Minh hoa phuong phap 
 */
package demoMethod;

public class Vidu2 {

    public static void main(String[] args) {
        Circle c = new Circle();//c.r=5
        Vidu2 vd=new Vidu2();
        
        //trc khi goi ham(thay doi BK cua hinh tron):
        //c:la tham so thuc te va c.r=5
        vd.changeR(c);      
        //sau khi ham changeR thuc hien xong ,c.r=10
        
        System.out.println("BK cua hinh tron:"+c.r);//ten doi tuong.ten ham
        System.out.println("DT cua hinh tron:"+c.getArea());
    }
    
    
    //thay doi ban kinh cua hinh tron r = 10
    void changeR(Circle c){//huong doi tuong(Hàm)
        c.r = 10;
        }
    
  }


//o ngoai vd2
class Circle{
    public int r = 5;
    public double getArea(){
        return Math.PI *r*r;
    }
    
}