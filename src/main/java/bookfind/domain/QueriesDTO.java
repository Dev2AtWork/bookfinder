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
        "request",
        "nextPage"
})
@Getter
@Setter
@Builder(toBuilder = true)
public class QueriesDTO {
    @JsonProperty("request")
    public List<RequestDTO> request = null;
    @JsonProperty("nextPage")
    public List<NextPageDTO> nextPage = null;
}
