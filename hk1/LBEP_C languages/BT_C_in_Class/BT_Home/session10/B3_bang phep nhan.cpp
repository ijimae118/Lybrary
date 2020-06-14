#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
#include <stdlib.h> 
//fflush(stdin);
int main(){
	int n;
	printf("Nhap 1 con so:");
	scanf("%d",&n);
	system("cls");
	printf("Bang cuu chuong nhan %d:\n",n);
	for(int i=1;i<=10;i++){
		printf("%d*%d=%d\n",n,i,n*i);
	}

/*    for(int i=0,k=n;i<=n;i++,k--){
    	printf("%d+%d=%d\n",i,k,i+k);
	}
*/
}

