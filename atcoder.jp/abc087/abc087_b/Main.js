function Main(input) {
  input = input.split("\n");
  const a = parseInt(input[0],10);
  const b = parseInt(input[1],10);
  const c = parseInt(input[2],10);
  const x = parseInt(input[3],10);
  let ans = 0;
  for (var a_i = 0; a_i < a + 1; a_i++) {
    for (var b_i = 0; b_i < b + 1; b_i++) {
      for (var c_i = 0; c_i < c + 1; c_i++) {
        if (x === (500*a_i + 100 * b_i + 50*c_i)) {
          ans++;
        }
      }
    }
  }
  console.log(ans);
}
Main(require("fs").readFileSync("/dev/stdin", "utf8"));