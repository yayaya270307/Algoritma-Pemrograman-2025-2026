package procedure;

import java.io.*;
import java.lang.*;
import java.util.*;

public class procedure6 {
static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }
    
    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }
}