package bookfind.utility;

import bookfind.domain.search.ItemDTO;
import bookfind.domain.search.ResponseDomainDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.stream.Collectors;

import static bookfind.utility.BookFilterUtils.*;

public class BookFilterUtilsTest implements SearchResultString {
    @Test
    public void validateFilter() throws JsonProcessingException {
        ResponseDomainDTO responseDomainDTO = new ObjectMapper().readValue(SEARCH_STRING, ResponseDomainDTO.class);
        List<ItemDTO> filteredProducts = responseDomainDTO.getItems().stream()
                .filter(item -> bookLink.apply(item))
                .filter(item -> isABook.apply(item))
                .filter(item -> isHardCoverPaperBackOrKindle.apply(item))
                .collect(Collectors.toList());
        Assertions.assertEquals(7, filteredProducts.size(), "Filtered Product Size");
    }
}
