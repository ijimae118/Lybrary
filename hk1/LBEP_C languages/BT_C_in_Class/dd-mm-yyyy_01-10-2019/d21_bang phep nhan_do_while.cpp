#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
 int n=1;
    do{
	printf("Nhap 1 so nguyen[2-20]:\n");
    scanf("%d",&n);
    if(n>=2 && n<=20){
    	// nhap dung roi => thoat vong lap
    	break;
    }
	printf(">> nhap sai roi:\n");
	}
	while(n<2||n>20);
    	printf("\n bang cuu chuong %d:\n",n);
    
	for(int i=1;i<=10;i++){
		printf("%d*%d=%d\n",n,i,n*i);
    }
}

