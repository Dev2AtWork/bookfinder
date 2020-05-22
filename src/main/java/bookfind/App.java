package bookfind;

import static bookfind.processor.BookFindProcessor.findBookByString;

public class App {

    public static void main(String[] args) {
        findBookByString
                .apply(args);
    }
}
