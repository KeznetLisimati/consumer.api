package dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieConsumerDTO {
    private Long id;
    private String name;
    private String description;
    private String director;
    private String publisher;
    private String datePublished;
    private String movieStatus;
    private String category;
}
