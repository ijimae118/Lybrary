#include <stdio.h>
#include <conio.h>
//#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
/*viet chuong trinh ghi 1 doan tho vo 1 tap tin van ban , co ten bai tho.txt*/
int main(){
	FILE*f;// khai bao 1 con tro file
    char filename[30]="baitho.txt";
    // open file baitho.txt de ghi du lieu
    f = fopen(filename,"w");
    // ghi du lieu
    fputs("bai tho con coc\n",f);
    fputs("con coc no ngoi trong hoc\n",f);
    fputs("no dua cai lung ra ngoai\n",f);
    fputs("do la con coc...\n",f);
    fputs("het! \n",f);
    fputs("Tac gia: no name \n",f);
    //dong tap tin 
    fclose(f);
    printf("Write Finished !");
}

