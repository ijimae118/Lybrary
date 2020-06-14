#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
int main(){
char name[31] = "MARK";	
float basic=2500, daper=55;
float bonper=33.33,  loandet=250.00;
float salary = basic+basic*daper/100+bonper*basic/100-loandet;
printf("%-10s %10s %10s\n","Name","Basic","Salary");
printf("%-10s %10.0f %10.0f",name,basic,salary);

	
}

