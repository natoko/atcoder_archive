function Main(input) {
  input = input.split("\n");
  const N = parseInt(input[0],10);
  const d_i = [];
  let x_kagamimochi_max = 0;
  let x_kagamimochi_before = 0;
  for (var i = 0; i < N; i++) {
     d_i[i] = parseInt(input[i + 1],10);
  }
  d_i.sort((a,b) => {
    return a-b;
  });
  for (var d_i_index = 0; d_i_index < N; d_i_index++) {
    if (d_i[d_i_index] > x_kagamimochi_before) {
      x_kagamimochi_max++;
    }
    x_kagamimochi_before = d_i[d_i_index];
  }
  console.log(x_kagamimochi_max);
}
Main(require("fs").readFileSync("/dev/stdin", "utf8"));
