#include<iostream>
#include<queue>

using namespace std;

/*
   front--> 7 5 1 3 9 8 <-- push
   pop ---> for delete front element
*/

int main()
{
    queue<int> q;
    q.push(7);
    q.push(5);
    q.push(1);
    q.push(3);
    q.push(9);
    q.push(8);
    cout<<"\ninitial size of queue : "<<q.size()<<"\n\n";

//    cout<<q.front()<<endl;  // only front will be print

    while(!q.empty())     // print all queue element :)
    {
        int x = q.front();
        cout<<x<<" ";
        q.pop();
    }
    cout<<"\nafter poping , size : "<<q.size()<<"\n\n";



}
