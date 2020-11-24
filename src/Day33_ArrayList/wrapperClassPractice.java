package Day33_ArrayList;

public class wrapperClassPractice {

    public static void main(String[] args) {
        String str = "a1b2c3";  // 1=49, 2=50, 3=51 in char
        int sum = 0;

        for(char each : str.toCharArray() ){
            if(Character.isDigit(each)){  // verify if each char in string is a digit
                sum+= Integer.valueOf(""+each); // each digits need to be converted to integer
            }
        }
        System.out.println("sum = " + sum);

        System.out.println("================================================");
        String password = "Password#7";
        String upperLetters = "";
        String lowerLetters = "";
        String digits = "";
        String specialChar = "";
        
        for(char each : password.toCharArray()){
            if(Character.isUpperCase(each)){  // verify if the character is upper case
                upperLetters += each;
                
            }else if(Character.isLowerCase(each)){ // verify if char is lower case
                lowerLetters += each;
                
            }else if(Character.isDigit(each)){ // verify if char is digit
                digits += each;
            }else{ // speial character
                specialChar += each;
            }
        }
        System.out.println("upperLetters = " + upperLetters);
        System.out.println("lowerLetters = " + lowerLetters);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);
        
        boolean isValid = password.length() >= 8 && upperLetters.length()>0 && 
                digits.length() >0 && specialChar.length()>0;
        System.out.println("isValid = " + isValid);
    }
}
