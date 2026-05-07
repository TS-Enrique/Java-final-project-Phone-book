package phoneStates;

public class TexasPhoneBook extends PhoneBook{

    
        private static final int[] TEXAS_CODES = {
        210, 214, 254, 281, 325, 346, 361, 409, 430,
        432, 469, 512, 621, 682, 713, 726, 737, 806,
        817, 830, 832, 903, 915, 936, 940, 945, 956,
        972, 979};

        public TexasPhoneBook(int areaCode, int remDigits, String name, String job){
        super(areaCode, remDigits, name, job);

    
        }

        @Override
        protected void validateAreaCode(int areaCode) {
        for (int code : TEXAS_CODES) {
            if (areaCode == code)
                return;  // checks if valid
        }
        throw new IllegalArgumentException("Invalid Texas area code");
        }

        @Override
        public void WhereFrom() {

            String info = formatPhoneNumber() + " — " 
                        + getName() + " (" + getJob() + ") ";

            switch (getAreaCode()) {

                case 214: case 469: case 972:
                    System.out.println(info + "lives in Dallas, Texas");
                    break;

                case 713: case 281: case 832:
                    System.out.println(info + "lives in Houston, Texas");
                    break;

                case 512: case 737:
                    System.out.println(info + "lives in Austin, Texas");
                    break;

                case 956:
                    System.out.println(info + "lives in the Rio Grande Valley, Texas");
                    break;

                default:
                    System.out.println(info + "lives somewhere in Texas");
        }
    }
}
