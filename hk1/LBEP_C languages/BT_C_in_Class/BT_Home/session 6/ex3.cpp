#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
int main(){
	printf("The number 555.55 in various forms:\n");
	printf("In float form without modifiers:\n");
printf("[%f]\n", 555.55);
printf("In exponential form without any modifier:\n");
printf("[%e]\n", 555.55);
printf("In float form with - modifier:\n");
printf("[%-f]\n", 555.55);
printf("In float form with digit string 10.3 as modifier\n");
	printf("[%10.3f]\n", 555.55);
	printf("In float form with 0 as modifier:\n");
	printf("[%0f]\n", 555.55);
	printf("In float form with 0 and digit string 10.3");
	printf("as modifiers:\n");
	printf("[%010.3f]\n", 555.55);
	printf("In float form with -, 0 ");


}

