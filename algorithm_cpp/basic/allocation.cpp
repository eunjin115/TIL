#include <iostream>
using namespace std;

int main() {

	int* p = new int(0); // 동적 메모리 할당, 초기값은 0으로 줌
    // int * p = new int; -> 동적 메모리 할당, 초기값은 주지 않음

	if (p == NULL) {
		cout << "failed" << endl;
		exit(1);
	}
	*p = 100;
	cout << *p;

	delete p; // C에서의 free와 동일
	p = NULL; // 메모리 해제 후 NULL을 대입해 놓는다.

}