#include <iostream>
using namespace std;
namespace first_space
{
	void func()
		{
			cout<<"hello first_space"<<endl;
		}
}

namespace second_space
{
	void func()
		{
			cout<<"hello second_space"<<endl;
		}
}

int main()
{
	first_space::func();
	second_space::func();
}
