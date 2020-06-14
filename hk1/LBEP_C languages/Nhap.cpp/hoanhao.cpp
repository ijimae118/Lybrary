#include<stdio.h>
#include<conio.h>
#include<math.h>
// 1+2+3=6 la so hoan hao 1+2+3+4+5=12 ko la so hoan hao 
int main()
{
	int x;
	printf("Nhap mot so nguyen duong:");
	scanf("%d", &x);
	int s = 0;
	for (int i = 1; i < x; i++) 
// ch?y t? 1 d?n < x vì không th? chia cho 0 và vì x%x =0 
//nhung x không th? là u?c c?a x 
	if (x%i == 0)
		s += i;
//		printf("%d",s); 	
	if (s == x)
		printf("%d la so hoan hao", s);
	else
		printf("%d khong phai la so hoan hao", s);
	//getch();




/*
    long long  n,sum;
    cout << "Enter your number: "; cin >> n;
    for ( int number = 1;number  <= n;number++)
    {
        sum =0;
        for (int i = 1 ; i <= number;i++)
            if (number%i==0)
                sum+=i;
        if (sum/2.0 == number)
            cout << number << endl;
    }
    return 0;
*/	
}
