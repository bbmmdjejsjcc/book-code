#include <iostream>
#include <list>
using namespace std;
int main()
{
	list<int> list1;//����һ���յ�list
	list<int> list2(list1);//ʹ��list1��ʼ��list2
	list<int> list3(3);//��������3��Ԫ�ص�list3
	list<int> list4(10,5);//��������10��ֵΪ5��list4
	list<int> list5(list1.begin(),list1.end());//ʹ��list1��ʼ��list5,ͬlist2

	cout<<((list1==list2)?true:false)<<endl;
	return 0;
}
