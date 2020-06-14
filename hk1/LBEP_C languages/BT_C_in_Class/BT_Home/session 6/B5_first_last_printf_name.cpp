#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
int main(){
	char a[31],b[31];
	printf("your first name:");
	scanf("%[^\n]s",&a);// doi ham chuoi thi co the bo s and &  
	//gets(a);
	fflush(stdin);
	printf("your last name:");
	gets(b);
    printf("YFN&YLN:%s %s\n",b,a);
}

