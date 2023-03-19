package Prerequesites;

public class WeightsSampleProblem {
    public static void main(String[] args) {
        double heaviestBottle = 1.1;
        double[] normalWeight = {1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0, heaviestBottle};

        for (int i = 0; i < normalWeight.length; i++) {
            if(heaviestBottle == normalWeight[i]){
                System.out.println("The heaviest bottle is " + normalWeight[i] + " and it is in position " + i);
            }
        }
    }
    }
