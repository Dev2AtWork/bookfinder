package data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum QueryEnums {
    TEST_DATA_1("Two years in Calcutta", "Calcutta: Two Years in the City by Amit Chaudhuri"),
    TEST_DATA_2("Perumal Murugan rural", "Amma by Perumal Murugan"),
    TEST_DATA_3("Gail Honeyman", "Eleanor Oliphant Is Completely Fine by Gail Honeyman"),
    TEST_DATA_4("Book based in Matunga 1990s", "Milk Teeth by Amrita Mahale"),
    TEST_DATA_5("Israeli historian 21st century", "21 Lessons for the 21st Century by Yuval Noah Harari"),
    TEST_DATA_6("dev patel australia", "A Long Way Home by Saroo Brierley"),
    TEST_DATA_7("Iranian Graphic Novel", "Persepolis: The Story of a Childhood by Marjane Satrapi"),
    TEST_DATA_9("Dystopian English Novel", "Brave New World by Aldous Huxley"),
    TEST_DATA_10("economics nobel 2019 book", "Good Economics for Hard Times: Better Answers to Our Biggest ..."),
    TEST_DATA_11("brad stone orange book", "The Upstarts: How Uber, Airbnb, and the Killer Companies of the ..."),
    TEST_DATA_12("quidditch", "Quidditch Through the Ages by Kennilworthy Whisp"),
    TEST_DATA_13("andrea pirlo biography", "Penso quindi gioco by Andrea Pirlo");

    private String query;
    private String bookName;
}
