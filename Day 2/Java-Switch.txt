public class SwitchExample {    
public static void main(String[] args) {    
    int month=7;    
    String monthStr="";  
    switch(month){    
    case 1: monthStr="1 - January";  
    break;    
    case 2: monthStr="2 - February";  
    break;    
    case 3: monthStr="3 - March";  
    break;    
    case 4: monthStr="4 - April";  
    break;    
    case 5: monthStr="5 - May";  
    break;    
    case 6: monthStr="6 - June";  
    break;    
    case 7: monthStr="7 - July";  
    break;    
    case 8: monthStr="8 - August";  
    break;    
    case 9: monthStr="9 - September";  
    break;    
    case 10: monthStr="10 - October";  
    break;    
    case 11: monthStr="11 - November";  
    break;    
    case 12: monthStr="12 - December";  
    break;    
    default:System.out.println("Invalid Month!");    
    }    
    //Printing month of the given number  
    System.out.println(monthStr);  
}    
}   
