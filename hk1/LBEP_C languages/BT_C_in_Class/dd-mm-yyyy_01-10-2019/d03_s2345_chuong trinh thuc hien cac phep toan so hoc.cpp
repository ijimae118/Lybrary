#include <stdio.h>
#include <conio.h>
int main(){
	//chuong trinh thuc hien cac phep toan so hoc
	
	// khai bao 2 bien bo nho a,b -kieu so nguyen
	int a,b;
	// su dung phep gan :gan cho a=5 ,b=12;
	a=5;
	b=12;
	//khai bao bien so nguyen c-chua ket qua tinh toan cua a,b
	int c=a+b;
	//in ket qua cua phep cong a+b
	printf("a+b=%d\n",c);
	printf("%d+%d=%d\n\n",a,b,c);
	// in ket qua cac phep tru ,nhan ,chnoia, phan du cua so so a,b
	printf("%d - %d=%d\n",a,b,a-b);
	printf("%d * %d=%d\n",a,b,a*b);
	printf("%d / %d=%f\n",a,b,(float)a/b);
	printf("%d %% %d=%d\n\n",a,b,a%b);
	//in ket qua cua cac phep toan tang(++) va giam(--)
	c=a++;
	printf("c=%d,a=%d\n\n",c,a);
	c=++a;
	printf("c=%d,a=%d\n\n",c,a);
	printf("c=%d \n",c);
	
}

