#include <stdio.h>
#include <conio.h>
//#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);

typedef struct{
	char name[31];
	int scores;
}sinhvien;

int main(){
    sinhvien sv[5];
       printf("\n Nhap thong tin sv\n");
       for(int i=0;i<5;i++){
		fflush(stdin);
		printf("\nNhap ten sv thu %d:",i+1);
		gets(sv[i].name);
		printf("\nNhap diem sv thu %d:",i+1);
		scanf("%d",&sv[i].scores);
       	}
    sinhvien temp;
       for (int i=0;i<4;i++){
       	for(int k=i+1;k<5;k++){
       		if(sv[i].scores<sv[k].scores){
       		   temp=sv[i];
       		   sv[i]=sv[k];
       		   sv[k]=temp;
			   }
		   }
       	}
		printf("\n\n >>Danh sach top 3 sv theo diem so tu cao den thap<< \n ");
		for(int i=0;i<3;i++){
			printf("Ten:%s, diem:%d\n ",sv[i].name,sv[i].scores);
		}   	
}

