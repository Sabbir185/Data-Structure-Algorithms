#include<iostream>
#include<utility> // for pair --> utility
#include<vector>
#include<iterator>
using namespace std;
/*
    index   --> int  -->  string
     0          185       Sabbir
     1          184       ferhan
     2          186       Istiak
     3          195       Nazib
     4          191       Sajia
 */
/*
    pair<int , string> p(185,"Sabbir");
    p.first=185;
    p.second="Sabbir";
*/

int main()
{
    vector< pair<int , string> > vec; // by using pair we can push_back into vector both int & string :)
    vector< pair<int , string> >::iterator it;

    vec.push_back(make_pair(185,"Sabbir"));
    vec.push_back(make_pair(184,"Ferhan"));
    vec.push_back(make_pair(186,"Istiak"));
    vec.push_back(make_pair(195,"Nazib"));
    vec.push_back(make_pair(191,"Sajia"));

   // vec.pop_back();

    for(it=vec.begin();it!=vec.end();it++)
    {
        cout<<it->first<<" "<<it->second<<endl;
    }

}