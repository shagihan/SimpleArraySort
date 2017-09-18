package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Beackon_Array ba = new Beackon_Array();
        ba.Add_Beackon(new Beacon(112,1));
        ba.Add_Beackon(new Beacon(71,2));
        ba.Add_Beackon(new Beacon(9,3));
        ba.Add_Beackon(new Beacon(14,4));
        ba.Add_Beackon(new Beacon(23,5));
        ba.Add_Beackon(new Beacon(15,6));
        ba.Sort_Array();
        ba.printB();

    }


}
