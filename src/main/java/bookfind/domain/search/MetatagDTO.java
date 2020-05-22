package bookfind.domain.search;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "og:image",
        "apple-itunes-app",
        "og:type",
        "twitter:card",
        "twitter:title",
        "og:title",
        "csrf-param",
        "request-id",
        "og:description",
        "fb:app_id",
        "twitter:site",
        "twitter:description",
        "csrf-token",
        "books:book",
        "og:url",
        "format-detection",
        "books:isbn",
        "books:author",
        "al:ios:app_name",
        "books:page_count",
        "al:ios:url",
        "al:ios:app_store_id",
        "twitter:image",
        "twitter:image:alt"
})
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetatagDTO {

    @JsonProperty("og:image")
    public String ogImage;
    @JsonProperty("apple-itunes-app")
    public String appleItunesApp;
    @JsonProperty("og:type")
    public String ogType;
    @JsonProperty("twitter:card")
    public String twitterCard;
    @JsonProperty("twitter:title")
    public String twitterTitle;
    @JsonProperty("og:title")
    public String ogTitle;
    @JsonProperty("csrf-param")
    public String csrfParam;
    @JsonProperty("request-id")
    public String requestId;
    @JsonProperty("og:description")
    public String ogDescription;
    @JsonProperty("fb:app_id")
    public String fbAppId;
    @JsonProperty("twitter:site")
    public String twitterSite;
    @JsonProperty("twitter:description")
    public String twitterDescription;
    @JsonProperty("csrf-token")
    public String csrfToken;
    @JsonProperty("books:book")
    public String booksBook;
    @JsonProperty("og:url")
    public String ogUrl;
    @JsonProperty("format-detection")
    public String formatDetection;
    @JsonProperty("books:isbn")
    public String booksIsbn;
    @JsonProperty("books:author")
    public String booksAuthor;
    @JsonProperty("al:ios:app_name")
    public String alIosAppName;
    @JsonProperty("books:page_count")
    public String booksPageCount;
    @JsonProperty("al:ios:url")
    public String alIosUrl;
    @JsonProperty("al:ios:app_store_id")
    public String alIosAppStoreId;
    @JsonProperty("twitter:image")
    public String twitterImage;
    @JsonProperty("twitter:image:alt")
    public String twitterImageAlt;

}
