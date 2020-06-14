#include <stdio.h>
#include <conio.h>
//#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
typedef struct{
	int day;
	int month;
	int year;
}joining;
typedef struct{
	int id;
	char name[31];
	int salary;
	joining date;
}employee;

void increaseSalary(employee nv[]);
void check10year(employee nv[]);

int main(){
	int n;
	printf("\nNhap so nhan vien:\n");
	scanf("%d",&n);
	employee nv[n];
	for(int i=0;i<n;i++){
		printf("\nNhap ma so nv thu %d:",i+1);scanf("%d",&nv[i].id);
		printf("\nNhap ten nv thu %d:",i+1);fflush(stdin);scanf("%[^\n]s",&nv[i].name);
		printf("\nNhap luong nv thu %d:",i+1);scanf("%d",&nv[i].salary);
	    printf("\nNhap ngay thang nam nv tham gia cty thu %d:",i+1);scanf("%d %d %d",&nv[i].date.day,&nv[i].date.month,&nv[i].date.year);
	}
	int option;
	 printf("Menu:\n");
	 printf("1.increase the salary\n");
	 printf("2.The details of employees who complete 10 years with the company\n");
	 printf("Please select:");
	 scanf("%d",&option);
	 if(option==1){
	 	for(int i=0;i<n;i++){
		if(nv[i].salary<=2000){
			nv[i].salary*=1.15;
		}else if(nv[i].salary>2000&&nv[i].salary<=5000){
			nv[i].salary*=1.1;
		}
		printf("Salary of employee thu %d = %d\n",i+1,nv[i].salary);
	  }
	 }
	 else if(option==2){ 
	    	for(int i=0;i<n;i++){
		if(nv[i].date.year<=2009){
			printf("ID=%d\n",nv[i].id);
			printf("Name=%s\n",nv[i].name);
			printf("Salary=%d\n",nv[i].salary);
			printf("Date=%d %d %d\n",nv[i].date.day,nv[i].date.month,nv[i].date.year);
		}
	  }
    }else{
	return 0;
	}
}

