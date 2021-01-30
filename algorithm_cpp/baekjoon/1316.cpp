//https://www.acmicpc.net/problem/1316

#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
	int		n;
	string	str;
	int		result;

	result = 0;
	cin >> n;
	for(int i=0; i<n; i++)
	{
		cin >> str;
		int size = str.length();
		bool flag = true;
		
		for(int j=0; j<size; j++)
		{
			for(int k=0; k<j; k++)
			{
				if(str[j] != str[j-1] && str[j] == str[k])
				{
					flag = false;
					break;			
				}				
			}
		}
		if(flag) 
			result++;
	}
	
	cout << result;

	return 0;
}