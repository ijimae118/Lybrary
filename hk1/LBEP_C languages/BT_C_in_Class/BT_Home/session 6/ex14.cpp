/* Ch??ng trình trình bày getchar() và putchar() */
#include <stdio.h>
int main()
{
	char letter;
	printf("You can enter a character now: ");
	letter = getchar();
	putchar(letter);
}

