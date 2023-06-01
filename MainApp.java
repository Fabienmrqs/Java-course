public class MainApp {
    public static void main(String [] args)
    {
        int ageUtilisateur = 10;
        final int NUMB = 15;
        int result = 5 + 1;


        int exp = 0;
        exp = exp + 10;
        exp += 20;

        System.out.println("Tu as " + ageUtilisateur + " ans");
        System.out.println("Tu as " + exp + " expériences");

        int conditionNumber = 20;
        int option = 2;

        if(conditionNumber == 20 || conditionNumber == 10){
            System.out.println("its equal");
        } else {
            System.out.println("its not equal");
        }

        if(conditionNumber < 10) {
            System.out.println("value < 0");
        } else if (conditionNumber > 100){
            System.out.println("value > 100");
        } else {
            System.out.println(conditionNumber);

        }

        switch (option) {
            case 1:
            System.out.println("option = 1");
            break;

            default:
            System.out.println("option is not = 1");
            break;


        }

    }
}

