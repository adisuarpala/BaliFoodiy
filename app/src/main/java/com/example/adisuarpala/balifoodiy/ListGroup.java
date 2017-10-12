package com.example.adisuarpala.balifoodiy;

import java.util.ArrayList;

/**
 * Created by 404 on 9/24/2017.
 */

public class ListGroup {

    //PROPERTIES OF A SINGLE LIST
    public String Name;
    public String Image;
    public ArrayList<String> players=new ArrayList<String>();
    public ListGroup(String Name)
    {
        this.Name=Name;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return Name;
    }
}
