package phoneStates;

public class LouisianaPhoneBook extends PhoneBook{

    
        private static final int[] LOUISIANA_CODES = {
            225, 318, 337, 504, 985
        };

        public LouisianaPhoneBook(int areaCode, int remDigits, String name, String job){
        super(areaCode, remDigits, name, job);

    
        }

        @Override
        protected void validateAreaCode(int areaCode) {
        for (int code : LOUISIANA_CODES) {
            if (areaCode == code)
                return;  // checks if valid
        }
        throw new IllegalArgumentException("Invalid Louisiana area code");
        }

        @Override
        public void WhereFrom() {

            String info = formatPhoneNumber() + " — " 
                        + getName() + " (" + getJob() + ") ";

            switch (getAreaCode()) {

            case 225:
                System.out.println(info + "lives in the Baton Rouge area of Louisiana");
                break;

            case 318:
                System.out.println(info + "lives in Northern Louisiana");
                break;

            case 337:
                System.out.println(info + "lives in Southwestern Louisiana");
                break;

            case 504:
                System.out.println(info + "lives in New Orleans, Louisiana");
                break;

            case 985:
                System.out.println(info + "lives in Southeastern Louisiana");
                break;
        }
    }
}
