#include <stdio.h>
int main()
{
	char letter[31];
	printf("\nPlease enter any character: ");
//  letter=getchar();
	gets(letter);
//  putchar(letter);
    puts(letter);
	printf("\nThe character entered by you is %s ", letter);
}

