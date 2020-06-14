#include <stdio.h>
#include <conio.h>
#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	int a[5];
	for(int i=1;i<=5;i++){
		printf("moi nhap so a[%d]: ",i);
		scanf("%d",&a[i]);
		fflush(stdin); 
	}
	printf("\nso dao ngc:\n");
	for(int k=5;k>=1;k--){
		printf("\n a[%d]=%d \n",k,a[k]);
	}
	

}

