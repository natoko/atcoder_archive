function Main(input) {
  input = input.split("\n");
  const N = parseInt(input[0],10);
  const AN = input[1].split(' ').map((n) => {
    return parseInt(n,10);
  });
  let ans = 0;
  for (var i = 0; i < N; i++) {
    for (var j = 0; j < N; j++) {
      if (i === j) continue;
      let sub = Math.abs(AN[i] - AN[j]);
      ans = Math.max(ans,sub);
    }
  }
  console.log(ans);
}
Main(require("fs").readFileSync("/dev/stdin", "utf8"));
