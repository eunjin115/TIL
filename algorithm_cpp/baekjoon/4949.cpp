//https://www.acmicpc.net/problem/4949

#include <iostream>
#include <stack>
#include <string>

using namespace std;

int main()
{
	string str;

	while (1)
	{
		getline(cin, str);
		stack<char> a;

		if (str.length() == 1 && str[0] == '.')
			break;
		bool flag = true;

		for (int i = 0; i < str.length() - 1; i++)
		{
			if (str[i] == '(')
				a.push('(');
			else if (str[i] == '[')
				a.push('[');
			else if (str[i] == ']')
			{
				if (!a.empty() && a.top() == '[')
					a.pop();
				else
				{ 
					flag = false;
					break; 
				}
			}
			else if (str[i] == ')')
			{
				if (!a.empty() && a.top() == '(')
					a.pop();
				else
				{ 
					flag = false;
					break; 
				}
			}
		}
		if (a.empty() && flag)
			cout << "yes" << "\n";
		else
			cout << "no" << "\n";
	}
	return (0);
}