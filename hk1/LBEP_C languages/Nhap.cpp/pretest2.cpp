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

void Q1(){// tinh cac uoc so le( odd divisors of N )
/* Example:
Enter an integer number N : 30
Odd divisors of 30 are: 1 3 5 15
Number of odd divisors of 30 : 4  */
	int n;
	do{
		printf(" nhap so nguyen >0:");
		scanf("%d",&n);
		if(n>0){
			break;
		}
	}while(1);
	int count =0;// bien dem cac uoc so le cua n
	int sum=0;//bien tong cua cac uoc so le cua n
	printf("\n Cac uoc so le cua %d:",n);
	for(int i=1;i<=n;i++){
		if(n%i==0&&i%2==1){
			count++;
			sum+=i;
			printf("%5d",i);
		}
	}// ket thuc for
	printf("\n so luong cac uoc so le cua %d :%d",n,count);
	printf("\n tong cua cac uoc so le cua %d :%d",n,sum);
	return;
}

struct RECTANGLE{
	int w,h;
	char color[21];
};
typedef struct RECTANGLE RE;

void Q2(){
	printf("\n Question 2-Ql ds cac hinh chu nhat \n");
	fflush(stdin);
	int n;
		do{
		printf(" nhap so luong hinh chu nhat muon quan ly [2-10]:");
		scanf("%d",&n);
		if(n>=2&&n<=10){
			break;
			}
		}while(1);
		RE ds[n];// khai bao mang ds chua n-hinh chu nhat
		// nhap so lieu cho n hinh chu nhat
		for(int i=0;i<n;i++){
			fflush(stdin);
			printf(">>nhap hinh chu nhat thu %d:\n",i+1);
			printf(" nhap chieu dai :");scanf("%d",&ds[i].h);
			printf(" nhap chieu rong :");scanf("%d",&ds[i].w);
			fflush(stdin);
			printf(" nhap mau :");gets(ds[i].color);
		}
		// in danh sach hinh chu nhat
		printf("\n>>Danh sach cac hinh chu nhat<<\n");
		printf("%-4s %-8s %-8s %-8s %-8s\n","No","Chieudai","Chieurong","Mau","Dientich");
		for(int i=0;i<n;i++){
			printf("%4d",i+1);
			printf("%8d",ds[i].h);
			printf("%8d",ds[i].w);
			printf("%8s",ds[i].color);
			printf("%8d\n",ds[i].h*ds[i].w);
		}
		//in ds cac hinh vuong 
		printf("\n>>Danh sach cac hinh vuong<<\n");
		printf("%-4s %-8s %-8s %-8s %-8s\n","No","Chieudai","Chieurong","Mau","Dientich");
		int count=0;
		for(int i=0;i<n;i++){
			if(ds[i].h==ds[i].w){
			printf("%4d",i+1);
			printf("%8d",ds[i].h);
			printf("%8d",ds[i].w);
			printf("%8s",ds[i].color);
			printf("%8d\n",ds[i].h*ds[i].w);
			count++;
			}
		}if(count=0){
			printf("\n Khong co hinh vuong nao!");
		}
		//hinh co dien tich lon nhat
		int pos =0;
		int area=0;
		for(int i=0;i<n;i++){
			if(ds[i].h*ds[i].w>area){
				pos=i;
				area=ds[i].h*ds[i].w;
			}
		}
	printf("\nHinh chu nhat co dien tich lon nhat: \n");
	printf("%4d",pos+1);
	printf("%8d",ds[pos].h);
	printf("%8d",ds[pos].w);
	printf("%8s",ds[pos].color);
	printf("%8d\n",ds[pos].h*ds[pos].w);
	return;
}
