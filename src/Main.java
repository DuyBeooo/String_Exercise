/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Cho chuỗi "A9 A1 A88 A2 A88 A1"
 * a/ Sắp xếp chuỗi thành "A1 A2 A88 A9..."
 * b/ Đảo thành "A9 A88 A2 A1..."
 * c/ Tìm từ dài nhất A88
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    static String tolString(String[] a) {
        String s = a[0].trim();
        for (int i = 1; i < a.length; i++) {
            s += " " + a[i].trim();

        }
        return s;
    }

    static void reverse(String[] a) {
        int i, j, n;
        String x;
        n = a.length;
        i = 0;
        j = n - 1;
        while (i < j) {
            x = a[i];
            a[i] = a[j];
            a[j] = x;
            i++;
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) {
        String s = "A9 A1 A88 A2 A88 A1";
        String[] a = s.split("[ ]+");
        Arrays.sort(a);
        String u = tolString(a);
        System.out.println(s);
        System.out.println(u);
        reverse(a);
	// hello Duyyyyyyy
	// hahahah
	wqewqeq;
	jghjghjg;

    }

}
