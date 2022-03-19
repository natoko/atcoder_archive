#include <bits/stdc++.h>
using namespace std;

int main() {
  int N;
  cin >> N;
  vector<int> h(N);
  vector<long> dp(N,LONG_MAX);
  for (int i = 0; i < N; i++) cin >> h[i];

  dp[0] = 0;
  for (int i = 1; i < N; i++) {
    if (i == 1) {
      dp[1] = abs(h[1] - h[0]);
      continue;
    }
    dp[i] = min(dp[i - 1] + abs(h[i] - h[i - 1]),dp[i - 2] + abs(h[i] - h[i - 2]));
  }

  cout << dp[N - 1] << endl;
}
