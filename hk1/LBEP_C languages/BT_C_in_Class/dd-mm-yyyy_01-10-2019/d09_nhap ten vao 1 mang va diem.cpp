#include <stdio.h>
#include <stdio.h>
int main(){
	char ten[31];// linh khai bao 1 chuoi ky tu - chua toi da 30 ky tu
	int diem;
	printf("nhap ten:");
//	scanf("%[^\n]s",ten);// %[^\n]s : cho phep nhap chuoi ky tu bao gom khoang trang 
    gets(ten);
	printf("nhap diem ket qua:");
	scanf("%d",&diem);
	// xuat ra man hinh du lieu vua nhap
	printf("\t Ten sinh vien:%s\n",ten);
	puts(ten);
	printf("\t Diem ket qua:%d\n",diem);
	
}

