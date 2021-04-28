package academy.belhard;

import java.io.IOException;

public class EmptySourceFileException extends IOException{
    public EmptySourceFileException(String message) {
        super(message);
    }
}
