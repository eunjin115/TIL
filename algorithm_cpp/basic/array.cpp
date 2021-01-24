#include <iostream>
#include <stdio.h>

using namespace std;

int main(void){
		
	char arr[10];
	cout << "문자 입력";
	cin >> arr; 
	cout << "내용 : " << arr;

	printf("\n");
	cout << strlen(arr) << endl; 
	cout << arr[0] << endl;
	cout << arr << endl;

	return 0;
}