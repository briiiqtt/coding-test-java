import * as fs from 'fs';
// const input: string = fs.readFileSync('/dev/stdin').toString();
const input: string = fs
  .readFileSync(process.cwd() + '/typescript/input.txt')
  .toString();