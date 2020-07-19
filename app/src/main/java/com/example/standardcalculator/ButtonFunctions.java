package com.example.standardcalculator;

public class ButtonFunctions {
    private double result;
    public ButtonFunctions(){
    }
    public String textviewControl(CharSequence data,String number){
        String string[] = new String[5];
        string[0]= "%";
        string[1]="X";
        string[2]="/";
        string[3]="-";
        string[4]="+";
            if (data.toString().endsWith(string[0])){
                return ""+number;
            }

        return (data+number);
    }
    public String percent(CharSequence number){
        double number1 = Double.parseDouble(number.toString());
   number1= number1/100;
     return ""+number1;
    }
    public String multiply(CharSequence number){
        String[] num= number.toString().split("X",2);
       double number1= Double.parseDouble(num[0]);
       double number2 = Double.parseDouble(num[1]);
       result = number1*number2 ;
       return ""+result;
    }
    public String division(CharSequence number){
        String[] num = number.toString().split("/",2);
        double number1 = Double.parseDouble(num[0]);
        double number2 = Double.parseDouble(num[1]);
        result = number1/number2;
        return  ""+result;
    }
    public String add(CharSequence number) {
        String[] num = number.toString().split("\\+", 2);
        double number1 = Double.parseDouble(num[0]);
        double number2 = Double.parseDouble(num[1]);
        result = number1 + number2;
        return "" + result;
    }
    public String sub(CharSequence number,int counter){
        try {
            String[] num = number.toString().split("-",-2);
            double number1=Double.parseDouble(num[0]);
            double number2= Double.parseDouble(num[1]);
            result = number1-number2;
            return ""+result;
        } catch (NumberFormatException e) {
            if (counter==2){
                try {
                    String[] num = number.toString().split("-",-2);
                    double number1=Double.parseDouble(num[1]);
                    double number2= Double.parseDouble(num[2]);
                    if (number1>number2){
                        result = number1+number2;
                        return "-"+result;
                    }
                    else{
                        result = number1-number2;
                        return ""+result;
                    }
                } catch (NumberFormatException ex) {
                    String[] num = number.toString().split("-",-2);
                    double number1=Double.parseDouble(num[0]);
                    double number2= Double.parseDouble(num[2]);
                    result= number1+number2;
                    return ""+result;
                }

            }
            else if (counter==3){
                String[] num = number.toString().split("-",-3);
                double number1=Double.parseDouble(num[1]);
                double number2= Double.parseDouble(num[3]);
                result = number1-number2;
                if (number1>number2){
                    return "-"+result;
                }
                else{
                    return ""+result;
                }
            }

            }
            return null;
    }

}
