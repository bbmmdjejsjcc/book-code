#include <iostream>
using namespace std;
class constTest{
private:
    int num;
	
public:
    constTest()
	{
        num = b;
    };
	
    void out1()
	{
		num+=10;
        cout<<num<<endl;
    }
	
    void out2() const
    {
        cout<<num<<endl;
    }
    void out3() const
    {
//        num+=10; //出错，const函数不能修改其数据成员
        cout<<num<<endl;
    }
};
int main()
{
    constTest a1;
    a1.out1();
    a1.out2();
    a1.out3();
    const constTest a2;
//    a2.out1(); // 错误，const的对象 不能访问非const的函数
    a2.out2();
    a2.out3();
    return 0;
}

