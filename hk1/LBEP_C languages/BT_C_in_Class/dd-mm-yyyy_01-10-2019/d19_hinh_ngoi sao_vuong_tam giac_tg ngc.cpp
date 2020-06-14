#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	// minh hoa vong lap long nhau-
	// in hinh vuong ngoi sao
	int n;
	printf("Nhap so dong in:");
	scanf("%d",&n);
	printf("\n Hinh vuong ngoi sao: ");
	for(int i=0;i<n;i++){
		printf("\n");
		for(int k=0;k<n;k++){
			printf(" %d ",k);
		}
	
    }
	
	printf("\n\n Hinh tam giac ngoi sao:");
	for(int i=0;i<n;i++){
		printf("\n");
		for(int k=0;k<=i;k++){
			printf("%d ",k);
		}
	}
	printf("\n\n Hinh tam giac ngoi sao ngc:");
	for(int i=0;i<n;i++){
		printf("\n");
		for(int k=i;k<n;k++){
			printf("%d ",k);
		}
	}

}

