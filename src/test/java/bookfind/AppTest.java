package bookfind;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "Two years in Calcutta",
            "Perumal Murugan rural",
            "Gail Honeyman",
            "Book based in Matunga 1990s",
            "Israeli historian 21st century",
            "dev patel australia",
            "Iranian Graphic Novel",
            "Dystopian English Novel"
    })
    public void firstDummyTest(String args) {
        App.main(new String[]{args});
    }
}
