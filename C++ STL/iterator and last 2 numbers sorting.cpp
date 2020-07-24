#include <iostream>
#include <vector>
#include <iterator>
#include <algorithm>
using namespace std;

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

    sort(vec.begin()+3,vec.end()); // sort fix length , I sort here last 2 numbers:)


    for(it=vec.begin(); it!=vec.end(); it++)
    {
        cout<<*it<<" ";
    }




}
