#include<iostream>
#include<algorithm>
#include<map>
#include<iterator>
using namespace std;

//  my list(key,value) // key -> like as index , it's a awesome data structure :)
//  sabbir 185
//  nazib  195
//  motiur 192
//  mahbub 181
//  sium   180
//  farhan 184
//  output will be shown in alphabetic order : ascending order

int main()
{
    map<string,int> mp;
    map<string,int>::iterator it;

    mp["Sabbir"] = 185 ;
    mp["Nazib"] = 195 ;
    mp.insert(make_pair("Motiur",192));  // recommended to insert values
    mp.insert(make_pair("Mahbub",181));
    mp.insert(make_pair("Sium",180));
    mp.insert(make_pair("Farhan",184));

//    it = mp.begin();
//    cout<<it->first;

    for(it=mp.begin();it!=mp.end();it++)
    {
        cout<<it->first<<" "<<it->second<<endl;
    }
    cout<<"Size of map : "<<mp.size()<<"\n\n";


    //..........Erase................

//    mp.erase("Farhan");

    mp.erase( mp.begin(), mp.find("Nazib") ); // will be delete from beginning to before find("something") ;


    for(it=mp.begin();it!=mp.end();it++)
    {
        cout<<it->first<<" "<<it->second<<endl;
    }
    cout<<"Size of map after erasing : "<<mp.size()<<"\n\n";

    //........clean...........

    mp.clear();
    cout<<"After clean() , size : "<<mp.size()<<endl;

    return 0;

}
