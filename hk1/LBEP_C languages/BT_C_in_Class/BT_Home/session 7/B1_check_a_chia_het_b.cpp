#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
int main(){
	int a,b ;
	printf(" moi nhap hai so :");
	scanf("%d %d",&a,&b);
	if(a % b == 0){
		printf("%d chia het cho %d",a,b);
	}
	else{
		printf("%d chia ko het cho %d",a,b);
	}

}

