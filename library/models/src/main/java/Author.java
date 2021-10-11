//import com.opencsv.bean.CsvBindByName;
import lombok.Data;

public @Data
class Author {

//    @CsvBindByName(column = "AuthorName", required = true)
    private final String name;

//    @CsvBindByName(column = "AuthorSurname", required = true)
    private final String surname;
}
