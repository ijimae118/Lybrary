#include <stdio.h>
#include <conio.h>
#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");exit(0);
//fflush(stdin);

void Q1();
void Q2();


int main(){
//	char option=' ';
	char option='1';// se chua ma so chuc nang duoc chon trong he thong menu
	// thiet ke menu cho chuong trinh 
	do{
		// in ra man hinh cac chuc nang cua chuong trinh
		fflush(stdin);
		printf("\n");
		printf("****************************************************\n");
		printf("* Selecting appropriate action:                    *\n");
		printf("*          1. Question 1                           *\n");
		printf("*          2. Question 2                           *\n");
		printf("*          3. Quit program                         *\n");
		printf("****************************************************\n");
		printf("\n PLZ input your choise [1 -3]:");
		scanf("%c",&option);
		
		switch(option){
		case '1':
		    Q1();
			break;
		case '2':
			Q2();
			break;
		case '3':
			return 0;// ket thuc ham main() => cham dut chuong trinh
		default:
			printf("invalid choice ! Plz re-enter! \n");
			break;
		}
	}while(1);
}

void Q1(){// tinh giai thua cua 1 so (the factorial).vd:8!=40320 vd:3!=1*2*3=6
	printf("\n Question 1 \n");
	double kq=1;
	int n;
	fflush(stdin);
	do{ 
	printf("input n [1-20]");
	scanf("%d",&n);
	if(n>=1&&n<=20){
		break;
	}
	}while(1);
	for(int i=2;i<=n;i++){
		kq=kq*i;
	}
	printf(">>The factory of %d! = %.0f \n",n,kq);
    return;
}
	typedef struct EMPLOYEE{
		int id;
		char name[31];
		int baseSalary;
		int workedDays;
	}EPE;
void Q2(){
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

}
