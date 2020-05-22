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
        "url"
})
@Getter
@Setter
@Builder
public class PersonDTO {
    @JsonProperty("image")
    public String image;
    @JsonProperty("name")
    public String name;
    @JsonProperty("url")
    public String url;
}
