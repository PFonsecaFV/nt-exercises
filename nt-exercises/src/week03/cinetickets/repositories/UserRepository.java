
package week03.cinetickets.repositories;

import week03.cinetickets.models.UserModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface UserRepository {
    List<UserModel> usersList = new ArrayList();

    static void userRegister(String name, String role, int age, String userName, String password) {
        UserModel newUser = new UserModel(name, role, age, userName, password);
        usersList.add(newUser);
        Iterator var6 = usersList.iterator();

        while (var6.hasNext()) {
            UserModel users = (UserModel) var6.next();
            System.out.println(users);
        }

    }

    static boolean userLogin(String userName, String password) {
        Iterator var2 = usersList.iterator();

        UserModel user;
        do {
            if (!var2.hasNext()) {
                return false;
            }

            user = (UserModel) var2.next();
        } while (!user.getUserName().equals(userName) || !user.getPassword().equals(password));

        return true;
    }

    static boolean isEmployee(String userName) {
        Iterator var1 = usersList.iterator();

        String name;
        String role;
        do {
            if (!var1.hasNext()) {
                return false;
            }

            UserModel user = (UserModel) var1.next();
            name = user.getUserName();
            role = user.getRole();
        } while (!name.equals(userName) || !role.equals("FUNCIONÁRIO"));

        return true;
    }

    static boolean isClient(String userName) {
        Iterator var1 = usersList.iterator();

        String name;
        String role;
        do {
            if (!var1.hasNext()) {
                return false;
            }

            UserModel user = (UserModel) var1.next();
            name = user.getUserName();
            role = user.getRole();
        } while (!name.equals(userName) || !role.equals("CLIENTE"));

        return true;
    }
}