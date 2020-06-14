#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
#include <stdlib.h> 
//fflush(stdin);
int main(){
	int n;
	printf("nhap so dong in:");
	scanf("%d",&n);
	system("cls");
	printf("\ntam giac so:");
	for(int i=1;i<=n;i++){
		printf("\n");
		for(int k=1;k<=i;k++){
			printf("%d",k);
		}
    }
    printf("\ntam giac so dao ngc:");
	for(int i=n;i>=1;i--){
		printf("\n");
		for(int k=1;k<=i;k++){
			printf("%d",k);
		}
    }

}

