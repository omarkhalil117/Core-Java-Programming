import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {

    String str();

    int val();
}
