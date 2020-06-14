#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
int main(){
	float d,r ,cv,dt ;
	printf("hay nhap chieu dai:");
	scanf("%f",&d);
	printf("hay nhap chieu rong:");
	scanf("%f",&r);
	cv=(d+r)*2;
	dt=d*r;
	printf("dt hinh chu nhat:%f",dt);
	printf("cv hinh chun nhat:%f",cv);
}
