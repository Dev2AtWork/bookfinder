package bookfind.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

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
@Builder(toBuilder = true)
@Getter
@Setter
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
