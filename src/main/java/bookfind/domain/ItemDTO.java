package bookfind.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "kind",
        "title",
        "htmlTitle",
        "link",
        "displayLink",
        "snippet",
        "htmlSnippet",
        "cacheId",
        "formattedUrl",
        "htmlFormattedUrl",
        "pagemap"
})
@Getter
@Setter
@Builder(toBuilder = true)
public class ItemDTO {

    @JsonProperty("kind")
    public String kind;
    @JsonProperty("title")
    public String title;
    @JsonProperty("htmlTitle")
    public String htmlTitle;
    @JsonProperty("link")
    public String link;
    @JsonProperty("displayLink")
    public String displayLink;
    @JsonProperty("snippet")
    public String snippet;
    @JsonProperty("htmlSnippet")
    public String htmlSnippet;
    @JsonProperty("cacheId")
    public String cacheId;
    @JsonProperty("formattedUrl")
    public String formattedUrl;
    @JsonProperty("htmlFormattedUrl")
    public String htmlFormattedUrl;
    @JsonProperty("pagemap")
    public PagemapDTO pagemap;

}
