#include <stdio.h>
#include <conio.h>
#include <string.h>
#include <math.h> 
//#define const 3.14
#include <stdlib.h> 
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

void Q1(){//nhap cac con so vao mang;co dk y=continue ,n=stop;in ra cac con so vua dc nhap vao
	int n=0;
	int i,a[n],max;
	char b;
//    char op;
	printf("\n Question 1 \n");
	printf("Finding the max number program\n");
    do{
	printf("please enter the number:");                                                                                                                                                                                     
	scanf("%d",&a[n]);
	
	printf("continue <y,n>:");
	fflush(stdin);
    scanf("%c",&b);
//    op=getchar();
	if(b=='y'){//or op=='y'
		n++;
    }else if(b=='n'){// op='n'
	break;
	} 
   }while(1);
   printf("the enter numbers are:");
   for(i=0;i<n+1;i++){
   	printf(" %d ",a[i]);
   }
   max=a[0];
   for(i=0;i<n+1;i++){
   	if(max<a[i]){
   		max=a[i];
	   }
   }printf("\n The greatest number is %d",max);
}

	typedef struct{
		char name[31];
		int no,science,math,english;
	}student;
void Q2(){
	int n;
	printf("Student management program\n");
	do{
	printf("Nhap so luong sv can quan ly[1-100]:");
	scanf("%d",&n);
	if(n>=1&&n<=100){
		break;
	}
  }while(1);
  student sv[n];
  printf("please enter student data:\n");
  for(int i=0;i<n;i++){
  	fflush(stdin);
  	printf("sv thu %d:\n",i+1);
  	printf("\tTen sv:");gets(sv[i].name);
  	printf("\tNo sv:");scanf("%d",&sv[i].no);
  	fflush(stdin);
  	printf("\tscience:");scanf("%d",&sv[i].science);
  	printf("\tmath:");scanf("%d",&sv[i].math);
  	printf("\tenglish:");scanf("%d",&sv[i].english);
  }
  printf("student detail\n");
  for(int i=0;i<n;i++){
  	printf("sv thu %d:\n",i+1);
  	printf("\tTen sv: %s\n",sv[i].name);
  	printf("\tNo sv: %d\n",sv[i].no);
  	printf("\tscience_mark: %d\n",sv[i].science);
  	printf("\tmath_mark: %d\n",sv[i].math);
  	printf("\tenglish_mark: %d\n",sv[i].english);
  	printf("\tsum_mark: %d\n",sv[i].science+sv[i].math+sv[i].english);
  	printf("\taverage: %d\n",(sv[i].science+sv[i].math+sv[i].english)/3);
  }
}

