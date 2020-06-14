#include <stdio.h>
#include <conio.h>
#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
// B1.dinh nghia cau truc nhan vien
	typedef struct EMPLOYEE{
		int id;
		char name[31];
		int baseSalary;
		int workedDays;
	}EPE;
//typedef struct EMPLOYEE EPE;	
void QLNV();// khai bao prototype cua ham QLNV

int main(){
	QLNV();

}
// ham quan ly nhan vien
void QLNV(){
	int n;
	do{
		printf("Nhap so luong nv can quan ly[2-10]:");
		scanf("%d",&n);
		if(n>=2&&n<=10){
			break;// nhap dung roi -> ket thuc vong lap
		}
	}while(1);
	// B2.khai bao mang chua n-nhan vien
	
	//struct EMPLOYEE ds[n];
	EPE ds[n];
    
	// b3.nhap du lieu cho n-nhan vien
    printf("\n Nhap thong tin nhan vien\n");
    for(int i=0;i<n;i++){
    	printf("\n Nhan vien thu %d:\n",i+1);
    	printf("\t ma so:");scanf("%d",&ds[i].id);
    	fflush(stdin);// xoa enter :bo nho dem .
    	printf("\t ho ten:");gets(ds[i].name);
    	printf("\t luong co ban:");scanf("%d",&ds[i].baseSalary);
    	printf("\t so ngay lam viec:");scanf("%d",&ds[i].workedDays);
	}
	//B4.xuat ds nhan vien
	printf("\n\n >>Danh sach nhan vien<< \n ");
	printf("%-8s %-20s %-8s %-4s %-8s \n","ma so","ten nv","LCB","NLV","Luong");
	for(int i=0;i<n;i++){
	    printf(" %8d",ds[i].id);
		printf(" %-20s",ds[i].name);
		printf(" %8d",ds[i].baseSalary);
		printf(" %4d",ds[i].workedDays);	
		printf(" %8d",ds[i].baseSalary*ds[i].workedDays/26);
		printf("\n");
	}
	
	// B5.sap xep lai ds theo cot ho ten alphabet
	EPE temp;
    for(int i=0;i<n-1;i++){
    	for(int k=i+1;k<n;k++){
    		if(strcmp(ds[i].name,ds[k].name)>0){//>0  la sai.xep tu thap den cao.....i>k
    			temp=ds[i];
    			ds[i]=ds[k];
    			ds[k]=temp;
			}
		}
	}
	// 6 .in lai danh sach nhan vien da sap xep theo thu tu a->z
		printf("\n\n >>Danh sach ten nhan vien theo thu tu A-Z<< \n ");
	printf("%-8s %-20s %-8s %-4s %-8s \n","ma so","ten nv","LCB","NLV","Luong");
	for(int i=0;i<n;i++){
	    printf(" %8d",ds[i].id);
		printf(" %-20s",ds[i].name);
		printf(" %8d",ds[i].baseSalary);
		printf(" %4d",ds[i].workedDays);	
		printf(" %8d",ds[i].baseSalary*ds[i].workedDays/26);
		printf("\n");
	}
	// B7.sap xep lai ds theo cot luong co ban tu cao -> thap
    for(int i=0;i<n-1;i++){// if in 3 ban co muc luong co ban cao nhat thi i=2
    	for(int k=i+1;k<n;k++){
    		if(ds[i].baseSalary < ds[k].baseSalary){//>0  la sai ....s1<s2 ,xep lai tu cao->thap....
    			temp=ds[i];
    			ds[i]=ds[k];
    			ds[k]=temp;
			}
		}
	}
	// B8 .in lai danh sach nhan vien da sap xep theo cot luong co ban 
		printf("\n\n >>Danh sach ten nhan vien theo lcb tu cao xuong thap<< \n ");
	printf("%-8s %-20s %-8s %-4s %-8s \n","ma so","ten nv","LCB","NLV","Luong");
	for(int i=0;i<n;i++){
	    printf(" %8d",ds[i].id);
		printf(" %-20s",ds[i].name);
		printf(" %8d",ds[i].baseSalary);
		printf(" %4d",ds[i].workedDays);	
		printf(" %8d",ds[i].baseSalary*ds[i].workedDays/26);
		printf("\n");
	}
}
