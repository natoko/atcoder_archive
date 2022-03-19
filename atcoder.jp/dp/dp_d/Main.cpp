#include <bits/stdc++.h>
using namespace std;

int main() {
  int N,W;
  cin >> N >> W;
  vector<long long> weight(N),value(N);
  vector<vector<long long>> dp(N + 1,vector<long long>(W + 1,0));
  for (int i = 0; i < N; i++) cin >> weight[i] >> value[i];

  for (int i = 0; i < N; i++) {
    for (int j = 0; j <= W; j++) {
      if (j - weight[i] >= 0) {
        dp[i + 1][j] = max(dp[i][j],dp[i][j - weight[i]] + value[i]);
      } else {
        dp[i + 1][j] = dp[i][j];
      }
    }
  }

  cout << dp[N][W] << endl;
}
