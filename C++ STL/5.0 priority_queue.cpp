#include <iostream>
#include <queue>
using namespace std;

// priority_queue give output in descending order , :)
/*
void numberPrint()
{
    priority_queue<int> pq;
    pq.push(380);
    pq.push(400);
    pq.push(150);
    pq.push(50);

    while(!pq.empty())
    {
        int x = pq.top();  // for queue we use front() function to pick up front value :)
        cout<<x<<" ";
        pq.pop();
    }
}
*/

int main() {

    priority_queue<string> p;
    p.push("Sabbir");
    p.push("Nazib");
    p.push("Motiur");
    p.push("Farhan");

    while(!p.empty())
    {
       // string x = p.top();
        cout<<p.top()<<" ";
        p.pop();
    }


    return 0;
}
