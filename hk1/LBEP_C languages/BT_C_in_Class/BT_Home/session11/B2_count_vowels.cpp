#include <stdio.h>
#include <conio.h>
#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
int main(){
	// chuong trinh dem so nguyen am trong 1 chuoi ky tu
	char s[80];
	printf("nhap 1 chuoi ky tu:");
	gets(s);
	int n = strlen(s); // bien n chua tong so ky tu trong chuoi s
	int vowel=0; // bien chua so luong nguyen am cua chuoi s
	for (int i=0;i<n;i++){
//		printf("%d",i);}
		switch(s[i]){
			case'a':
				case'A':
					case'e':
						case'E':
						    case'o':
						  	    case'O':
						  	        case'u':
						  		        case'i':
						  			case'I': vowel++; break;
							
		}
	}
	printf(">>Tim thay %d nguyen am chuoi [%s]\n",vowel,s);

}

