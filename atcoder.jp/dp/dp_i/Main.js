function Main(input) {
  input = input.split("\n");
  const N = parseInt(input[0], 10);
  const pn = input[1].split(' ').map((n) => {
    return parseFloat(n);
  });
 console.log(dp(N,pn));
}
Main(require("fs").readFileSync("/dev/stdin", "utf8"));

function dp(N,pn) {
  const dp = Array(N).fill(0).map( n =>Array(N+1).fill(0));
  dp[0][0] = pn[0];
  dp[0][1] = (1 - pn[0]);
  for (var i = 0; i < (N - 1); i++) {
    for (var j = 0; j < N; j++) {
      dp[i+1][j] += dp[i][j] * pn[i + 1];
      dp[i+1][j + 1] += dp[i][j] * (1 - pn[i + 1]);
    }
  }
  let key = Math.floor(N/2);
  let ans = 0;
  for (var k = 0; k <= key; k++) {
    ans += dp[N - 1][k];
  }
  return ans;
}
