#include <bits/stdc++.h>
using namespace std;

int main()
{
    int arr[5] = {3,1,8,2,4} ;

    sort(arr, arr+5);  // sort has two parameter 1st: starting point , second: ending point :)
                        // starting point maybe start from arr+2,3,4,5..... same rules for ending point :)
    for(int i=0; i<5; i++ )
    {
        cout<<arr[i]<<" ";
    }
}
