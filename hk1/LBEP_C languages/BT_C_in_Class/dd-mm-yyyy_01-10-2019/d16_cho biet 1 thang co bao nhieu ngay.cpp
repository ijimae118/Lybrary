#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
int main(){// tinh 1 thang co bao nhieu ngay
	int mm ,yy,dd;
	printf("nhap thang[1-12]:");
	scanf("%d",&mm);
	if(mm<1 || mm>12){
		printf(">thang nhap ko hop le!");
		return 0;
	}
	dd=31;
	switch(mm){
		case 4:
		case 6:
		case 9:
		case 11:
		 dd=30;
		 break;
		case 2:
			printf("vui long nhap nam:");
			scanf("%d",&yy);
			if((yy%4 == 0 && yy%100 != 0)||(yy%400 == 0)){
				dd=29;
				
			}
			else{
				dd=28;
			}
			break;
	 
	}
	printf(">>thang %d co %d ngay .\n",mm,dd);
}

