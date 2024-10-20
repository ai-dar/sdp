package Assignment4.Visitor;

/*
 Конкретная реализация интерфейса Visitor.
 Этот посетитель генерирует отчет для разных типов файлов.
 */
public class ReportVisitor implements Visitor {

    @Override
    public void visit(TextFile textFile) {
        System.out.println("Генерация отчета для текстового файла: " + textFile.getName());
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Генерация отчета для исполняемого файла: " + executableFile.getName());
    }

}
