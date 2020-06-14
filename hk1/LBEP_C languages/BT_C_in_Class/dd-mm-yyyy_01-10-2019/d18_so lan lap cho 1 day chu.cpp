#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	int n;
	printf("nhap so lan lap:");
	scanf("%d",&n);
	for(int i=n;i>0;i--){
		printf("\n timer coundown %d!",i);
	}
	printf("\n finished");
}

