#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
int main(){
	int n;
	printf("nhap vao 1 so nguyen:");
	scanf("%d",&n);
	// kiem tra so nhap la so chan hay le
	// dung % lay so du de xem chan hay le
	//if(n%2==0){
	//	printf("%d la so chan !\n",n);
	//}
	//else{
	//	printf("%d la so le !\n",n);
	//}
	if(n&1){
		printf("[%d] la so le !\n",n);
	}
	else{
		printf("[%d] la so chan !\n",n);
	}
	

}

