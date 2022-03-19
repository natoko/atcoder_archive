#include <bits/stdc++.h>
using namespace std;

long long cnt = 0;

// target 調べる数
// flg 753の生むフラグ
// cnt = 753数の合計
void count(long long N,long long target,int flg,long long &cnt = cnt) {
// ベースケース
if (target > N) {
  return;
}
if (flg == 0b111) {
  cnt++;
}
count(N,target * 10 + 3,flg | 0b100,cnt);
count(N,target * 10 + 5,flg | 0b010,cnt);
count(N,target * 10 + 7,flg | 0b001,cnt);

}

int main() {
  long long N;
  cin >> N;

  count(N,0,0,cnt);
  cout << cnt << endl;
}
