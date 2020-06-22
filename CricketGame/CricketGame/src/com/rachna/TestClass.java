package com.rachna;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.rachna.Teams.*;


public class TestClass {
    public static void main(String[] args) {

        Teams[] teams=Teams.values();
        for(Teams teams1:teams)
        {
            System.out.println(teams1);
            List<String> l= teams1.getPlayerList();
            for(String name:l)
            {
                System.out.println(name);
            }
        }
    }

}
