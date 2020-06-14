#include <stdio.h>
#include <conio.h>
//#include <string.h>
#include <math.h> 
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int square(int n );
int main(){
	int n,a;
	printf("nhap 1 so :\n");
	scanf("%d",&n);
	a=square(n);
	printf("Binh phuong cua %d la %d",n,a);
	
	

}
int square(int n){
//	int j;
//	j=n*n;
//  return j;
    printf("Suy ra =>");
	return n*n;
	
}
