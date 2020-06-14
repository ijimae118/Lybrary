#include <stdio.h>
#include <conio.h>
#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	int a[5];
	int b[5];
	for(int i=0;i<=4;i++){
		printf("moi nhap so a[%d]: ",i+1);
		scanf("%d",&a[i]);
		fflush(stdin); 
	}
	printf("\nso dao ngc:\n");
	for(int k=4;k>=0;k--){
		printf("\n a[%d]=%d \n",k+1,a[k]);
	} 
	
    for(int k=0;k<5;k++){
    	b[k]=a[k];
    }
    
		 printf("a[k] -> b[k] \n");
   
   for(int k=0;k<5;k++) {
      printf("   %2d        %2d\n",a[k], b[k]);
   }
    
}

