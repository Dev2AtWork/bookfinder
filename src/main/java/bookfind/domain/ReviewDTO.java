package bookfind.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ratingstars",
        "ratingcount",
        "image_url",
        "url"
})
@Getter
@Setter
@Builder(toBuilder = true)
public class ReviewDTO {
    @JsonProperty("ratingstars")
    public String ratingstars;
    @JsonProperty("ratingcount")
    public String ratingcount;
    @JsonProperty("image_url")
    public String imageUrl;
    @JsonProperty("url")
    public String url;
}
