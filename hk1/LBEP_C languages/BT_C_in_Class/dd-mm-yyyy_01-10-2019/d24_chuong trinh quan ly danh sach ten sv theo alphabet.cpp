#include <stdio.h>
#include <conio.h>
#include<string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	//chuong trinh quan ly danh sach ten sinh vien
	char tensv[31];//tensv:30 ki tu +1(so null=0)
	
	char ds[5][31];//mang chua 5 chuoi(so dong) ky tu, (do dài 30)
	printf("nhap danh sach ten sinh vien:\n");

	for(int i=0;i<5;i++){
		printf(">>nhap ten sv thu %d:\n",i+1);
		gets(ds[i]);
	}
	printf("\n\n Bang danh sach ten sinh vien:\n");
	for (int i=0;i<5;i++){
		printf("%2d. %s \n",i+1,ds[i]);
	}
	// doan code sap xep lai danh sach ten sv theo thu tu alphabet
	for(int i=0;i<4;i++){
		for(int k=i+1;k<5;k++){
//			printf("%d&&%d\n",i,k);
			if(strcmp(ds[i],ds[k])>0){
				//hoan doi vi tri ten sv o dong i va k
				strcpy(tensv,ds[i]);
				strcpy(ds[i],ds[k]);
				strcpy(ds[k],tensv);
				
			}
		}
	}
	//in ra ds sinh vien sau khi dc xep thu tu (thap den cao)
	printf("\n\n Bang danh sach ten sinh vien da xep thu tu:\n");
	for (int i=0;i<5;i++){
		printf("%2d. %s \n",i+1,ds[i]);
	}

}

