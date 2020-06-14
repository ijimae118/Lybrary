#include <stdio.h>
#include <conio.h>
#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main()
{
	int n;
	do{printf("nhap so lg phan tu trong fibonaci[3-30]:");
  scanf("%d",&n);
  if(n>=3 && n<=30){
  	break;
  }
  printf("nhap so tu 3-30\n");
  }while(1);
  int fibo[n];// khai bao mang fibo co n-phan tu
  fibo[0]=fibo[1]=1;
  for(int i=2;i<n;i++){
  	fibo[i]=fibo[i-1]+fibo[i-2];
     printf("%d\t",fibo[i]);
}
    // in day so fibonaci
    printf("\n >>day so Fibonacci %d phan tu:\n",n);
    for (int i=0;i<n;i++){
	printf("%d\t",fibo[i]);
    }
}

