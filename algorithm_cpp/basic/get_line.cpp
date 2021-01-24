#include <iostream>
using namespace std;

int main(void){
    
    char arr[10];
    cout << "문자 입력";
    cin.getline(arr,10, ' '); // 10은 최대 입력 가능 문자수, default 종결 문자는 \n (개행문자)
    // cin.getline(arr,10,' '); // [예] 세 번째 인자는 종결 문자 설정 -> 공백(' ')
    cout << arr << endl;
    
    return 0;
}