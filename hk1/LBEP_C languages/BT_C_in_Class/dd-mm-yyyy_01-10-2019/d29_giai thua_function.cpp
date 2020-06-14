#include <stdio.h>
#include <conio.h>
//#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
// Bai tap kiem giai thua 
double gt(int n); //khai bao ham gt-prototype cua ham gt
// day cung chinh la nguyen mau ham
// trong ham main()_n,x la local variables
int main(){
	int n ;
	printf("nhap 1 so nguyen duong:");
	scanf("%d",&n);
	double x=gt(n);
	printf("\n >>%d! = %.0f\n ",n,x);

}
//dinh nghia ham tinh giai thua cua 1 so nguyen n.
// trong ham gt(n): local: i,kq .formal parameters la n
// gt(m->n):m va n chi la ten dat khac ko sao or ko dat cung dc 
double gt(int n){
/*	double kq=1;
	for (int i=1;i<=n;i++){
		kq=kq*i;
	}
	
	return kq;
*/
  if(n==0){
  	return 1;
  }else{
  	return gt(n-1)*n;
  }
}
