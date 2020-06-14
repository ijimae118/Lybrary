#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
#include <stdlib.h> 
int main(){
	int x,y;
	printf("Nhap 2 so X Y:");
	scanf("%d %d",&x,&y);
	system("cls");
	if(x<2000||x>3000)
	printf("X number %d\n",x);
	else 
	printf("gia tri x=%d ko hop le!\n",x);
	if(y>=100&&y<=500)
	printf("Y number %d",y);
	else printf("gia tri y=%d ko hop le!\n",y);
	return 0;

}

