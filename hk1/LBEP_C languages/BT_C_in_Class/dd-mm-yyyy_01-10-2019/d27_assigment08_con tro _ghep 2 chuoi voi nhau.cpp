#include <stdio.h>
#include <conio.h>
#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	char a[81];
	char b[81];
    char c[162];
    char *x=a;
    char *y=b;
    char *z=c;
    printf("nhap chuoi thu nhat:");
    scanf("%s",a);
    fflush(stdin);
    printf("nhap chuoi thu hai:");
    gets(b);
    for (int i=0 ;i<strlen(a);i++){
    	*z=*x;
    	z++;
    	x++;
    	
	}
	*(z++)=' ';
	for (int i=0;i<strlen(b);i++){
		*z=*y;
		z++;
		y++;
	}
	*(z++)=NULL;
	printf("%s\n",a);
	printf("%s\n",b);
	printf("%s\n",c);
}

