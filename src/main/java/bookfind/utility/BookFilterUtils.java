package bookfind.utility;

import bookfind.domain.response.AppResponseDTO;
import bookfind.domain.search.BookDTO;
import bookfind.domain.search.ItemDTO;
import bookfind.domain.search.ResponseDomainDTO;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;

import static java.lang.Boolean.FALSE;
import static java.util.Objects.isNull;

public final class BookFilterUtils {


    public static Function<ItemDTO, Boolean> isABook = (itemDTO) ->
            !Objects.isNull(itemDTO.getPagemap().getPerson())
                    && !itemDTO.getPagemap().getPerson().stream().findFirst()
                    .get().getName().contains("NOT A BOOK");

    public static Function<ItemDTO, Boolean> isHardCoverPaperBackOrKindle = (itemDTO) ->
         isNull(itemDTO.getPagemap().getBook()) ? FALSE :
                itemDTO.getPagemap().getBook().stream().map(BookDTO::getBookformat).anyMatch(bookformat ->
                        Arrays.asList("Paperback", "Hardcover", "Kindle Edition").contains(bookformat));

    public static Function<ResponseDomainDTO, AppResponseDTO> filterResponse = (responseDomainDTO -> {
        ItemDTO item = responseDomainDTO.getItems().stream()
                .filter(itemDTO -> isABook.apply(itemDTO))
                .filter(itemDTO -> isHardCoverPaperBackOrKindle.apply(itemDTO))
                .findFirst().orElse(null);

        return isNull(item) ? null : new AppResponseDTO()
                .name(item.getTitle())
                .link(item.getLink());
    });
}
