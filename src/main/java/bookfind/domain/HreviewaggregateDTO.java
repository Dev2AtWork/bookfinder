package bookfind.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "count",
        "votes"
})
@Getter
@Setter
@Builder(toBuilder = true)
public class HreviewaggregateDTO {

    @JsonProperty("count")
    public String count;
    @JsonProperty("votes")
    public String votes;

}