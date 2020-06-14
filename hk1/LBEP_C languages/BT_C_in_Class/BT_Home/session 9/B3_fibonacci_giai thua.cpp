#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main()
{
/*	  int i, n, t1 = 0, t2 = 1, nextTerm;
    printf("Enter the number of terms: ");
    scanf("%d", &n);
    printf("Fibonacci Series: ");
    for (i = 1; i <= n; i++)
    {
        printf("%d ", t1);
       nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
    }
    return 0; 
*/	
/*       int t1 = 0, t2 = 1, nextTerm = 0, n;
    printf("Enter a positive number: ");
    scanf("%d", &n);
    // displays the first two terms which is always 0 and 1
    printf("Fibonacci Series: %d, %d, ", t1, t2);
    nextTerm = t1 + t2;
    while(nextTerm <= n)
    {
        printf("%d, ",nextTerm);
        t1 = t2;
        t2 = nextTerm;
        nextTerm = t1 + t2;
    }
    
    return 0;
*/
/*   int a=0,b=1,c=1,i ;

for(a,b,c,i;i<=20;a=b,b=c,c=a+b,i++){
       printf(" %d ",c);
 } 
 return 0; 
*/
/*      int a=1 ,b=1 ,c=1,i=1;
      do{
      	a=b;
      	b=c;
      	c=a+b;
      	printf(" %d ",c);
      	i++;
	  } while(i<10);
	  return 0;
*/
  int a,b,c,n;
  do{printf("nhap so lg phan tu trong fibonaci[3-30]");
  scanf("%d",&n);
  if(n>=3 && n<=30){
  	break;
  }
  printf("nhap so tu 3-30\n");
  }while(1);
  a=b=1;
  printf("%d\t%d\t",a,b);
  for(int i=2;i<n;i++){
  	c=b+a;
  	printf("%d\t",c);
  	a=b;
  	b=c;
  }
}

