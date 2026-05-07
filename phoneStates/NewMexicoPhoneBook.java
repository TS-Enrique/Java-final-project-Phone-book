package phoneStates;

public class NewMexicoPhoneBook extends PhoneBook{

    
        private static final int[] NEWMEXICO_CODES = {
            505, 575
        };

        public NewMexicoPhoneBook(int areaCode, int remDigits, String name, String job){
        super(areaCode, remDigits, name, job);

    
        }

        @Override
        protected void validateAreaCode(int areaCode) {
        for (int code : NEWMEXICO_CODES) {
            if (areaCode == code)
                return;  // checks if valid
        }
        throw new IllegalArgumentException("Invalid New Mexico area code");
        }

        @Override
        public void WhereFrom() {

            String info = formatPhoneNumber() + " — " 
                        + getName() + " (" + getJob() + ") ";

            switch (getAreaCode()) {

            case 505:
                System.out.println(info + "lives in Northern or Central New Mexico");
                break;

            case 575:
                System.out.println(info + "lives in Southern or Eastern New Mexico");
                break;

        }
    }
}
