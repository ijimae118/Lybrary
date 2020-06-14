#include <stdio.h>
#include <conio.h>
#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	char str[100];
	char *p = str;
	int palindrome=1;
	printf("nhap mot chuoi:");
	gets(str);
	int n =strlen(str);
	for (int i=0,j=n-1;i<j;i++,j--){
		if(*(p+i)!=*(p+j)){
			palindrome =0;
			break;
		}
	}
   if(palindrome==1){
   	printf("chuoi[%s] doi xung.\n",p);
   }
   else printf("chuoi [%s] ko doi xung.\n",p);
}

