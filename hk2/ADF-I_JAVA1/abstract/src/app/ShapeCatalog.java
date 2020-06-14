/*
*Lop quan ly danh sach doi tuong hinh hoc: hinh tron va hinh chu nhat
 */
package app;

import data.*;

public class ShapeCatalog {
    // Khai bao mang chua cac doi tuonghinh hoc

    final int max = 10;
    int index = 0;
    // khai bao mang chua cac doi tuong hinh hoc
    Shape[] ds = new Shape[max];

    // ham them 1 doi tuong hinh chu nhat vo ds
    public void addRect() {
        if (index == max) {
            System.out.println("HT het cho luu tru");
            return;
        }

        Rectangle r = new Rectangle();
        r.input();

        ds[index] = r;

        index++;
    }
    // ham them 1 doi tuong hinh tron vo ds

    public void addCircle() {
        if (index == max) {
            System.out.println("HT het cho luu tru");
            return;
        }

        Circle r = new Circle();//cung avarible cung ko sao
        r.input();

        ds[index] = r;

        index++;
    }
    // ham in ra tat ca cac doi tuong hinh hoc trong ds
    public void display(){
        if (index==0) {
            System.out.println("HT chua co du lieu !!!");
            return;
        }
        System.out.println(">>Danh sach cac doi tuong hinh hoc<<");
        for (int i = 0; i < index; i++) {
            //in ra them dong thong bao 
            //hinh  tron
            //dt=?,cv=?
            //hinh chu nhat
            //dt=?,cv=?
            ds[i].output();
        }
    }
    // ham in ra danh sach cac binh vuong(hinh cn,co dai = rong)
    public void displaySquare(){
         if (index==0) {
            System.out.println(">>HT chua co du lieu ");
            return;
        }
       int demSquare=0;
        for (int i = 0; i < index; i++) {
            if (ds[i] instanceof Rectangle ) {
                Rectangle r = (Rectangle) ds[i];//downcast
                if(r.length==r.width){
                ds[i].output();
                demSquare++;
                }
            }
        }// ket thuc for
        if (demSquare==0) {
            System.out.println(">>HT ko co hinh vuong!!!");
        }
    }
    
    public void Square(){//kq: ko ra , no in ra het???
         if (index==0) {
            System.out.println(">>HT chua co du lieu ");
            return;
        }
         int n=0;
          Rectangle a= new Rectangle();
        for (int i = 0; i < index; i++) {           
            if (a.length == a.width) {
                ds[i].output();
                n++;
            }
        }
        if (n==0) {
            System.out.println(">>Ko co hinh vuong");
        }
    }
}
