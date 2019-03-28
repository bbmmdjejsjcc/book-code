#include <iostream>
#include <vector>
using namespace std;
int main()
{
	vector<int>vec1;//默认初始化，vec1为空
	for(int i;i<=10;i++)
		{
			vec1.push_back(i);
		}
	vector<int> vec2(vec1);//使用vec1初始化vec2
	vector<int> vec3(vec1.begin(),vec1.end());
	vector<int> vec4(10);//10个值为0的元素
	vector<int> vec5(10,4);//10个值为4的元素

	cout<<(vec1==vec2)?true:false;
	cout<<"\n";
	cout<<(vec1==vec3)?true:false;
	cout<<"\n";
	return 0;
}
