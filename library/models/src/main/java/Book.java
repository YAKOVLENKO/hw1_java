//import com.opencsv.bean.CsvBindByName;
//import com.opencsv.bean.CsvCustomBindByName;
//import com.opencsv.bean.CsvRecurse;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.AccessLevel;


@AllArgsConstructor(access = AccessLevel.PUBLIC)
public @Data class Book {
//    @CsvBindByName(column = "BookISBN", required = true)
    private final String isbn;

//    @CsvBindByName(column = "BookName", required = true)
    private final String name;

//    @CsvRecurse
    private final Author author;

//    @CsvBindByName(column = "BookYear", required = true)
    private final int year;


}
