#include<stdio.h>
int main(){
/*	
int a, b = 0;
int c[10] = {1,2,3,4,5,6,7,8,9,0};
for (a=0; a<10; ++a){
 if( (c[a]%2) == 0)
b = b+c[a];

}printf("%d",b);

*/


/*int i, x=0;
for(i=1; i< 10; ++i) {
printf("%d",i);
if(i%2 == 1)
x =x+i;
else
x--;
}
printf("%d",x);
*/
/*int i, j, x=0;
for(i=0; i<5; ++i)
for(j=0; j< i; ++j)
//printf("%d",i);
//printf("j:");
//printf("%d\n",j);
x=x+(i+j-1);
printf("%d",x);
*/
for(int i=1; i<3; i++) {
for(int j=1; j<3; j++) {
printf("i:\n");
printf("%d\n", i);
printf("j:\n");
printf("%d\n", j);
printf("i*j:\n");
printf("%d\n", i*j);
}
}
}
