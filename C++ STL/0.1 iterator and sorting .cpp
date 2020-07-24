#include <iostream>
#include <vector>
#include <iterator>
#include <algorithm>
using namespace std;

bool func(int a,int b)  // for descending sort
{
    return (a>b);
}

int main()
{
    vector<int> vec;
    vector<int>::iterator it;

    for(int i=0; i<5;i++)
    {
        int n;
        cin>>n;
        vec.push_back(n);
    }

    sort(vec.begin(),vec.end(),func); // for descending sorting call func from global


    for(it=vec.begin(); it!=vec.end(); it++)
    {
        cout<<*it<<" ";
    }




}
