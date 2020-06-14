#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
int main(){
	int a,b,c,max;
	printf("nhap 3 gia tri a_b_c:");
	scanf("%d %d %d",&a,&b,&c);
//	if(a>b&&a>c){
//		printf("%d la so lon nhat",a);
//	}
//	else if(b>a&&b>c){
//		printf("%d la so lon nhat",b);
//	}
//	else{
//	printf("%d la so lon nhat",c);
//    }
// c2:tim so lon nhat giua a va b ,luu so nay vao bien max
//if (a>b){
//	max=a;
//}else{
//	max=b;
//}
//c3:
max=(a>b)?a:b;
//c2:tim so lon nhat giua max va c (in so lon nhat giua a,b,c)
/*if (c>max){
	max=c;
}
*/
max=(max<c)?c:max;
printf("so lon nhat giua 3 so %d %d va %d la %d",a,b,c,max);
}

