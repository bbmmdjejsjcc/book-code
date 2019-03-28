#include <iostream>
#include "mystock20.h"
using namespace std;
Stock::Stock()
{
	shares=0;
	share_val=0.0;
	total_val=0.0;
}

Stock::Stock(const std::string &co,long n,double pr)
{
	company=co;
	if(n<0)
		{
			std::cout<<"numbers of shares can not be negative;"<<company<<"shares set to 0\n";
			shares=0;
		}
	else
		{
			shares=n;
		}
	share_val=pr;
	set_tot();
}


