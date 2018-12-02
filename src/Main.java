public class Main {
    public void usersList() throws Exception {

        User[] users = new User[10];
        users[0] = new User("Yun", "VU", 17, 160);
        users[1] = new User("O", "Pa", 18, 220);
        users[2] = new User("Matiliudavsiavicianiauskadamas", "Jonas", 18, 219);
        users[3] = new User("Petr", "Cerazaborimostnoguzaderisenko", 70, 156);
        users[4] = new User("Aleh", "Ivanou", 35, 221);
        users[5] = new User("Jury", "Pyatrou", 102, 176);
        users[6] = new User("Vladimir", "Piutin", 54, 170);
        users[7] = new User("Mister", "Po", 58, 180);
        users[8] = new User("Dima", "Medved", 36, 179);
        users[9] = new User("Kolya", "Sidorov", 39, 189);

        Validator validator = new Validator();
        for (int i = 0; i < 10 ; i++) {

            validator.validatorRun(users[i]);
            if (validator.getFlag() == false) {
                System.out.println(users[i].toString());
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        Validator validator = new Validator();
        main.usersList();
}
    }

