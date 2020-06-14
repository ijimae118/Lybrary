#include <stdio.h>
int main()
{
	int a;
	float d;
	char ch, name[40];
	printf("Please enter the data\n");
	scanf("%d %f %c %[^\n]s", &a, &d, &ch, &name);
//	gets(name);
	printf("\nThe values accepted are: %d, %.0f, %c, %s", a, d, ch, name);
}



