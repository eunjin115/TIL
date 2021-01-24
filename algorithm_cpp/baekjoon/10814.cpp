//https://www.acmicpc.net/problem/10814

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <utility>

using namespace std;

bool compare(pair<int,string> a, pair<int,string> b)
{
	return a.first < b.first;
}
int main()
{
	int num;
	pair<int,string> tmp;
	vector<pair<int,string>> arr;
	int i;

	cin >> num;
	i = 0;
	while (i < num)
	{
		cin >> tmp.first >> tmp.second;
		arr.push_back(tmp);
		i++;
	}
	stable_sort(arr.begin(),arr.end(),compare);
	i = 0;
	while (i < num)
	{
		cout << arr[i].first << ' ' << arr[i].second << '\n';
		i++;
	}
}