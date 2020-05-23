package bookfind.domain.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true, fluent = true)
public class ConfigurationDTO {
    @JsonProperty
    private String key;
    @JsonProperty
    private String cx;
    @JsonProperty
    private String url;
}
