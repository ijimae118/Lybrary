#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
int main(){
	int m;
	printf("nhap vao diem ket qua [0-100]:");
	scanf("%d",&m);
	if(m<0 || m>100){
		printf("diem nhap [%d] ko hop le!",m);
		return 0;// ket thuc chuong trinh.
	}
	//m[0->100]
	if(m>=90){
		printf("\t xep loai A\n");
	}
	else if(m>=70){
		printf("\t xep loai B\n");
	}
	else if(m>=40){
		printf("\t xep loai C\n");
	}
	else{
		printf("\t xep loai D\n");
	}

}



