#include <stdio.h>
#include <conio.h>
//#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
float dt(float r);
float cv(float r);
int main(){
	float n;
	float a,b;
	printf("Ban kinh hinh tron:");
	scanf("%f",&n);
	a=dt(n);
	b=cv(n);
    printf("r=%f ta co dt=%.2f,cv=%.2f",n,dt(n),cv(n));
//	printf("r=%f ta co dt=%.2f,cv=%.2f",n,a,b);
    
}
float dt(float n){
	float s;
	s=n*n*3.14;
	return s;
}
float cv(float n){
	float c;
	c=2*n*3.14;
	return c;
}
