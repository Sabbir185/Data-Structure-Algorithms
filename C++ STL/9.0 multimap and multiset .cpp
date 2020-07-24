#include<iostream>
#include<map>
#include<set>
#include<iterator>
using namespace std;
/*
    map -> multimap same value contains but map not allow ; and other all same
    same logic or theory for set and multiset :)
    output same ; Ascending order :)
 */


int main()
{
    multimap<string,int> m;
    multimap<string,int>::iterator it;

    m.insert(make_pair("Sabbir",185));
    m.insert(make_pair("Nazib",195));
    m.insert(make_pair("Sabbir",185));

    for(it=m.begin();it!=m.end();it++)
    {
        cout<<it->first<<" "<<it->second<<"\n";
    }

    //.........multiset........................

    cout<<"\nmultiset : "<<endl;

    multiset<int> s;
    multiset<int>::iterator i;
    s.insert(185);
    s.insert(195);
    s.insert(185);
    s.insert(185);

    for(i=s.begin();i!=s.end();i++)
    {
        cout<<*i<<"\n";
    }

    return 0;
}