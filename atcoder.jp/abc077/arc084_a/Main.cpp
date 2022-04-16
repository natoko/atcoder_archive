#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int N;
    long long ans = 0;
    cin >> N;
    vector<long long> a(N), b(N), c(N);
    for (int i = 0; i < N; ++i) cin >> a[i];
    for (int i = 0; i < N; ++i) cin >> b[i];
    for (int i = 0; i < N; ++i) cin >> c[i];

    sort(a.begin(), a.end());
    sort(b.begin(), b.end());
    sort(c.begin(), c.end());

    for (int i = 0; i < N; i++) {
      long long ab = lower_bound(a.begin(), a.end(), b[i]) - a.begin();
      long long bc = N - (upper_bound(c.begin(), c.end(), b[i]) - c.begin());
      ans += ab*bc;
    }
    cout << ans << endl;
}
