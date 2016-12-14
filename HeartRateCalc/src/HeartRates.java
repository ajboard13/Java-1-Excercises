
public class HeartRates {
    
    private String indFirstName;
    private String indLastName;
    private int indBirthDay;
    private int indBirthMonth;
    private int indBirthYear;
    
    public HeartRates (String firstName, String lastName, int birthDay, int birthMonth, int birthYear){
        indFirstName = firstName;
        indLastName = lastName;
        indBirthDay = birthDay;
        indBirthMonth = birthMonth;
        indBirthYear = birthYear;
        
    }
    
    public void setFirstName (String firstName){
        indFirstName = firstName;
    }
    public String getFirstName (){
        return indFirstName;
    }
    public void setLastName (String lastName){
        indLastName = lastName;
    }
    public String getLastName (){
        return indLastName;
    }
    public void setBirthDay (int birthDay){
        indBirthDay = birthDay;
    }
    public int getBirthDay (){
        return indBirthDay;
    }
    public void setBirthMonth (int birthMonth){
        indBirthMonth = birthMonth;
    }
    public int getBirthMonth (){
        return indBirthMonth;
    }
    public void setBirthYear (int birthYear){
        indBirthYear = birthYear;
    }
    public int getBirthYear (){
        return indBirthYear;
    }
    public int calcAge (){
        
        int age;
               
        age = 2016 - indBirthYear;
        if (indBirthMonth > 9)
            age = age - 1;
        if (indBirthMonth == 9)
            if (indBirthDay > 7)
                age = age - 1;
        return age;                
    }   
    public int calcMaxHR (){
        int age;
        int maxHR;
               
        age = 2016 - indBirthYear;
        if (indBirthMonth > 9)
            age = age - 1;
        if (indBirthMonth == 9)
            if (indBirthDay > 7)
                age = age - 1;
        
        maxHR = 220 - age;
        return maxHR;
    }
    public double calcTargetLow (){
        double targetLow;
        int age;
        int maxHR;
               
        age = 2016 - indBirthYear;
        if (indBirthMonth > 9)
            age = age - 1;
        if (indBirthMonth == 9)
            if (indBirthDay > 7)
                age = age - 1;
        
        maxHR = 220 - age;
        
        targetLow = maxHR * .50;
        
        return targetLow;
                
    }
    public double calcTargetHigh (){
        double targetHigh;
        int age;
        int maxHR;
               
        age = 2016 - indBirthYear;
        if (indBirthMonth > 9)
            age = age - 1;
        if (indBirthMonth == 9)
            if (indBirthDay > 7)
                age = age - 1;
        
        maxHR = 220 - age;
        
        targetHigh = maxHR * .85;
        
        return targetHigh;
    }
    
}
