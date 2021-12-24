package ru.bazalt.chat.repo;

import ru.bazalt.chat.entity.User;

public interface UserRepo{
    User getUser(int id);
    void addUser(User user);
}
