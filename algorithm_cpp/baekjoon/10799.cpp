//https://www.acmicpc.net/problem/10799

#include <iostream>
#include <string>
#include <stack>

using namespace std;

string str;

int pipe(string& str)
{
	stack <char> st;
	int result;
	int	i;
	
	i = 0;
	result = 0;
	while (i < str.length())
	{
		if (str[i] == '(')	//여는 괄호라면 스택에 push
			st.push(str[i]);
		else
		{
			st.pop();
			if (str[i - 1] == '(')
				result += st.size();
			else
				result++;
		}
		i++;
	}
	
	return (result);
}

int main(void)
{
	cin >> str;
	cout << pipe(str);
}