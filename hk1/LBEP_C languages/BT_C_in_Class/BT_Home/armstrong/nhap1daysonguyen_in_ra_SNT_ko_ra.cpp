#include <stdio.h>
#include <conio.h>
#include <math.h>
int main()
{
    int n,i,x[10];
    printf("nhap so luong phan tu");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("x[%d]",i);
        scanf("%d",&x[i]);
    }
    printf("mang x[i] da nhap vap");
    for(i=0;i<n;i++)
    {
        printf("%2d",x[i]);
    }
    for(i=0;i<n;i++)
    {
        if(int(x[i]&&n)==1)
        {
            printf("cac so nguyen to co trong mang la %d",x[i]);
        }
    }

int nt(int x[10],int n)
{
    int i,j;
    int kt;
    for(i=0;i<n;i++)
    {
        kt=1;
        for(j=2;j<x[i];j++)
        {
            if(x[i]%j==0)
            kt=0;
        }

    }
    if(kt)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}


}
