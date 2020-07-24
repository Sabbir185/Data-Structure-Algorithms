#include<iostream>
#include<algorithm>
#include<stack>
using namespace std;


int main()
{
    stack<string> st ;

    st.push("Sabbir");
    st.push("Nazib");
    st.push("Motiur");
    st.push("Farhan");

    cout<<"initial size : "<<st.size()<<endl;

//    cout<<st.top()<<endl;   // top() will not delete after toping .
//    cout<<st.size()<<endl;
//    st.pop();  // pop() will delete the top element from the list .

    while(!st.empty())    // for stack, no need iterator :)
    {
        string k;
        k = st.top();
        cout<<k<<" ";
        st.pop();
    }
    cout<<"\nAfter poping , size : "<<st.size()<<endl;

    return 0;

}
