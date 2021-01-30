//https://www.acmicpc.net/problem/2941

#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
	vector<string> vec = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	int idx;
	string str;

	cin >> str;
	for (int i = 0; i < vec.size(); i++)
	{
		while(1)
		{
			idx = str.find(vec[i]);
			if(idx == string::npos)
				break;
			str.replace(idx,vec[i].length(),"#");
		}
	}
	cout << str.length();
}