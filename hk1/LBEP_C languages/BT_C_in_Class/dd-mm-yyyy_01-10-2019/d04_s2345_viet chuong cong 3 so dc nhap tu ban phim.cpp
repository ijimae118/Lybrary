#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
int main(){
//viet chuong cong 3 so dc nhap tu ban phim
int a,b,c;//khai bao 3 bien so nguyen a,b,c
printf("nhap 3 so nguyen (moi so cach nhau bang 1 khoang trang):\n");
scanf("%d %d %d",&a,&b,&c);

//lenh : xoa man hinh
//system("cls");

//in ra cac so vua duoc nhap
printf("\n\n a=%d,b=%d,c=%d \n",a,b,c);

//in ra tong cua 3 so
printf("%d+%d+%d=%d\n",a,b,c,a+b+c);

}

