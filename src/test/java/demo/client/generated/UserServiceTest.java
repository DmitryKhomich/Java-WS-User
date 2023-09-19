package demo.client.generated;
import demo.server.Sex;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    static UserService userService;
    static UserServiceImplService userServiceImpl;

    @BeforeAll
    static void setUp() {
        userServiceImpl = new UserServiceImplService();
        userService = userServiceImpl.getUserServiceImplPort();
    }

    @AfterAll
    static void tearDown() {
        userServiceImpl = null;
        userService = null;
    }

    @Test
    void givenUserService_whenUserIsDmytro_theSexIsMale(){
        assertEquals(Sex.MALE.value(), userService.getUserByPhone("0445678909").getSex().value());
    }

    @Test
    void givenUserService_whenUserIsAlina_theAgeIsNotEqual30(){
        assertNotEquals(30, userService.getUserByPhone("0568764321").getAge());
    }

    @Test
    void givenUserService_whenAllUsers_theNameEqualsDimaAndAlina(){
        assertAll(
                () -> assertEquals("Dmytro", userService.getUserByPhone("0445678909").getName()),
                () -> assertEquals("Alina", userService.getUserByPhone("0568764321").getName())
        );
    }

}