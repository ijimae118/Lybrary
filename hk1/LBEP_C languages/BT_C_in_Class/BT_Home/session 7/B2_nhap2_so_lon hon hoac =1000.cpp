#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
int main(){
	int a,b;
	printf("moi nhap hai so(nhan A_B):");
	scanf("%d %d",&a,&b);
	if(a*b>=1000){
		printf("%dx%d>=1000",a,b);
	}
	else {
		printf("%dx%d<1000",a,b);
	}

}

