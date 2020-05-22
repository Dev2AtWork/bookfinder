package bookfind.domain.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "title",
        "totalResults",
        "searchTerms",
        "count",
        "startIndex",
        "inputEncoding",
        "outputEncoding",
        "safe",
        "cx"
})
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestDTO {
    @JsonProperty("title")
    public String title;
    @JsonProperty("totalResults")
    public String totalResults;
    @JsonProperty("searchTerms")
    public String searchTerms;
    @JsonProperty("count")
    public Integer count;
    @JsonProperty("startIndex")
    public Integer startIndex;
    @JsonProperty("inputEncoding")
    public String inputEncoding;
    @JsonProperty("outputEncoding")
    public String outputEncoding;
    @JsonProperty("safe")
    public String safe;
    @JsonProperty("cx")
    public String cx;
}
