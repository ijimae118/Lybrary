#include <stdio.h>
#include <conio.h>
#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
/*  char s[2][100];
  char* p;
  printf("Nhap 2 chuoi :");
  for(int i=0;i<2;i++){
  	printf("%d",i+1);
  	gets(s[i]);
   }
 */ 
   // Take any two strings 
    char s2[] = "HELLOKITTY"; 
    char s1[] = "LOKI"; 
    char* p; 
  // Find first occurence of s2 in s1 
    p = strstr(s2, s1); 
  
    // Prints the result 
    if (p) { 
        printf("String found\n"); 
        printf("First occurrence of string '%s' in '%s' is '%s'", s2, s1, p); 
    } else
        printf("String not found\n"); 
  
  //  return 0; 

/*char a[31],b[31];
char *p;
printf("moi nhap chuoi 1:");
gets(a);
printf("moi nhap chuoi 2:");
gets(b);
p=strstr(b,a);
if (p) { 
        printf("String found\n"); 
        printf("First occurrence of string '%s' in '%s' is '%s'", b, a, p); 
    } else
        printf("String not found\n"); 
*/  
}
