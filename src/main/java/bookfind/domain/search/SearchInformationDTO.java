package bookfind.domain.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

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
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
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
