#include <stdio.h>
#include <conio.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
int main(){
	char a;
	printf("Moi nhap 1 ki tu ngon ngu lap trinh can tim kiem:");
	scanf("%c",&a);
	switch(a){
		case 'A':case 'a':
		printf("Ada");
		break;
		case 'B':
		case 'b':
		printf("Basic");
		break;
		case 'C':
		case 'c':
		printf("COBOL");
		break;
		case 'D':
		case 'd':
		printf("dBASE");
		break;
		case 'F':
		case 'f':
		printf("Fortran");
		break;
		case 'P':
		case 'p':
		printf("Pascal");
		break;
		case 'V':
		case 'v':
		printf("Visual C++");
		break;
		default:
		printf("the input does not match any of the above letters!");
		break;
	
    }
			
	

}

