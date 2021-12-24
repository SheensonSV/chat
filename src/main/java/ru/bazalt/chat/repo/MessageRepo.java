package ru.bazalt.chat.repo;

import ru.bazalt.chat.entity.Message;

public interface MessageRepo {
    Message getMessage(long id);
    void addMessage(Message message);
}
