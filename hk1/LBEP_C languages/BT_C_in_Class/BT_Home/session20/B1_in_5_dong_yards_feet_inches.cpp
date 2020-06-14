#include <stdio.h>
#include <conio.h>
//#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
typedef struct{
	int yards;
	int feet;
	int inches;
}lengths;

int main(){
	int feet,inches;
	lengths n[5];
	for(int i=0;i<5;i++){
		printf("Moi nhap so yards thu %d:",i+1);scanf("%d",&n[i].yards);
	}
	for(int i=0;i<5;i++){
		feet=n[i].yards*3;
		inches=n[i].yards*36;
		printf("%d yards=%d feet=%d inches\n",n[i].yards,feet,inches);
	}
	
	
    
}

