#include <stdio.h>
#include <conio.h>
#include<stdlib.h>
int Q1();
int Q2();
int main() {
	int option=0;
	do {
		printf("***** WELCOME BIN DAI *****\n");
		printf("1. Question 1\n");
		printf("2. Question 2\n");
		printf("3. Quit program\n");

		printf("input option [1-3]:");
		scanf("%d",&option);

		switch (option) {
			case 1:
				Q1();
				break;
			case 2:
				Q2();
				break;
			case 3:
				exit(0);
			default:
				printf("WRONG OPTION!!");
				break;
		}
	} while(1);


}
int Q1() {// tinh cac uoc so le (odd divisors of N)
	system("cls");
	printf("===QUESTION 1===\n");
	int n,a=0;
	printf("Input a positive number:");
	scanf("%d",&n);
	printf("List divisors of %d:\n",n);
	for(int i=1; i<=n; i++) {
		if(n%i==0&&i%2!=0) {
			printf("%5d",i);
			a++;
		}
	}
	printf("\nNumer of odd divisors:%d\n\n",a);
}


	struct RECTANGLE {
		int w,h;
		char color[12];
	};
int Q2() {
	system("cls");
/*	struct RECTANGLE {
		int w,h;
		char color[12];
	};
*/
	int n;
	do {
		printf("Nhap so luong hinh chu nhat : ");
		scanf("%d",&n);
		if(n>=2&&n<=100) {
			break;
		}
		printf("Vui long nhap lai !!!\n");
	} while(1);
	struct RECTANGLE ds[n];
	for(int i=0;i<n;i++){
		printf("\nNhap hinh chu nhat thu %d :\n",i+1);
		printf("Chieu rong : ");
		scanf("%d",&ds[i].w);
		printf("Chieu dai : ");
		scanf("%d",&ds[i].h);
		fflush(stdin);
		printf("Mau : ");
		gets(ds[i].color);
		
	}
	printf("\nDanh sach hinh chu nhat \n");
	printf("%-5s %-8s %-8s %-12s %-8s \n","stt","rong","dai","dien tich","mau");
	for(int i=0;i<n;i++){
		printf("%5d %8d %8d %12d %-8s \n",
		i+1,ds[i].w,ds[i].h,ds[i].w*ds[i].h,ds[i].color);
	}
	int count=0;
	printf("\nDanh sach hinh vuong \n");
	printf("%-5s %-8s %-8s %-12s %-8s \n","stt","rong","dai","dien tich","mau");
	for(int i=0;i<n;i++){
		if(ds[i].w==ds[i].h){
			printf("%5d %8d %8d %12d %-8s \n",
			i+1,ds[i].w,ds[i].h,ds[i].w*ds[i].h,ds[i].color);
			count++;
		}
	}
	printf("\nTong so hinh vuong : %d\n\n",count);
}

