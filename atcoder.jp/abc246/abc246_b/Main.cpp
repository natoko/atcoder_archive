#include <bits/stdc++.h>
#include <string>
using namespace std;

int main() {
  int a,b;
  cin >> a >> b;

  double rad = atan2(a,b);

  cout << sin(rad) << " "<<cos(rad) << endl;
}
