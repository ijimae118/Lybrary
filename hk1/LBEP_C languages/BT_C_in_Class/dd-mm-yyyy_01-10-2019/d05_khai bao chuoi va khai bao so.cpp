#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
int main(){
	//khai bao 1 chuoi ky tu chua toi da 30 ky tu(+1 tu khoa)
	char tenNV[31]="le minh333";
	// khai bao cac du lieu so
	int tuoi=26;
	float luong=19999.99;
	char bacluong ='A';
	int soNV =20;
	printf("\n thong tin nhan vien:\n ");
	printf("ho va ten:%s \n",tenNV);
	printf("tuoi:%d \n Bac luong :%c\n ",tuoi,bacluong);
	printf("luong CB: %.2f \n",luong);
	printf("so ngay lam viec:%d\n",soNV);
	printf("luong thuc te: %.2f \n",luong*20/26);
	
}

