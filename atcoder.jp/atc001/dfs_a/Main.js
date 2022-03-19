function Main(input) {
  input = input.split("\n");
  const changeInt = (n) => {
    return parseInt(n, 10);
  };
  const [H,W] = input[0].split(' ').map(changeInt);
  let s_h,s_w,g_h,g_w;
  const C_hw = [];
  const reached = [];
  const reached_ini = (w) => {
    const reached_ini = [];
    for (var ini_i = 0; ini_i < w; ini_i++) {
      reached_ini.push(false)
    }
    return reached_ini
  }
  for (var c_h = 0; c_h < H; c_h++) {
    C_hw.push(input[c_h+1].split(''));
    reached.push(reached_ini(W));
    if (C_hw[c_h].indexOf('s')>=0) {
      [s_h,s_w] = [c_h,C_hw[c_h].indexOf('s')]
    } else if (C_hw[c_h].indexOf('g')>=0) {
      [g_h,g_w] = [c_h,C_hw[c_h].indexOf('g')]
    }
  }
 function search(y,x) {
   const stack = [];
   stack.push([y,x]);
   while (stack[0]) {
     const [prey,prex] = stack.pop();
     // 次の候補（4方向）をstackに入れる
     const next = [[prey-1,prex],[prey,prex+1],[prey+1,prex],[prey,prex-1]];
     for (var next_i = 0; next_i < next.length; next_i++) {
       let next_y = next[next_i][0];
       let next_x = next[next_i][1];
       // 迷路の外側か壁の場合は何もしない
       if ((next_y<0) || (next_y>=H) || (next_x<0) || (next_x>=W) || C_hw[next_y][next_x] === '#') continue;
       if (C_hw[next_y][next_x] === 'g') return true;
       // 以前に到達していなかったらstackに入れる
       if (!reached[next_y][next_x]) {
         reached[next_y][next_x]　= true; //到達したよ
         stack.push([next_y,next_x]);
       }
     }
   }
   return false;
 }
 console.log(search(s_h,s_w)?'Yes':'No');
}
Main(require("fs").readFileSync("/dev/stdin", "utf8"));
