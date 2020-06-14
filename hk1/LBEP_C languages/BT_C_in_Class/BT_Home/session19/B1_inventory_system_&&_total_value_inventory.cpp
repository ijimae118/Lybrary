#include <stdio.h>
#include <conio.h>
//#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);

typedef struct{
	int id;
	char name[31];
	int rate;
	int quantity;
}inventory;

int main(){
	int Gtotal=0;
      inventory item[5]	;
       printf("\n Nhap thong tin item\n");
    for(int i=0;i<5;i++){
    	printf("\n Nhan vien thu %d:\n",i+1);
    	printf("\t id:");scanf("%d",&item[i].id);
    	fflush(stdin);// xoa enter :bo nho dem .
    	printf("\t name item:");gets(item[i].name);
    	printf("\t rate:");scanf("%d",&item[i].rate);
    	printf("\t quantity:");scanf("%d",&item[i].quantity);
		}
    		printf("\n\n >>Danh sach item<< \n ");
	printf("%-8s %-20s %-8s %-4s %-8s \n","ma so","ten","ty le","so luong","total");
	for(int i=0;i<5;i++){
	    printf(" %8d",item[i].id);
		printf(" %-20s",item[i].name);
		printf(" %8d",item[i].rate);
		printf(" %4d",item[i].quantity);	
		printf(" %8d",item[i].rate*item[i].quantity);
		Gtotal+=item[i].rate*item[i].quantity;
		printf("\n");
		
		
	}
	printf("The grand total value of the inventory:%d ",Gtotal);

}


