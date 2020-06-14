#include <stdio.h>
#include <conio.h>
//#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
void circle(float r,float &dt,float &cv);
float PI=3.14;
int main(){
		// chuong trinh ti nh dien tich va chu vi hinh tron
	float r;
	float area,perimeter;
	// nhap bk hinh tron
	printf("vui long nhap ban kinh hinh tron:");
	scanf("%f",&r);
	// tinh dien tich va chu vi hinh tron
	circle(r,area,perimeter);
	// in ket qua ra man hinh
	printf("\n Dien tich hinh tron %.2f\n",area);
	printf("Chu vi hinh tron %.2f",perimeter);

}
void circle(float r,float &dt,float &cv){// & dung de thay doi dia chi bo nho
	dt=PI*r*r;
	cv=2*PI*r;
}

