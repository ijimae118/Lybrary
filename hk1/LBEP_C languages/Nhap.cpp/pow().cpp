#include <stdio.h>
#include <conio.h>
#include <math.h> 
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
   int n;
   printf("nhap 2 so:");
   scanf("%d ",&n);

/*   printf("2 ^ 3 = %lf\n", pow(a, b));

   printf("4.05 ^ 2.98 = %lf", pow(4.05, 2.98));
   
   return(0);
*/
int CountDigit(n);
	printf("%d",n);
}

int CountDigit(int &n){
    int count = 0;
    while (n > 0)
    {
        n /= 10;
        ++count;
    }
    return count;
}

	




