function Main(input) {
  input = input.split("\n");
  const island = [];
  const reached = [];
  let Y_max = 0;
  let count = 0;
  while (input[Y_max]) {
    island.push(input[Y_max].split(''));
    count += island[Y_max].filter(word => {return word === 'o'}).length;
    reached.push(Array(island[Y_max].length).fill(0));
    Y_max++;
  }
  const [H,W] = [island.length,Y_max];
  console.log(search(H,W,island,reached,count)?'YES':'NO');
}
Main(require("fs").readFileSync("/dev/stdin", "utf8"));

function search(H,W,island,reached,count) {
  let step = 0;
  let load = 0;
  const stack = [];
  for (var h = 0; h < H; h++) {
    for (var w = 0; w < W; w++) {
      if (island[h][w] === 'o') continue;
      step++;
      load = 0;
      stack.push([h,w]);
      while (stack[0]) {
        const [prey,prex] = stack.pop();
        // 次の候補（4方向）をstackに入れる
        const next = [[prey-1,prex],[prey,prex+1],[prey+1,prex],[prey,prex-1]];
        for (var next_i = 0; next_i < next.length; next_i++) {
          let next_y = next[next_i][0];
          let next_x = next[next_i][1];
          // 迷路の外側か海の場合は何もしない
          if ((next_y<0) || (next_y>=H) || (next_x<0) || (next_x>=W) || island[next_y][next_x] === 'x') continue;
          // 以前に到達していなかったらstackに入れる
          if (reached[next_y][next_x] < step) {
            reached[next_y][next_x]　= step; //到達したよ
            load++;
            stack.push([next_y,next_x]);
          }
        }
      }
      if (load === count) {
        return true;
      }
    }
  }
  return false;
}
