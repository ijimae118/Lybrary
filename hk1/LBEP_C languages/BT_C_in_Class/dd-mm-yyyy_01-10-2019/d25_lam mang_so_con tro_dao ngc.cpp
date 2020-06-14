#include <stdio.h>
#include <conio.h>
//#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	int n;
	do{
		printf("nhap tong so phan tu cua mang[2-10]:");
		scanf("%d",&n);
		if(n>=2 && n<=10){
			break;
		}
	}while(1);
	int a[n];
	// nhap du lieu vo mang a co n-phan tu
	for (int i=0;i<n;i++){
		printf(">>nhap a[%d]:",i+1);
		scanf("%d",&a[i]);
	}
	// khai bao con tro p -> mang a
	int *p=a ;// *p=&a[0]
	// in noi dung cua mang a theo thu tu nguoc: tu phan tu cuoi -> dau
	printf("\n\n >> Day so theo thu tu dao nguoc:\n");
	for(int i=n-1;i>=0;i--){
		printf(" %d ",*(p+i));
	}

}

