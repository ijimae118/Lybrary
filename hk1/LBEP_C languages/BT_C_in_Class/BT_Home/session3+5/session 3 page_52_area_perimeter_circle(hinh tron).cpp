#include <stdio.h>
#include <conio.h>
//#include <math.h>
//#define PI 3.14
int main(){
	float s,c,r;
    //const double PI=3.14;
	//"r:ban kinh, hang so pl=3.14 ,c:chu vi,s:dien tich"
	printf("\n nhap bk=");
	scanf ("%f", &r);
    s=r*r*3.14;
	c=r*2*3.14;
	//if chi su dung #include <math.h> thi:
	//s=r*r*M_PI;
	//c=r*2*M_PI;
	//if su dung (#include <math.h> and #define PI 3.14)thi ko dung const double PI=3.14;va ngc lai
	printf("area=%.2f\n",s);
	printf("perimeter=%.2f\n",c);
	
}

