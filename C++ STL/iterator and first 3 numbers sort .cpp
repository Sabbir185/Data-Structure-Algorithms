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

    sort(vec.begin(),vec.begin()+3); // sort fix length , i sort here 1st 3 numbers:)


    for(it=vec.begin(); it!=vec.end(); it++)
    {
        cout<<*it<<" ";
    }




}
