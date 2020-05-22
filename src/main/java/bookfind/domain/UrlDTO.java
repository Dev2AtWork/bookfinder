package bookfind.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "template"
})
@Getter
@Setter
@Builder(toBuilder = true)
public class UrlDTO {
    @JsonProperty("type")
    public String type;
    @JsonProperty("template")
    public String template;
}
