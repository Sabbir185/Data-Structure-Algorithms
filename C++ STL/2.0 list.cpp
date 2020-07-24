#include<iostream>
#include<algorithm>
#include<list>
#include<iterator>
using namespace std;

/*
void comment()
{
    list<int>lt;  // we can write list<int> lt(4,2...etc value); // it creates 4 list with value 2
    list<int>::iterator it;

    lt.push_back(12);
    lt.push_back(3);
    lt.push_front(5);
    lt.push_front(2);
    lt.push_back(-7);

    for(it=lt.begin();it!=lt.end();it++)
    {
        cout<<*it<<" ";
    }
    cout<<"\nReverse list : "<<endl;

    lt.reverse();  // for reverse list

    for(it=lt.begin();it!=lt.end();it++)
    {
        cout<<*it<<" ";
    }

    cout<<"\nsize : "<<lt.size()<<endl;

    lt.clear();

    cout<<"Clear and size : "<<lt.size()<<endl;
}
*/

int main()
{
    int arr[5] = {4,2,6,1,8};   // copy array into list :)

    list<int> lt(arr,arr+5) ;  // array begin to array size ( arr, arr+5 ) :)
    list<int>::iterator it ;
    cout<<"My list : "<<endl;
    for(it=lt.begin();it!=lt.end();it++)
    {
        cout<<*it<<" ";
    }
    cout<<"\nSize : "<<lt.size()<<endl;

     //..............Insert Part.........................

    cout<<"\nmodified list : "<<endl;

//    it = lt.begin();          // I want to add a value into index 1 , before value of 2 :)
//    it++ ;
//
//    lt.insert(it,5);         // first iterator,then value what I want to add


    it = find( lt.begin(),lt.end(), 2 ) ;   // find() is better approach than above approach :)
    lt.insert(it,5);


    for(it=lt.begin();it!=lt.end();it++)
    {
        cout<<*it<<" ";
    }

    cout<<"\nSize : "<<lt.size()<<"\n\n";

    //..............Erase Part.........................

    it = find(lt.begin(),lt.end(), 1 );
    lt.erase(it) ;   // remove value 1 :)

    for(it=lt.begin();it!=lt.end();it++)
    {
        cout<<*it<<" ";
    }

    cout<<"\nAfter erase 1 , Size : "<<lt.size()<<"\n\n";

    //..............pop front & back.........................

    lt.pop_front();  // remove front value
    lt.pop_back();   // remove back value

    for(it=lt.begin();it!=lt.end();it++)
    {
        cout<<*it<<" ";
    }

    cout<<"\nAfter poping , Size : "<<lt.size()<<endl;


    return 0;

}
