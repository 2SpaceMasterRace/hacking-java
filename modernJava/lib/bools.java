package modernJava.lib;
boolean challengeOne(){
    boolean a = true;
    boolean b = false;
    boolean c = true;
    boolean d = false;

    boolean result = a || b && c || !d; // (true OR false ) AND (true and true) = true 

    return result;
}

boolean challengeTwo() {
    boolean a = true;
    boolean b = false;
    boolean c = true;
    boolean d = false;

    boolean result = !(a || b && c || !d) || (a && b || c);
    return result;
}

boolean challengeThree() {
    // Change these two variables to test your solution
    boolean hasIceCream = false;
    boolean hasCookie = false;
    /* hasIceCream	hasCookie	validChoice
            true	true	false
            true	false	true
            false	true	true
            false	false	false */
    boolean validChoice = ((hasIceCream) || (hasCookie)) && !(hasCookie && hasIceCream) ;
    return validChoice;
}


void main(){
    boolean result = challengeThree();
    IO.println(result);
    //challengeTwo();
    //challengeThree();
}
