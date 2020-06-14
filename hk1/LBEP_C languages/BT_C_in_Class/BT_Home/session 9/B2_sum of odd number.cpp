#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	int a,b,sum;
	sum=0;
	printf("nhap 2 so:");
	scanf("%d %d",&a,&b);
	if(a<b){
			if(a%2==0){
				a++;
	}
	for(int i=a;i<=b;i=i+2){
//		printf("%d",sum + i); khi nhap 2 6 dap an la 35 ??
    sum+=i;
	}
		   }
	else  {
			if(b%2==0){
				b++;
	}
	for(int i=b;i<=a;i=i+2){
//		printf("%d",sum + i);khi nhap 6 2 dap an la 38???
    sum=sum+i;
	}
		}
	printf("tong so le=%d",sum);
			
}

