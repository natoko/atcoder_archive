function Main(input) {
  input = input.split(' ').map( n => parseInt(n, 10) );
  const n = input[0];
  const y = input[1];
  let ans = "-1 -1 -1"
  for (var a_i = 0; a_i <= n; a_i++) {
    for (var b_i = 0; a_i + b_i <= n; b_i++) {
      for (var c_i = 0; a_i + b_i + c_i <= n; c_i++) {
        if ((a_i + b_i + c_i === n) &&
            (10000*a_i + 5000*b_i + 1000*c_i === y)) {
          ans = `${a_i} ${b_i} ${c_i}`;
          break;
        }
      }
    }
  }
  console.log(ans);
}
Main(require("fs").readFileSync("/dev/stdin", "utf8"));