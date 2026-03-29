import * as fs from 'fs';
// const input: string = fs.readFileSync('/dev/stdin').toString();
const input: string = fs
  .readFileSync(process.cwd() + '/typescript/input.txt')
  .toString();
const lines: string[] = input.split('\n');


const str1: string = lines[0]!.trim();
const str2: string = lines[1]!.trim();

const count1 = new Int32Array(26);
const count2 = new Int32Array(26);

const a = 'a'.charCodeAt(0);

for (let i = 0; i < str1.length; i++) {
  const charCode = str1.charCodeAt(i) - a;
  count1[charCode]!++;
}

for (let i = 0; i < str2.length; i++) {
  const charCode = str2.charCodeAt(i) - a;
  count2[charCode]!++;
}

let cnt: number = 0;

for (let i = 0; i < 26; i++) {
  cnt += Math.abs(count1[i]! - count2[i]!);
}

console.log(cnt);
