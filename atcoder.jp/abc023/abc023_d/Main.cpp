#include <bits/stdc++.h>
#include <string>
using namespace std;

int main() {
  int N;
  long long left,right;
  cin >> N;
  left = 0;
  right = 1e18;
  vector<long long>  H(N);
  vector<long long>  S(N);
  vector<long long>  t(N);

  for (int i = 0; i < N; i++) {
    cin >> H.at(i) >> S.at(i);
  }

  long long mid;

  while ((right - left) > 1) {
    bool ok = true;
    mid = (left + (right-left)/2);
    for (int i = 0; i < N; i++) {
      if(mid < H.at(i)) {
        ok = false;
      } else {
        t.at(i) = (mid - H.at(i))/S.at(i);
      }
    }

    sort(t.begin(), t.end());

    for (int i = 0; i < N; i++) {
      if(t.at(i) <i) {
        ok = false;
      }
    }

    if (ok) {
      right = mid;
    } else {
      left = mid;
    }

  }

  cout << right << endl;
}
