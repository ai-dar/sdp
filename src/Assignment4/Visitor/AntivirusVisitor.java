package Assignment4.Visitor;

/*
 Конкретная реализация интерфейса Visitor.
 Этот посетитель выполняет антивирусное сканирование разных типов файлов.
 */
public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Сканирование текстового файла: " + textFile.getName());
        if (textFile.getContent().contains("banned")) {
            System.out.println("Внимание: Текстовый файл содержит запрещенные слова!");
        } else {
            System.out.println("Текстовый файл чист.");
        }
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Сканирование исполняемого файла: " + executableFile.getName());
        if (executableFile.getCode().contains("malware")) {
            System.out.println("Внимание: Исполняемый файл содержит вредоносный код!");
        } else {
            System.out.println("Исполняемый файл чист.");
        }
    }
}
