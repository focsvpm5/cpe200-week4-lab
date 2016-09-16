package cpe200;

import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList;
    public Users(){
        userList = new ArrayList<User>();
    }
    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        User user = new User();
        user.setPassword(password);
        user.setUserName(userName);
        userList.add(user);
    }

    public void deleteUser(User user)
    {
        userList.remove(user);
    }

    public boolean exists(User user)
    {
        if(userList.contains(user)) return true;
        else return false;
    }

    public boolean usernameExists(String username) {
        for (User findUser : userList) {
            if (findUser.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {
        for (User findUser : userList) {
            if (findUser.getUserName().equals(userName)) {
                return findUser;
            }
        }
        return null;
    }

    public int count()
    {
        return userList.size();
    }

    public User[] getUserArray()
    {
        User[] usertoArray = new User[userList.size()];
        usertoArray = userList.toArray(usertoArray);
        return usertoArray;
    }
}
