#include <stdio.h>
#include <conio.h>
//#include <string.h>
//#include <math.h> vd:M_const
//#define const 3.14
//#include <stdlib.h> vd:system("cls");
//fflush(stdin);
	// mo ta 1 cau truc sinh vien
	typedef struct {
		int id;
		char name[31];
		int mark;
	}STUDENT;
int main(){
/*	// mo ta 1 cau truc sinh vien
	struct STUDENT{
		int id;
		char name[31];
		int mark;
	};
*/	
	//khai bao bien sv1 , sv2 co kieu cau truc sinh vien
	STUDENT sv1={100,"Le Minh",99};
	STUDENT sv2={101,"Do Minh Phong",80};
	
	// in thong tin sinh vien
	printf("sinh vien thu 1 :\n");
	printf("id=%d,ten=%s,diem kq:%d\n",sv1.id,sv1.name,sv1.mark);
    printf("sinh vien thu 2 :\n");
	printf("id=%d,ten=%s,diem kq:%d\n",sv2.id,sv2.name,sv2.mark);

}

