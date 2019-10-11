package com.example.c;

import com.example.b.B;

public class C {

    public static void main(String[] args) {
        System.out.println("This is C.class");

        B.main(null);

//        1)    A.main(null);
//              транзитивно C не имеет доступ к A

//        2)    C имеет доступ к B
//              B не имеет доступ к С
//
//        A \           B   B
//        ^  \          ^   v
//    1)  B   x     2)  ^   x
//        ^  /          ^   x
//        C /           C   C
//
    }
}
