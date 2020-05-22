package bookfind.domain.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "image",
        "name",
        "url",
        "inlanguage",
        "bookformat",
        "awards",
        "isbn",
        "numberofpages"
})
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookDTO {
    @JsonProperty("image")
    public String image;
    @JsonProperty("name")
    public String name;
    @JsonProperty("url")
    public String url;
    @JsonProperty("inlanguage")
    public String inlanguage;
    @JsonProperty("bookformat")
    public String bookformat;
    @JsonProperty("awards")
    public String awards;
    @JsonProperty("isbn")
    public String isbn;
    @JsonProperty("numberofpages")
    public String numberofpages;

}
