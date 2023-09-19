package demo.server;

import jakarta.jws.WebService;

@WebService(endpointInterface = "demo.server.UserService")
public class UserServiceImpl implements UserService{

    private final UserRepo repo = new UserRepo();
    @Override
    public User getUserByPhone(String phone) {
        return repo.findByPhone(phone);
    }
}
