package lovable_clone.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lovable_clone.enums.MessageRole;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    ChatSession chatSession;

    String content;

    MessageRole role;

    String toolCall;

    Integer tokensUsed;

    @CreationTimestamp
    Instant createdAt;

}
