package edu.wctc.part4;

public class HrPerson {

    private static final int GOTHIRED = 75;
    private OuputService output = new OuputService();
    private boolean wasHired = false;

    public boolean Interview()
    {

        output.displayOutput("An employee is being interviewed");

        int randomNumber = (int) (1 + (Math.random() * 100));

        if(randomNumber >= GOTHIRED)
        {

            output.displayOutput("YAY they've been hired");
            wasHired = true;
            return wasHired;

        }
        else {

            output.displayOutput("This employee was not hired");
            wasHired = false;
            return wasHired;

        }

    }

}
