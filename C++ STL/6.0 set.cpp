#include <iostream>
#include <set>
#include <iterator>
using namespace std;
/*
    set return ascending order with no duplicate value
 */
/*
    set<int> s;
    set<int>::iterator  it ;
    s.insert(39);
    s.insert(70);
    s.insert(100);
    s.insert(33);

    for(it=s.begin();it!=s.end();it++)
    {
        cout<<*it<<" ";
    }
 */

int main() {

    set<string> s;
    set<string>::iterator  it ;

    s.insert("Sabbir");
    s.insert("Nazib");
    s.insert("Motiur");
    s.insert("Farhan");

    cout<<"\ninitial size of set : "<<s.size()<<"\n";

    it = s.find("Motiur");
    s.erase(it);

//    duplicate value
//    confirm to know by pair

    pair< set<string>::iterator, bool > p;  // pair has two parameter : iterator and bool
    p = s.insert("Sajia");

    if( p.second == false )
    {
        cout<<"duplicate ! can't insert "<<endl;
    }
    else{
        cout<<"Inserted :)"<<endl;
    }

    //..........print ..........

    for(it=s.begin();it!=s.end();it++)
    {
        cout<<*it<<" ";
    }

    cout<<"\nAfter erase and insert size of set : "<<s.size()<<"\n";


    return 0;
}
