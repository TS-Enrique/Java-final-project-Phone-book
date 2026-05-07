public class OklahomaPhoneBook extends PhoneBook{

    
        private static final int[] OKLAHOMA_CODES = {
            405, 572, 918, 539, 580
        };

        public OklahomaPhoneBook(int areaCode, int remDigits, String name, String job){
        super(areaCode, remDigits, name, job);

    
        }

        @Override
        protected void validateAreaCode(int areaCode) {
        for (int code : OKLAHOMA_CODES) {
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

            case 405: case 572:
            System.out.println(info + "lives in Central Oklahoma");
            break;

            case 918: case 539:
            System.out.println(info + "lives in Northeastern Oklahoma");
            break;

            case 580:
            System.out.println(info + "lives in Western or Southern Oklahoma");
            break;

        }
    }
}
