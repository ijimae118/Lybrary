#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
int main()
{	int num1, num2, res;
	char op;
	printf("enter number 1:");
	scanf("%d",&num1);
	printf("enter number 2:");
	scanf("%d",&num2);
	fflush(stdin);
	printf("enter (+,-,x,/):");
	scanf("%c",&op);
	system("cls");
	switch (op)
	{	case '+':
			res = num1 + num2;
			printf("\nThe Sum is: %d", res);
			break;
		case '-':
			res = num1 - num2;
			printf("\nNumber after Subtraction: %d", res);
			break;
		case '/':
			res = num1 / num2;
			printf("\n nNumber after Division: %d", res);
			break;
		case '*':
			res = num1 * num2;
			printf("\n nNumber after multiplication: %d", res);
			break;
		default:
			printf("\nInvalid");
			break;
	}
}

