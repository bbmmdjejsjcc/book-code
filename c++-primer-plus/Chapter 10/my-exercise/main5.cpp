#include <iostream>
#include <array>
using namespace std;
int main()
{
	array<int,10> a1;//初始化带10个int的array a1;
	array<int,10> a2={0,1,2,3,4,5,6,7,8,9};//列表初始化
	array<int,10> a3={42};//a3[0]是42，剩余元素为0
	return 0;
}
