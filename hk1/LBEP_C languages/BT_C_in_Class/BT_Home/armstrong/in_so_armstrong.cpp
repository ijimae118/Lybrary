#include <stdio.h>
#include <conio.h>
#include <math.h>
//#include <stdlib.h>

int isArmstrong(int n)
{
    int tong=0, dem=0 ,tam=n;

    //X�c d?nh xem s? nguy�n n c� bao nhi�u ch? s?
    //v� luu v�o bi?n dem
    do
        dem++;
    while (tam/=10);

    //T�nh t?ng luy th?a c?a c�c ch? s?
    tam=n;
    do
        tong+=pow((tam%10),dem);
    while ((tong<=n) && (tam/=10));

    if (tong==n)
        return 1;//true
    else
        return 0;//false
}

int main()
{
//    system("cls");
    for (int i=0; i<=1000000; i++)
        if (isArmstrong(i))
            printf("%d ",i);
    getch();
}
