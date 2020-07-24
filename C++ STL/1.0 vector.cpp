#include<iostream>
#include<vector>      // for vector
#include<iterator>   // for iterator
#include<algorithm>  // for sorting
using namespace std;

int main()
{
    vector<int>v;
    vector<int>::iterator it;

    v.push_back(1);
    v.push_back(5);
    v.push_back(3);
    v.push_back(4);  // pop_back();

    v.pop_back();    // remove last element; of array~vector :)

    sort(v.begin(),v.end());

    for(it=v.begin();it!=v.end();it++)
    {
        cout<<*it<<endl;
    }

    cout<<"Is empty ? "<<v.empty()<<endl;

    reverse(v);
    for(it=v.begin();it!=v.end();it++)
    {
        cout<<*it<<endl;
    }
	
	cout<<"size of vector : "<<v.size()<<"\n";
	
	v.clear();

    cout<<"size of vector after clear : "<<v.size()<<"\n"<<"Thank you ! :)";

    return 0;
}
