package ru.bazalt.chat.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private LocalDateTime date;
    private String text;

    @OneToOne
    @JoinColumn(name = "user_source")
    private User UserSrc;

    @OneToOne
    @JoinColumn(name = "user_destination")
    private User UserDst;


}
