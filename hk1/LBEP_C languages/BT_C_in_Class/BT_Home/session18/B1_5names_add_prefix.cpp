#include <stdio.h>
#include <conio.h>
#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
char names[5][20], prefix[5];
char tmp[32];
int i=0;
// accept 5 names and a prefix
printf("Please enter the 5 names and a prefix\n");
for(i;i<=4;i++)
   {
   	fflush(stdin);
    printf("Enter name %d\n ",i+1);
    scanf("%[^\n]s", &names[i]);
   }
printf("prefix: \n ");
fflush(stdin);
scanf("%[^\n]s", &prefix);
printf("\n\n\n");

for(i=0;i<=4;i++)
   {
    strcpy(tmp, prefix);
    strcat(tmp, names[i]);
    printf("%s\n", tmp);
   }
}

