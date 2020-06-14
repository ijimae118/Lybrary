#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	int a[5];// khai bao 1 mang so nguyen ,ten la a,co 5 phan tu
	// vong lap nhap so lieu cho 5 phan tu cua mang a 
	for (int i=0;i<5;i++){
		printf("nhap so thu %d:",i+1);
		scanf("%d",&a[i]);
	}
	//vong lap duyet cac phan tu trong mang a ->xuat ra man hinh
	printf("\n>> Day so vua nhap:\n");
	for (int i=0;i<5;i++){
		printf("%d\t",a[i]);
	}

}

