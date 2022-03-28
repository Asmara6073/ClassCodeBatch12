package com.syntax.class22;

public class PrivateOverload {


    private void chooseGradProgram(boolean fullScholarshipMD, boolean fullScolarshipJohnsHopkins){
        if(fullScholarshipMD&&!fullScolarshipJohnsHopkins){
            System.out.println("Bethann is going UMD");
        }else if(fullScolarshipJohnsHopkins&&fullScholarshipMD){
            System.out.println("Bethann is going to John's Hopkins");
        }else if(!fullScholarshipMD&&fullScolarshipJohnsHopkins){
            System.out.println("Bethann is going to John's Hopkins");
        }else{
            System.out.println("Bethann is staying at Share our Strength");
        }
    }

    private String chooseGradProgram(boolean getNewCar){
        String bethannDecision="";
        if(getNewCar){
            bethannDecision="I am going to John's Hopkins";
        }else{
            bethannDecision="I ma going to UMD";
        }return bethannDecision;
    }


    private String chooseGradProgram( boolean partTime, double scholarshipUMD, double scholarshipJH){
        String bethannDecsion="";
        if(partTime){
            if(scholarshipUMD>=20000&& scholarshipJH<10000){
                bethannDecsion="I am going to UMD";
            }else if(scholarshipJH>10000){
                bethannDecsion="I am going to John's Hopkins";
            }else{
                bethannDecsion="I am staying at Share our Strength";
            }
        }else{
            bethannDecsion="I am staying at Share our Strength";
        }return bethannDecsion;
    }

    public static void main(String[] args) {
        PrivateOverload bethann=new PrivateOverload();
        bethann.chooseGradProgram(true, true);
        System.out.println(bethann.chooseGradProgram(true));
        System.out.println(bethann.chooseGradProgram(true,19000,6000));
    }

}
