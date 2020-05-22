package bookfind.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "kind",
        "url",
        "queries",
        "context",
        "searchInformation",
        "items"
})
@Getter
@Setter
@Builder(toBuilder = true)
public class ResponseDomainDTO {
    @JsonProperty("kind")
    public String kind;
    @JsonProperty("url")
    public UrlDTO url;
    @JsonProperty("queries")
    public QueriesDTO queries;
    @JsonProperty("context")
    public ContextDTO context;
    @JsonProperty("searchInformation")
    public SearchInformationDTO searchInformation;
    @JsonProperty("items")
    public List<ItemDTO> items = null;
}
