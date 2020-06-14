/*
Tao ra lop thong bao loi-kiem tra du lieu ko hop le
 */
package demo;


public class NewException extends Exception{

    public NewException() {
        super("Invalid data !");
    }
    
    public NewException(String error){
        super(error);
    }
}
