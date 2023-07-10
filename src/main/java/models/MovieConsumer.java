package models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MovieConsumer {
    private Long id;
    private String name;
    private String description;
    private String director;
    private String publisher;
    private String datePublished;
    private String movieStatus;
    private String category;
}
