#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){//factorial 
	int n ; 
	double kq=1;
	// nhap 1 so nguyen co gia tri tu 0-20
	do{
		printf("nhap 1 so nguyen [0-20]\n ");
		scanf("%d",&n);
		if(n>=0 && n<=20){
			break;
		}
		printf("gia tri nhap ko hop le,hay nhap lai:");
	}
	while(1);
	for (int i=1;i<=n;i++){
		kq=kq*i;
	}
	printf("giai thua cua %d la %.0f",n,kq);

}

