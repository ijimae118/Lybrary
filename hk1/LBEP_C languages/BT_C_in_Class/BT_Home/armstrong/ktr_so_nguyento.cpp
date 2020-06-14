#include <stdio.h>
#include <conio.h>
//#include <string.h>
#include <math.h> 
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	int n,count=0;
	do{
	printf("nhap 1 so nguyen to:");
    scanf("%d",&n);
    if(n<0){
	printf(">> vui long nhap n>0:");
	}
    }while(n<0);
    
    if(n<2){
    	printf("%d khong phai la SNT",n);
    
	}
    else
	{ for(int i=2;i<=sqrt(n);i++){
		if(n%i==0){ count++;}
	  }
	  if(count==0){
	  printf("%d la SNT",n);
	  }
	  else{printf("%d ko la SNT",n);
	  }
	}
	
}
