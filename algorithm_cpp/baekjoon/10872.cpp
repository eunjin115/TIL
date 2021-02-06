//https://www.acmicpc.net/problem/10872

#include <iostream>

using namespace std;

int	fac(int n)
{
	if (n == 0 || n == 1)
		return (1);
	return (n * fac(n - 1));
}

int	main()
{
	int n;
	cin >> n;
	n = fac(n);
	cout << n;
}
