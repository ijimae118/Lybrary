#include <stdio.h>
#include <conio.h>
#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	int n;
	do{
		printf("nhap tong so sinh vien cua mang[2-10]:");
		scanf("%d",&n);
		fflush(stdin);
		if(n>=2 && n<=10){
			break;
		}
	}while(1);
    //khai bao mang chua ten cua n-sinhvien,moi phan tu tensv la 1 mang 30 ky tu
    char ds[n][31];
    for(int i=0;i<n;i++){
    	printf("nhap ten sv thu %d:",i+1);
    	gets(ds[i]);
    	
	}
	printf("\n\n >> Danh sach ho ten sinh vien \n");
	for(int i=0;i<n;i++){
		printf("%2d. %s\n",i+1,ds[i]);
	}
    // doan code tim ten sv trong danh sach
    char tensv[31];
    char *p;
    int count=0;
	printf("\n >> nhap ten sinh vien muon tim :");
	gets(tensv);
	for (int i=0;i<n;i++){
		p=strstr(ds[i],tensv);
		if(p!= NULL){
			printf(">> %s \n",ds[i]);
			count++;
		}
	}
 	if(count==0){
		printf(">> khong tim thay sinh vien co ten [%s]!",tensv);
	}
}

