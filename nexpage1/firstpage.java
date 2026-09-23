public void view_account(int view) {

    switch(view){

        case 1:

            System.out.println("Holder details");
            break;

        case 2:

            System.out.println("View Balance");
            break;

        case 3:

            System.out.println("Deposit");
            break;

        case 4:

            System.out.println("Withdrawl");
            break;

        default:
            System.out.println("Exit");
    }
}
public void getpin() {

    System.out.println("Enter your pin: " + pin);
}
public void getview() {
    System.out.println("Enter your pin: " + pin);
}

public static void main(String[] args) {
    System.out.println("Welcome to HDFC Bank ATM Service");
    Scanner sc = new Scanner(System.in);
    ATM_Login b1 = new ATM_Login();
    System.out.println("Enter you ATM pin:");
    String enteredPin = sc.next();
    b1.open_myacc(enteredPin);
    System.out.println("Choose any one option to proceed...1...2...3...4..");
    int countToBuy = sc.nextInt();
    b1.view_account(countToBuy);


    sc.close();



}
}