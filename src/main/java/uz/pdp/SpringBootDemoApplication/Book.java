package uz.pdp.SpringBootDemoApplication;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Book {
    private Long id;
    private String name;
    private String author;

}
