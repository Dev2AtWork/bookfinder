package bookfind.domain.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

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
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewDTO {
    @JsonProperty("ratingstars")
    public String ratingstars;
    @JsonProperty("ratingcount")
    public String ratingcount;
    @JsonProperty("image_url")
    public String imageUrl;
    @JsonProperty("url")
    public String url;
    @JsonProperty("reviewdate")
    public String reviewdate;
    @JsonProperty("reviewer")
    public String reviewer;
    @JsonProperty("author")
    public String author;
    @JsonProperty("reviewbody")
    public String reviewbody;
    @JsonProperty("datepublished")
    public String datepublished;
}
