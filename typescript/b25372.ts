import * as fs from 'fs';
// const input: string = fs.readFileSync('/dev/stdin').toString();
const input: string = fs
  .readFileSync(process.cwd() + '/typescript/input.txt')
  .toString();

const lines = input.trim().split('\n');

const results: string[] = [];
for (let i = 1; i < lines.length; i++) {
  const len = lines[i]!.length;
  results.push(5 < len && len < 10 ? 'yes' : 'no');
}

console.log(results.join('\n'));
