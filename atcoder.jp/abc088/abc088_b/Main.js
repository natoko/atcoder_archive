function Main(input) {
  input = input.split("\n");
  const N = parseInt(input[0],10);
  const a_i = input[1].split(' ');
  let a_sum = 0;
  let b_sum = 0;
  for (var i = 0; i < a_i.length; i++) {
     a_i[i] = parseInt(a_i[i],10); 
  }
  a_i.sort((a,b) => {
    return b-a;
  });
  for (var a_i_index = 0; a_i_index < a_i.length; a_i_index++) {
    if (a_i_index % 2 === 0) {
      a_sum += a_i[a_i_index];
    } else {
      b_sum += a_i[a_i_index];
    }
  }
  console.log(a_sum - b_sum);
}
Main(require("fs").readFileSync("/dev/stdin", "utf8"));
