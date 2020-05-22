package bookfind.utility;

import bookfind.domain.response.AppResponseDTO;
import bookfind.domain.search.ItemDTO;
import bookfind.domain.search.ResponseDomainDTO;

import java.util.function.Function;

public final class BookFilter {
    public static Function<ItemDTO, Boolean> isABook = (itemDTO) ->
            !(itemDTO.getTitle().contains("NOT A BOOK"));
    public static Function<ResponseDomainDTO, AppResponseDTO> filterResponse = (responseDomainDTO -> {
        ItemDTO item = responseDomainDTO.getItems().stream()
                .filter(itemDTO -> itemDTO.getLink()
                        .contains("https://www.goodreads.com/book/show/"))
                .filter(itemDTO -> isABook.apply(itemDTO))
                .findFirst().get();
        return new AppResponseDTO()
                .name(item.getTitle())
                .link(item.getLink());
    });
}
