package Assignment4.Visitor;

/*
 Представляет исполняемый файл в системе.
 Он содержит код и позволяет посетителю выполнять над ним операции.
 */
public class ExecutableFile implements File {
    private String name;
    private String code;

    public ExecutableFile(String name, String code) {
        this.name = name;
        this.code = code;
    }

    /*
     Возвращает имя исполняемого файла.
     @return имя исполняемого файла.
     */
    public String getName() {
        return name;
    }

    /*
     Возвращает код исполняемого файла.
     @return код исполняемого файла.
     */
    public String getCode() {
        return code;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
