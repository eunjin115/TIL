#include <iostream>
#include <stack>
#include <string>

using namespace std;

bool Check(string str){
	int	len = (int)str.length();
	int	i;
	stack <char> st;

	i = 0;
	while (i < len)
	{
		char c = str[i];
		if(c == '(')
			st.push(str[i]);	//여는괄호 -> 스택에 push
		else
		{
			if(!st.empty())	//닫는 괄호 -> 비었는지 확인하기 
				st.pop();	//비어있지 않았으면 pop
			else
				return (false);	//비어있으면 닫는 괄호에 맞는 여는 괄호가 없으므로 false
		}
		i++;
	}
	return (st.empty());	//반복문이 끝나고 스택에 괄호가 남아있으면 맞는 닫는 괄호가 없는 것이므로 false 리턴. 아니면 true 리턴. 
}
 
int main(void){
	int	n;
	int	i;

	i = 0;
	cin >> n;

	while (i < n)
	{
		string str;
		cin >> str;
		if(!Check(str))
			cout << "NO" << endl;
		else
			cout << "YES" << endl;
		i++;
	}
	
	return (0);
}
