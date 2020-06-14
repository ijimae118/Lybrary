#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	int n;
	char ten[31];
	printf(" ten cua ban:");
	scanf("%[^\n]s",&ten);
	printf(" nhap so tuoi:");
	scanf("%d",&n);
	for(int i=1;i<=n;i++){
		printf("%s\n",ten);
	}

}

