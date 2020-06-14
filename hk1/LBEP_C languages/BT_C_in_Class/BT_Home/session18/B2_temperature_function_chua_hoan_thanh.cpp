#include <iostream>

using namespace std;

void main ()
{
	float monTemp1, monTemp2;
	float tueTemp1, tueTemp2;
	float wedTemp1, wedTemp2;
	float thuTemp1, thuTemp2;
	float friTemp1, friTemp2;
	float satTemp1, satTemp2;
	float sunTemp1, sunTemp2;
	float average;


	cout << "Please enter this week's temperature: \n";
	cout << "	Monday: ";
	cin >> monTemp1 >> monTemp2;
	cout << "	Tuesday: ";
	cin >> tueTemp1 >> tueTemp2;
	cout << "	Wednesday: ";
	cin >> wedTemp1 >> wedTemp2;
	cout << "	Thursday: ";
	cin >> thuTemp1 >> thuTemp2;
	cout << "	Friday: ";
	cin >> friTemp1 >> friTemp2;
	cout << "	Saturday: ";
	cin >> satTemp1 >> satTemp2;
	cout << "	Sunday: ";
	cin >> sunTemp1 >> sunTemp2;

	float averageNumber = (monTemp1 + monTemp2 + tueTemp1 + tueTemp2 + wedTemp1 + wedTemp2 + thuTemp1 + thuTemp2 + friTemp1 + friTemp2 + satTemp1 + satTemp1 + sunTemp1 + sunTem2) / 14;

	cout << "The average is: " << averageNumber << endl;

	system("pause");

}
 Edit & Run

