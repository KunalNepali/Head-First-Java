//chapter 6 java library


import java.util.ArrayList;
public class DottCom{

    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String>loc) 
    {
        locationCells = loc;
    }

    public String checkYourself(String userInput){
        String result = "miss";


        int index = locationCells.indexOf(userInput);
        if(index >= 0)
        {
            locationCells.remove(index);

            if(locationCells.isEmpty()){
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
            }
        }
 