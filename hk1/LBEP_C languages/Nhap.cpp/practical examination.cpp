#include <stdio.h>
#include <conio.h>
#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");exit(0);
//fflush(stdin);

void Q1();
void Q2();


int main() {
//	char option=' ';
	char option='1';// se chua ma so chuc nang duoc chon trong he thong menu
	// thiet ke menu cho chuong trinh
	do {
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

		switch(option) {
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
	} while(1);
}

void Q1() {
	printf("\n Question 1 \n");
	int n;
	int a[n];
	int b;
	printf("Enter the size of the arry (positive_number):");
	scanf("%d",&n);
	for(int i=0; i<n; i++) {
		scanf("%d",&a[i]);

	}
	printf("Out put the arry:");
	for(int i=0; i<n; i++) {
		printf(" %d ",a[i]);
		b+=a[i]&1;
	}

	if(b>0) {
		printf("\nResult: the arry not is all even.");
	} else {
		printf("Result: the arry is all even.");
	}

}

struct account {
	int no;
	char name[31];
	char password[31];
};
typedef struct account ac;
void Q2() {
	printf("\n Question 2 \n");
	int n;
	do {
		printf("Number of account:");
		scanf("%d",&n);
		if(n>=1 && n<=100) {
			break;
		}
	} while(1);
	ac ds[n];
	for(int i=0; i<n; i++) {
		fflush(stdin);
		printf("account thu %d:\n",i+1);
		printf("\tNo:");
		scanf("%d",&ds[i].no);
		fflush(stdin);
		printf("\tOwner Name:");
		scanf("%[^\n]s",ds[i].name);
		fflush(stdin);
		printf("\tPassword:");
		scanf("%[^\n]s",ds[i].password);
	}
	for(int i=0; i<n; i++) {
		printf("account thu %d:\n",i+1);
        printf("\tNo:%d\n",ds[i].no);
		fflush(stdin);
		printf("\tOwner Name: %s\n",ds[i].name);
		fflush(stdin);
		printf("\tPassword:%s\n",ds[i].password);
	}
	// if muon tim mot tai khoan account trong ds[i].no thi dung :if(ds[i].no=n) voi n :la so account can tim 
}
