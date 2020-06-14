#include <stdio.h>
#include <conio.h>
//#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	int n;
	printf("Nhap mot so nguyen duong \n");
	scanf("%d", &n);
	int sum = 0;
	for (int i=1; i<n; i++)
		 if(n % i ==0){
		sum+=i; }
		 printf("%d\n",sum); 	
		 if(sum==n){printf("%d la so hoan hao ",n);
		 } 
		 else{printf("%d ko la so hoan hao ",n);
		 } 
	

}

