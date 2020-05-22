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
        "hcard",
        "cse_thumbnail",
        "review",
        "person",
        "hreviewaggregate",
        "aggregaterating",
        "book",
        "metatags",
        "collection",
        "cse_image",
        "hreview"
})
@Getter
@Setter
@Builder(toBuilder = true)
public class PagemapDTO {
    @JsonProperty("hcard")
    public List<HcardDTO> hcard = null;
    @JsonProperty("cse_thumbnail")
    public List<CseThumbnailDTO> cseThumbnail = null;
    @JsonProperty("review")
    public List<ReviewDTO> review = null;
    @JsonProperty("person")
    public List<PersonDTO> person = null;
    @JsonProperty("hreviewaggregate")
    public List<HreviewaggregateDTO> hreviewaggregate = null;
    @JsonProperty("aggregaterating")
    public List<AggregateratingDTO> aggregaterating = null;
    @JsonProperty("book")
    public List<BookDTO> book = null;
    @JsonProperty("metatags")
    public List<MetatagDTO> metatags = null;
    @JsonProperty("collection")
    public List<CollectionDTO> collection = null;
    @JsonProperty("cse_image")
    public List<CseImageDTO> cseImage = null;
    @JsonProperty("hreview")
    public List<HreviewDTO> hreview = null;

}
