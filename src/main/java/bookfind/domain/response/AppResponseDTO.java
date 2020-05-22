package bookfind.domain.response;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true, chain = true)
public class AppResponseDTO {
    private String name;
    private String author;
    private String link;
}
