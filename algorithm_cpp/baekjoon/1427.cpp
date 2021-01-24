//https://www.acmicpc.net/problem/1427

#include <iostream>
#include <algorithm>

using namespace std;

int main(void)
{
	string str;
	cin >> str;
	sort(str.begin(), str.end(), greater<char>()); 
	cout << str;
}
