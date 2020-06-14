#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls"); = clrscr();
int main(){
	int diem;
	printf("diem cua ban:");
	scanf("%d",&diem);
	if(diem<1||diem>100){
		printf("diem ko hop le!");
	return 0;
	}
	if(diem>=75){
		printf("\t xep loai A\n");
	}
	else if(diem>=60){
		printf("\t xep loai B\n");
	}
	else if(diem>=45){
		printf("\t xep loai C\n");
	}
	else if(diem>=35){
		printf("\t xep loai D\n");
	}
	else{
		printf("\t xep loai E\n");
	}
	

}

