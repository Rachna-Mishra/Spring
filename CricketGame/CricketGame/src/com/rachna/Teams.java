package com.rachna;

import java.util.Arrays;
import java.util.List;

public enum Teams {

    CSK(Arrays.asList("DHONI", "RAINA", "VIJAY", "MONU", "JADEJA")),
    KKR(Arrays.asList("DINESH", "ROBIN", "LYNN", "SUNIL", "PIYUSH")),
    MI(Arrays.asList("ROHIT", "SURYA", "RAHUL", "ADITYA", "ADAM")),
    RBC(Arrays.asList("VIRAT", "PARTHIV", "UMESH", "PAWAN", "SIRAJ"));

    private  List<String > playerList;
    private Teams(List<String> playerList)
    {
        this.playerList=playerList;
    }
    public List<String> getPlayerList()
    {
        return this.playerList;
    }

}
