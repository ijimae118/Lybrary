#include <stdio.h>
#include <conio.h>
//#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	// chuong trinh ti nh dien tich va chu vi hinh tron
	int r;
	float PI=3.14;
	// nhap bk hinh tron
	printf("vui long nhap ban kinh hinh tron:");
	scanf("%f",&r);
	// tinh dien tich va chu vi hinh tron
	float area=PI*r*r;
	float perimeter=2*PI*r;
	// in ket qua ra man hinh
	printf("\n Dien tich hinh tron %.2f",area);
	printf("Chu vi hinh tron %.2f",perimeter);
	
	

}

