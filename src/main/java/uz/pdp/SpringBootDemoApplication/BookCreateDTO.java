package uz.pdp.SpringBootDemoApplication;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class BookCreateDTO {
    private String name;
    private String author;
}
