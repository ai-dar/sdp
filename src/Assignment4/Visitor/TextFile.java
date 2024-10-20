package Assignment4.Visitor;

/*Представляет текстовый файл в системе.
 Он содержит контент файла и позволяет посетителю выполнять над ним операции.
 */
public class TextFile implements File {
    private String name;
    private String content;

    public TextFile(String name, String content) {
        this.name = name;
        this.content = content;
    }

    /*
     Возвращает имя текстового файла.
     @return имя текстового файла.
     */
    public String getName() {
        return name;
    }

    /*
     Возвращает содержимое текстового файла.
     @return содержимое текстового файла.
     */
    public String getContent() {
        return content;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
