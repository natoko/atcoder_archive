#include <bits/stdc++.h>
#include <string>
using namespace std;

int main() {
  string S;
  cin >> S;

  long sum = 0;
  int N = S.size();
  for (int bit = 0; bit < (1 << (N-1)); bit++) {
    long sum_work = S[0] - '0';

    for (int i = 0; i < (N-1); i++) {
      if (bit & (1 << i)) {
        sum_work*=10;
        sum_work+=S[i + 1] - '0';
      } else {
        sum+=sum_work;
        sum_work=S[i + 1] - '0';
      }
    }
    sum+=sum_work;
  }

  cout << sum << endl;
}
