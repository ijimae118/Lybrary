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

void Q1(){
	printf("\n Question 1 \n");
//	return;// bo return cung dc do la void.
}

void Q2(){
	printf("\n Question 2 \n");
	return;
}

