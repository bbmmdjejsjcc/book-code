#include <iostream>
#include <list>
using namespace std;
int main()
{
	list<int> list1;//创建一个空的list
	list<int> list2(list1);//使用list1初始化list2
	list<int> list3(3);//创建含有3个元素的list3
	list<int> list4(10,5);//创建包含10个值为5的list4
	list<int> list5(list1.begin(),list1.end());//使用list1初始化list5,同list2

	cout<<((list1==list2)?true:false)<<endl;
	return 0;
}
