#include <bits/stdc++.h>
using namespace std;

int main() {
  int N,K;
  cin >> N>> K;
  vector<int> h(N);
  vector<long> dp(N,LONG_MAX);
  for (int i = 0; i < N; i++) cin >> h[i];

  dp[0] = 0;
  int jump = min(K,N);
  for (int i = 1; i < N; i++) {
    for (int j = 1; j <= jump; j++) {
      if (j > i) {
        continue;
      }
      dp[i] = min(dp[i],dp[i - j] + abs(h[i] - h[i - j]));
    }
  }

  cout << dp[N - 1] << endl;
}
