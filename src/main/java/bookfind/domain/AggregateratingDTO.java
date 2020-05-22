package bookfind.domain;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ratingvalue",
        "reviewcount",
        "ratingcount"
})
@Getter
@Setter
@Builder(toBuilder = true)
public class AggregateratingDTO {
    @JsonProperty("ratingvalue")
    public String ratingvalue;
    @JsonProperty("reviewcount")
    public String reviewcount;
    @JsonProperty("ratingcount")
    public String ratingcount;
}
