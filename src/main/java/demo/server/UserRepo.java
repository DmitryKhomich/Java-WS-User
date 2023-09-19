package demo.server;

import java.util.HashMap;
import java.util.Map;

public class UserRepo {
    private static Map<String,User> users = new HashMap<>();

    static {
        initUsers();
    }

    private static void initUsers() {

        User dmytro = new User();
        dmytro.setName("Dmytro");
        dmytro.setAge(30);
        dmytro.setPhone("0445678909");
        dmytro.setSex(Sex.MALE);
        users.put(dmytro.getPhone(), dmytro);

        User alina = new User();
        alina.setAge(22);
        alina.setPhone("0568764321");
        alina.setSex(Sex.FEMALE);
        alina.setName("Alina");
        users.put(alina.getPhone(), alina);
    }


    public User findByPhone(String phone) {
        return users.get(phone);
    }
}
