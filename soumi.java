
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author ANUPRIYA BISWAS
 */
public class Learnjava{
    boolean WeekdayVacation(boolean weekday,boolean vacation){
        if(weekday==true && vacation==true){
           
            System.out.println("we are on vacation"); 
            return true;
        }
        else{
            System.out.println("we are not on vacation");
            return false;
        }
    }
    public static void main(String[]args){
        Learnjava a=new Learnjava();
        a.WeekdayVacation(true,false);
        a.WeekdayVacation(true, true);
        
    }
