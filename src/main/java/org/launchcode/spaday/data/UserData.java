package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.HashMap;
import java.util.Map;

public class UserData {
    private Map roster = new HashMap<Integer, User>();

    public void add(User user) {
        roster.put(user.getId(), user);
    }
}
