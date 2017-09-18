package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by shanaka on 9/18/17.
 */
public class Beackon_Array {

    private ArrayList<Beacon> beacons = new ArrayList<Beacon>();

    public void Add_Beackon(Beacon beacon)
    {
        beacons.add(beacon);
    }

    public void Sort_Array()
    {
        int min =0;
        int min_index = 0;
        Beacon temp_b;
        for (int i = 0;i<beacons.size()-1;i++)
        {
            min = beacons.get(i).getDistance();
            min_index = i;
            for(int j = i+1;j<beacons.size();j++)
            {
                if(beacons.get(j).getDistance()<min)
                {
                    min = beacons.get(j).getDistance();
                    min_index = j;
                }
            }
            temp_b = beacons.get(min_index);
            beacons.set(min_index,beacons.get(i));
            beacons.set(i,temp_b);
        }
    }

    public void printB()
    {
        for (Beacon b:
                beacons
             ) {
            System.out.println(b.distance + "     ID: "+ b.getID());
        }
    }
}
