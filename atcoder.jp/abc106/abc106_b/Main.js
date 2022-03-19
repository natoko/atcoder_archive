function Main(input) {
  input = input.split("\n");
  const N = parseInt(input[0],10);
  let ans = 0;
  for (var n = 0; n <= N; n++) {
    if (n % 2 === 0) continue;
    let count = 0;
    for (var i = 1; i <= n; i++) {
      if (n % i === 0) {
        count++;
      }
    }
    if (count === 8) {
      ans++;
    }
  }
  console.log(ans);
}
Main(require("fs").readFileSync("/dev/stdin", "utf8"));
