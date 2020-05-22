package bookfind.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "searchTime",
        "formattedSearchTime",
        "totalResults",
        "formattedTotalResults"
})
@Getter
@Setter
@Builder(toBuilder = true)
public class SearchInformationDTO {
    @JsonProperty("searchTime")
    public Float searchTime;
    @JsonProperty("formattedSearchTime")
    public String formattedSearchTime;
    @JsonProperty("totalResults")
    public String totalResults;
    @JsonProperty("formattedTotalResults")
    public String formattedTotalResults;
}
