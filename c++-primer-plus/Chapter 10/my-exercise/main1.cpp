#include <iostream>
using namespace std;
template<class T1,class T2>
class Point
{
private:
	T1 m_x;//x����
	T2 m_y;//y����
public:
	Point(T1 x,T2 y):m_x(x),m_y(y){}
	T1 getX()const;//��ȡx����
	T2 getY()const;//��ȡy����
	void setX(T1 x);//����x����
	void setY(T2 y);//����y����
};

template<class T1,class T2>//ģ��ͷ
T1 Point<T1,T2>::getX()const
{
	return m_x;
}

template<class T1,class T2>
void Point<T1,T2>::setX(T1 x)
{
	m_x=x;
}

template<class T1,class T2>
T2 Point<T1,T2>::getY()const
{
	return m_y;
}

template<class T1,class T2>
void Point<T1,T2>::setY(T2 y)
{
	m_y=y;
}

int main()
{
	Point<int,int>p1(10,20);
	cout<<"x="<<p1.getX()<<",y="<<p1.getY()<<endl;

	Point<string,string>p2("cc","gx");
	cout<<"x="<<p2.getX()<<",y="<<p2.getY()<<endl;
}
