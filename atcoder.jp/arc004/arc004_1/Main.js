function Main(input) {
  input = input.split("\n");
  const changeInt = ((n) => {
    return parseInt(n,10);
  });
  const N = parseInt(input[0],10);
  const xy = [];
  for (var n = 0; n < N; n++) {
    xy.push(input[n + 1].split(' ').map(changeInt));
  }
  let ans = 0;
  for (var i = 0; i < N; i++) {
    for (var j = 0; j < N; j++) {
      if (i === j) continue;
      let dis = Math.sqrt(Math.abs(xy[i][0] - xy[j][0])**2 + Math.abs(xy[i][1] - xy[j][1])**2);
      ans = Math.max(ans,dis);
    }
  }
  console.log(ans);
}
Main(require("fs").readFileSync("/dev/stdin", "utf8"));
