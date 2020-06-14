
/*
    BT ki?m tra s? Armstrong
    vd:153= (1x1x1)+(5x5x5)+(3*3*3)
 */
 
#include <stdio.h>
#include <math.h>
/*
    1. �?m s? lu?ng ch? s?
    2. T�nh t?ng c�c luy th?a: co s? l� c�c ch? s?, s? mu l� s? lu?ng ch? s?
    3. So s�nh v� k?t lu?n
 */
 
// �?m s? lu?ng ch? s? c?a s? n
/*
    1023
    1. 102
    2. 10
    3. 1
    4. 0
    => C� 4 ch? s?
 */
int CountDigit(int n)
{
    int count = 0;
    while (n > 0)
    {
        n /= 10;
        ++count;
    }
    return count;
}
 
// Ki?m tra s? armstrong
/*
    n = 1023
    => 1^4 + 0^4 + 2^4 + 3^4 so s�nh v?i 1023
 
    1023 % 10 = 3
    1023 / 10 = 102
 */
bool IsArmstrong(int n)
{
    int numDigit = CountDigit(n);
    int tmp = n, sum = 0, last;
    while (tmp > 0)
    {
        last = tmp % 10; // l?y ch? s? cu?i c�ng
        tmp /= 10;       // b? ch? s? cu?i c�ng
        sum += pow(last, numDigit);//sum=0+(r^r)
    }
    if (sum == n)      //=> 1^4 + 0^4 + 2^4 + 3^4 so s�nh v?i 1023
        return true;
    return false;
}
 
int main()
{
    int n;
    printf("\nNhap n = ");
    scanf("%d", &n);
 
    if (IsArmstrong(n) == true)
    {
        printf("\n%d la so armstrong!", n);
    }else{
        printf("\n%d khong la so armstrong!", n);
    }
}
