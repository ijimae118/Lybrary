#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
int main(){
	int luong;
	char cap;
	printf("Basic salary:");
	scanf("%d",&luong);
	fflush(stdin);
	printf("Grade A,B,Others:");
	scanf("%c",&cap);
	if(cap='A')
	printf("the salary at the end of the month %d",luong+300);
	else if(cap='B')
	printf("the salary at the end of the month %d",luong+250);
	else 
	printf("the sslary at the end of the month %d",luong+100);
	

}

