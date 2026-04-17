void challengeOne(){
    String mascot = "The Noid";
    IO.println(mascot);
    mascot = "Pizza the Hut";
    IO.println(mascot);
    mascot = "Little Caesar";
    IO.println(mascot);
}

void challengeTwo() {
    String fruit;
    fruit = "apple";

    IO.println(fruit);

    final String vegetable = "carrot";

    IO.println(fruit);
    IO.println(vegetable);

    fruit = "orange";
    //vegetable = "celery";

    IO.println(fruit);
    IO.println(vegetable);
}

void challengeThree() {
    String a = "A";
    String b = "B";

    IO.println("Initial a and b:");
    IO.println(a);
    IO.println(b);

    b = a; // b: A
    IO.println("b = a");
    IO.println(b);

    a = b; // a: B
    IO.println("a = b");
    IO.println(a);

    b = a; // b: B
    IO.println("b = a");
    IO.println(b);

    a = b; // a: A
    IO.println("a = b");
    IO.println(a);

    IO.println("Final a and b:");
    IO.println(a);
    IO.println(b);
}

void challengeFour(){
    // Final Output:
    // B
    // A
    String a = "A";
    String b = "B";
    // Don't touch above this

    // You can add code here
    var c = a; // c = A
    a = b; // a = B
    b = c; // b = A

    // Don't touch below this
    IO.println(a);
    IO.println(b);
}

void challengeFive(){
    String apple = "red";
    String clownCar = "polka dot";
    String seriousCar = "black";
    String fastRunner = "bolt";
    String slowRunner = "tortoise";
}


void main(){
    //challengeOne();
    //challengeTwo();
    //challengeThree();
    challengeFour();
}