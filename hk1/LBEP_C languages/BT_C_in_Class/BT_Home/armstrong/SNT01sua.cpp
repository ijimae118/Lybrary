#include <stdio.h>
#include <conio.h>
//#include <string.h>
#include <math.h> 
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	int n;
	printf("nhap so  nguyen duong:");
	scanf("%d",&n);
	int sont=1;// gia dinh n la so nguyen to
	for (int i=2; i<=sqrt(n);i++){
		if(n%i==0){
			//i la uoc so n =>n la hop so
			sont=0;
			break;
		}
	}
	if(sont==1){printf("%d la so nguyen to");
	}
	else{
		printf("%d la so hop so\n",n);
	}

}

