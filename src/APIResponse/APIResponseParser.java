package APIResponse;

public class APIResponseParser {

    /**
     * Parses the input text and returns a Book instance containing
     * the parsed data.
     *
     * @param response text to be parsed
     * @return Book instance containing parsed data
     */


    public static Book parse(String response) {
        Book book = new Book();

        String startRule = "<title>";
        String endRule = "<";
        String title = parse(response, startRule, endRule);
        book.setTitle(title);

        String startRule2 = "<name>";
        String endRule2 = "<";
        String author = parse(response, startRule2, endRule2);
        book.setAuthor(author);


        return book;
    }

    private static String parse(String response, String startRule, String endRule) {
        System.out.println();
        int start = response.indexOf(startRule) + startRule.length();
        System.out.println("start = " + start);

        int end = response.indexOf(endRule, start);
        System.out.println("end = " + end);

        String bookData = response.substring(start, end);
        System.out.println("info = " + bookData);

        return bookData;
    }

    public static void main(String[] args) {
        String response = "<work>" +
                "<id type=\"integer\">2361393</id>" +
                "<books_count type=\"integer\">813</books_count>" +
                "<ratings_count type=\"integer\">1,16,315</ratings_count>" +
                "<text_reviews_count type=\"integer\">3439</text_reviews_count>" +
                "<original_publication_year type=\"integer\">1854</original_publication_year>" +
                "<original_publication_month type=\"integer\" nil=\"true\"/>" +
                "<original_publication_day type=\"integer\" nil=\"true\"/>" +
                "<average_rating>3.79</average_rating>" +
                "<best_book type=\"Book\">" +
                "<id type=\"integer\">16902</id>" +
                "<title>Walden</title>" +
                "<author>" +
                "<id type=\"integer\">10264</id>" +
                "<name>Henry David Thoreau</name>" +
                "</author>" +
                "<image_url>" +
                "http://images.gr-assets.com/books/1465675526m/16902.jpg" +
                "</image_url>" +
                "<small_image_url>" +
                "http://images.gr-assets.com/books/1465675526s/16902.jpg" +
                "</small_image_url>" +
                "</best_book>" +
                "</work>";

        APIResponseParser.parse(response);

    }
}
