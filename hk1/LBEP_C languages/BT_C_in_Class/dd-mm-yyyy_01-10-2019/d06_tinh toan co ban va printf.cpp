#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
int main(){
	char sp1[31] ="Laptop Dell";
	int sl1=1;
	float dg1=999.99;
	char sp2[31] ="Mouse";
	int sl2=3;
	float dg2=17.893;
	printf("======Hoa don======\n");
	//%20s=>20 trc s la do rong(cot)
	//%-20s=> dau - de canh trai
	//%09 => o de tao so o dang trc
	printf("1. %-20s %3d %8.2f %010.2f \n",sp1,sl1,dg1,sl1*dg1);
	printf("2. %-20s %3d %8.2f %010.2f\n"   ,sp2,sl2,dg2,sl2*dg2);
	

}

