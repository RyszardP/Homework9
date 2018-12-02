public class Validator {
    private static final int MAX_AGE = 100;
    private static final int MIN_AGE = 18;
    private static final int MAX_NAME_LENGTH = 25;
    private static final int MAX_LAST_NAME_LENGTH = 25;
    private static final int MIN_NAME_LENGTH = 2;
    private static final int MIN_LAST_NAME_LENGTH = 2;
    private static final int MAX_HEIGHT = 220;
    private boolean flag;

    public boolean getFlag() {
        return flag;
    }

    public void validatorRun(User user) throws Exception {
        try {
            if (user.getUserAge() > MAX_AGE) {
                throw new Exception("Максимальный возраст");
            }
            if (user.getUserAge() < MIN_AGE) {
                throw new Exception("Минмальный возраст ");
            }
            if (user.getUserHeight() > MAX_HEIGHT) {
                throw new Exception("Максимальный рост");
            }
            if (user.getUserName().length() > MAX_NAME_LENGTH) {
                throw new Exception("Максимальная длина имени");
            }
            if (user.getUserLastName().length() > MAX_LAST_NAME_LENGTH) {
                throw new Exception("Максимальная длина фамилии");
            }
            if (user.getUserName().length() < MIN_NAME_LENGTH) {
                throw new Exception("Минимальная длина имени");
            }
            if (user.getUserLastName().length() < MIN_LAST_NAME_LENGTH) {
                throw new Exception("Минимальная длина имени");
            }
            flag = false;
        } catch (Exception e) {
            flag = true;
            System.out.println(" Ошибка !  " + e.getMessage());
        }
    }
}