#include <iostream>
#include <vector>
using namespace std;
int main()
{
	vector<int>vec1;//Ĭ�ϳ�ʼ����vec1Ϊ��
	for(int i;i<=10;i++)
		{
			vec1.push_back(i);
		}
	vector<int> vec2(vec1);//ʹ��vec1��ʼ��vec2
	vector<int> vec3(vec1.begin(),vec1.end());
	vector<int> vec4(10);//10��ֵΪ0��Ԫ��
	vector<int> vec5(10,4);//10��ֵΪ4��Ԫ��

	cout<<(vec1==vec2)?true:false;
	cout<<"\n";
	cout<<(vec1==vec3)?true:false;
	cout<<"\n";
	return 0;
}
