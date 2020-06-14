#include <stdio.h>
#include <conio.h>
//#include <string.h>
//#include <math.h> 
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);


//int a(int n);
//int main(){
/*	int n;
	printf("nhap 1 so nguyen:");
	scanf("%d",&n);
	printf("factorial %d! (giai_thua) la %d",n,a(n));	
}
 
int a(int n){
     int a=1;
    for(int i=1;i<=n;i++){
		a=a*i;
    }
	 return a;
*/
//}


long factorial(int);
 
int main()
{
  int n;
  long f;
 
  printf("Enter an integer to find its factorial\n");
  scanf("%d", &n);
 
  if (n < 0)
    printf("Factorial of negative integers isn't defined.\n");
  else
  {
    f = factorial(n);
    printf("%d! = %ld\n", n, f);
  }
 
  return 0;
}
 
long factorial(int n)
{
  if (n == 0)
    return 1;
  else
    return(n * factorial(n-1));
}




