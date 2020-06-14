/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author PC
 */
public class ViduMethodGeneric {

    String[] tensv = {"Phong", "Minh", "Thach", "lam", "Thang"};
    Integer[] diem = {30, 40, 50, 60, 70};

    // ham in ra ds du lieu theo(tham so)
    <T> void display(T[] ds) {
        for (T item : ds) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
       ViduMethodGeneric vd= new ViduMethodGeneric();
        System.out.println("\n Danh sach ten sinh vien: ");
        vd.display(vd.tensv);
        System.out.println("\n Danh sach diem sinh vien: ");
        vd.display(vd.diem);
        
    }
    
}
