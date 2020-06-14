#include <stdio.h>
#include <conio.h>
#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
		char a[31];//a:30 ki tu +1(so null=0)
	
	char b[7][31];//mang chua 7 chuoi(so dong) ky tu, (do dài 30)
	printf("nhap danh sach names:\n");
	for(int i=0;i<7;i++){
		printf(">>nhap ten names thu %d:\n",i+1);
		scanf("%s",b[i]);
	}
	

	for(int i=0;i<6;i++){
		for(int k=i+1;k<7;k++){
//			printf("%d&&%d\n",i,k);
			if(strcmp(b[i],b[k])>0){
				//hoan doi vi tri ten o dong i va k
				strcpy(a,b[i]);
				strcpy(b[i],b[k]);
				strcpy(b[k],a);
				
			}
		}
	}
	//in ra ds name sau khi dc xep thu tu (nho den lon)
	printf("\n\n Bang danh sach ten da xep thu tu:\n");
	for (int i=0;i<7;i++){
		printf("%2d. %s \n",i+1,b[i]);
	}


}

