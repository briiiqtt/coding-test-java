import * as fs from 'fs';
// const input: string = fs.readFileSync('/dev/stdin').toString();
const input: string = fs.readFileSync('./input.txt').toString();

let sum: number = 0;
input.split(' ').map(el => sum += parseInt(el));

console.log(sum);