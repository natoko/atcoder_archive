#include <bits/stdc++.h>
using namespace std;

int main() {
  int N;
  cin >> N;
  vector<int> p(N);
  for (int i = 0; i < N; i++) cin >> p[i];
  vector<vector<bool>> dp(N + 1,vector<bool>(10001, false));

  dp[0][0] = true;
  for (int i = 0; i < N; i++) {
    for (int j = 0; j <= 10000; j++) {
      // a[i]を選ばない場合
      if (dp[i][j]) dp[i + 1][j] = true;
      // a[i]を選ぶ場合
      if ((j - p[i] >= 0) && (dp[i][j - p[i]])) dp[i + 1][j] = true;
    }
  }

  long long cnt = 0;
  for (int i = 0; i < 10001; i++) {
    if (dp[N][i]) cnt++;
  }
  cout << cnt << endl;
}
