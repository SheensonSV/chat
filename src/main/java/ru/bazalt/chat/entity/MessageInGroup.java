package ru.bazalt.chat.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "group_chat")
public class MessageInGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private LocalDateTime date;
    private String text;

    @OneToMany
    private List<User> usersInGroup;

//    @Column(name = "messages_in_group")
//    @OneToMany
//    private List<Message> messagesInGroup;
}
