#include <stdio.h>
#include <conio.h>
#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	char a[80];
	printf("nhap 1 chuoi ky tu:");
	scanf("%[^\n]s",&a);
	int n=strlen(a);
	int vowels=0,consonants=0,digits=0,spaces=0;
	for(int i=0;i<n;i++){
		if(a[i]=='a' || a[i]=='e' || a[i]=='i' ||
           a[i]=='o' || a[i]=='u' || a[i]=='A' ||
           a[i]=='E' || a[i]=='I' || a[i]=='O' ||
           a[i]=='U'){
           	vowels++;
		   }
		   else if((a[i]>='a'&& a[i]<='z') || (a[i]>='A'&& a[i]<='Z'))
        {
            ++consonants;
        }
        else if(a[i]>='0' && a[i]<='9')
        {
            ++digits;
        }
        else if (a[i]==' ')
        {
            ++spaces;
        }
		   
		   
	} 
printf(">>Tim thay %d nguyen am chuoi [%s]\n",vowels,a);
printf(">>Tim thay %d phu am chuoi [%s]\n",consonants,a);
    printf("Vowels: %d",vowels);
    printf("\nConsonants: %d",consonants);
    printf("\nDigits: %d",digits);
    printf("\nWhite spaces: %d", spaces);

}

