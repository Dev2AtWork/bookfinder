package bookfind.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "src",
        "width",
        "height"
})
@Getter
@Setter
@Builder(toBuilder = true)
public class CseThumbnailDTO {
    @JsonProperty("src")
    public String src;
    @JsonProperty("width")
    public String width;
    @JsonProperty("height")
    public String height;
}
