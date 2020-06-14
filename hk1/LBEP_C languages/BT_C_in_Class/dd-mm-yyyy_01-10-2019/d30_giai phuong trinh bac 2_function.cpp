#include <stdio.h>
#include <conio.h>
//#include <string.h>
#include <math.h> 
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
// khai bao prototype cua ham gtp2
int gtp2(int a,int b,int c,double &x1,double &x2);// day la protptype
int main(){
	int a,b,c;
	double x,y;
	printf("giai phuong trinh bac 2:ax2+bx+c=0\n");
	printf("nhap he so a:");scanf("%d",&a);
	printf("nhap he so b:");scanf("%d",&b);
	printf("nhap he so c:");scanf("%d",&c);
// goi ham gtp2 de giai phuong trinh bac 2
int r= gtp2(a,b,c,x,y);
if(r==0){
printf(">> phuong trinh vo nghiem");
}
else if(r==1){printf(">>phuong trinh co nghiem kep:x1=x2=%.2f",x);
}
else{
	printf(">>phuong trinh co 2 nghiem phan biet :\n");
	printf("x1=%.2f,x2=%.2f\n",x,y);
}
}
/*
 dinh nghia ham gt2 -giai pt bac 2 dang thuc ax2+bx+c=0
    -return 0:if vo nghiem,1:co nghiem kep,2:co 2 nghiemphan biet
    -tham so :a,b,c :dai dien 3 he so a,b,c va x1,x2 :chua nghiem cua phuong trinh
*/
int gtp2(int a,int b,int c,double &x1,double &x2){
	double delta=b*b-4*a*c;
	if(delta<0){
		return 0;// phuong trinh vo nghiem
	}
	else if(delta==0){
		x1=x2=-b/(2*a);
		return 1;// pt co nghiem kep
	}
	else{
		delta= sqrt(delta);
		x1=(-b-delta)/(2*a);
		x2=(-b+delta)/(2*a);
		return 2;// pt co 2 nghiem phan biet
	}
}    
