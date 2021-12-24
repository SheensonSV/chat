package ru.bazalt.chat.repo;

import ru.bazalt.chat.entity.Message;
import ru.bazalt.chat.entity.User;

import java.util.List;

public interface MessageInGroupRepo {
    List<Message> getAllMessages();
    List<User> getAllUsersInChat();
}
