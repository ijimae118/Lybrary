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
	/* Example:
Enter an the first number N1 (<100) : 32
Enter an the second number N2 (<10) : 5
Multiples of 5 ( <=32 ) are: 5 10 15 20 25 30
Sum of them are: 105 */
	printf("\n Question 1 \n");
	int N1,N2,sum=0;
	printf("Nhap N1:\n");
	scanf("%d",&N1);
	printf("Nhap N2:\n");
	scanf("%d",&N2);
	
	printf("Cac boi so cua %d nho hon [%d] la:",N2,N1);
	for(int i=1;N2*i<=N1;i++){
		printf(" %d ",N2*i);
		sum=sum+N2*i;
		
	}
	printf("\n Tong cua cac boi so tren la: %d\n",sum);
    return;
}

struct COUNTRY{
	char name[30];
	char captital[30];
	int area;
};
typedef struct COUNTRY CT;
void Q2(){
	printf("\n Question 2 \n");
	int n;
	do{
		printf("nhap so luong quoc gia [3 -10]");
		scanf("%d",&n);
		if(n>=3 && n<=10){
			break;
		}	
	}while(1);
	
	CT ds[n];
	// viet vong lap ,nhap thong tin cho tung quoc gia
	for(int i=0;i<n;i++){
		fflush(stdin);
		printf("\nnhap thong tin cho quoc gia thu %d:\n",i+1);
		printf("nhap ten cua quoc gia :");scanf("%[^\n]s",ds[i].name);
	    fflush(stdin);
		printf("nhap thu do cua quoc gia:");gets(ds[i].captital);
	    printf("nhap dien tich cua QG:");scanf("%d",&ds[i].area);
	}
		int pos =0;
		int dt=0;
		for(int i=0;i<n;i++){
			if(ds[i].area>dt){
				pos=i;
				dt=ds[i].area;
			}
		}
	printf("\nQuoc gia co dien tich lon nhat la: %s \n",ds[pos].name);
	// in lai bang ds quoc gia theo cot ten tang dan
	CT temp;
	for(int i=0;i<n-1;i++){
		for(int k=i+1;k<n;k++){
			if(strcmp(ds[i].name,ds[k].name)>0){
				temp=ds[i];
				ds[i]=ds[k];
				ds[k]=temp;
			}
		}
	}
	printf("\n Danh sach cac QG -xep theo thu tu ten :\n");
	for(int i=0;i<n;i++){
		printf("%s, %s, %d\n",ds[i].name,ds[i].captital,ds[i].area);
	}
	// in ra 2 QG co dien tich nho nhat
	for(int i=0;i<n-1;i++){
		for(int k=i+1;k<n;k++){
			if(ds[i].area>ds[k].area){
				temp=ds[i];
				ds[i]=ds[k];
				ds[k]=temp;
			}
		}
	}	
	printf("\nIn ra 2 quoc gia co dien tich be nhat :\n");
	for(int i=0;i<2;i++){
		printf("%s, %s, %d\n",ds[i].name,ds[i].captital,ds[i].area);
	}	
}

