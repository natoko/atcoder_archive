#include <bits/stdc++.h>
using namespace std;

int main() {
  int K,S;
  cin >> K >> S;

  int cnt = 0;
  for (int x = 0; x <= min(K,S); x++) {
    for (int y = 0; y <= min(K,S); y++) {
      if (((S - (x+y)) <= K) && (S >= (x + y))) {
        cnt++;
      }
    }
  }

  cout << cnt << endl;
}
