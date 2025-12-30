package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B28279_Deque2 {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        var deque = new Deque();
        var sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            switch (line) {
                case "3": {
                    Integer value = deque.pollFirst();
                    sb.append(value == null ? -1 : value).append("\n");
                    break;
                }
                case "4": {
                    Integer value = deque.pollLast();
                    sb.append(value == null ? -1 : value).append("\n");
                    break;
                }
                case "5": {
                    sb.append(deque.size()).append("\n");
                    break;
                }
                case "6": {
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                }
                case "7": {
                    Integer value = deque.peekFirst();
                    sb.append(value == null ? -1 : value).append("\n");
                    break;
                }
                case "8": {
                    Integer value = deque.peekLast();
                    sb.append(value == null ? -1 : value).append("\n");
                    break;
                }
                default: {
                    var st = new StringTokenizer(line);
                    if (st.nextToken().equals("1")) {
                        deque.offerFirst(Integer.parseInt(st.nextToken()));
                    } else {
                        deque.offerLast(Integer.parseInt(st.nextToken()));
                    }
                }
            }
        }
        System.out.println(sb);
    }

    static class Deque {
        Node leftEnd;
        Node rightEnd;
        int size;

        int size() {
            return this.size;
        }

        boolean isEmpty() {
            return this.size == 0;
        }

        Integer pollFirst() {
            if (this.leftEnd == null) return null;

            Node node = this.leftEnd;

            if (node.right == null) {
                this.leftEnd = null;
                this.rightEnd = null;
            } else {
                this.leftEnd = node.right;
                this.leftEnd.left = null;
            }

            this.size -= 1;
            return node.value;
        }

        Integer pollLast() {
            if (this.rightEnd == null) return null;

            Node node = this.rightEnd;

            if (node.left == null) {
                this.leftEnd = null;
                this.rightEnd = null;
            } else {
                this.rightEnd = node.left;
                this.rightEnd.right = null;
            }

            this.size -= 1;
            return node.value;
        }

        Integer peekFirst() {
            return this.leftEnd == null ? null : this.leftEnd.value;
        }

        Integer peekLast() {
            return this.rightEnd == null ? null : this.rightEnd.value;
        }

        void offerFirst(int value) {
            Node node = new Node(null, this.leftEnd, value);

            if (this.rightEnd == null) this.rightEnd = node;
            if (this.leftEnd != null) this.leftEnd.left = node;

            this.leftEnd = node;
            this.size += 1;
        }

        void offerLast(int value) {
            Node node = new Node(this.rightEnd, null, value);

            if (this.leftEnd == null) this.leftEnd = node;
            if (this.rightEnd != null) this.rightEnd.right = node;

            this.rightEnd = node;
            this.size += 1;
        }
    }

    static class Node {
        Node left;
        Node right;
        int value;

        Node(Node left, Node right, int value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }
    }
}
