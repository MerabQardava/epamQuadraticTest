package com.epam.rd.autotasks;

public class QuadraticEquation {
    public String solve(double a, double b, double c) {
        if(a==0){
            throw new IllegalArgumentException();
        }

        String answer="";

        double disc=b*b-(4*(a*c));
        System.out.println(disc);
        if(disc>0){
            answer+=(-b+ Math.sqrt(disc))/(2*a);
            answer+=" "+(-b-Math.sqrt(disc))/(2*a);
        }else if(disc==0){
            answer+=(-b)/(2*a);
        }else if(disc<0){
            return "no roots";
        }




        return answer;
    }

}