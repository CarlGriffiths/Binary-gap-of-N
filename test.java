/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author carl
 */
public class test {

    public static void main(String[] args) {
        int N = 77;
        String b = Integer.toBinaryString(N);
        System.out.println(b);
        int pos = 0;
        int count = 0;
        int max = count;
        while (pos < b.length()) {
            if (b.charAt(pos) == '1' && b.charAt(pos + 1) == '0') {
                pos++;
                while (pos < b.length() || false) {
                    if (b.charAt(pos) == '0') {
                        count++;
                        pos++;
                    } else {
                        pos++;
                        if (count > max) {
                            max = count;

                        }
                        count = 0;
                        boolean check = false;
                    }

                }
            } else {
                break;
            }
            pos++;
        }

        System.out.println(max);
    }
}
