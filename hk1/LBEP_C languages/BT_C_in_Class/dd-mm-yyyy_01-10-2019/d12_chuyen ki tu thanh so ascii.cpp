#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
int main(){
	char c1,c2,A,b;
	printf("nhap 1 ky tu bat ky : ");
	c1=getchar();
	fflush(stdin);
	printf("nhap 1 ky tu bat ky : ");
	c2=getchar();
	printf("\n ky tu dau tien [%c] co ma ascci la:%d",c1,c1);
	printf("\n ky tu dau tien [%c] co ma ascci la:%d",c2,c2);
	printf("\n ky tu dau tien [%c] co ma ascci la:%d",'A','A');
	printf("\n ky tu dau tien [%c] co ma ascci la:%d",'b','b');

}

