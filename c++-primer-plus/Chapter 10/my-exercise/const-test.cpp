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
//        num+=10; //����const���������޸������ݳ�Ա
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
//    a2.out1(); // ����const�Ķ��� ���ܷ��ʷ�const�ĺ���
    a2.out2();
    a2.out3();
    return 0;
}

