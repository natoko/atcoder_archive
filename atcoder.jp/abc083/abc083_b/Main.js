function Main(input) {
  input = input.split(" ");
  const n = parseInt(input[0],10);
  const a = parseInt(input[1],10);
  const b = parseInt(input[2],10);
  let ans = 0;
  let end = 0;
  for (var n_i = 0; n_i <= n; n_i++) {
    let n_i_sum = intsum(n_i);
    if ((n_i_sum >= a) && (n_i_sum <= b)) {
      ans += n_i;
    }
  }
  console.log(ans);
}

function intsum(n) {
  if (n <= 0) {
    return n;
  }
  return (n % 10) + intsum(Math.floor(n/10));
}

Main(require("fs").readFileSync("/dev/stdin", "utf8"));
