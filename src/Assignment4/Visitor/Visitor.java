package Assignment4.Visitor;

/**
 * Интерфейс Visitor определяет методы для посещения различных типов файлов.
 * Конкретные посетители будут реализовывать специфические операции над этими файлами.
 */
public interface Visitor {
    /*
     Посетить и выполнить операцию над текстовым файлом.
     @param textFile текстовый файл для посещения.
     */
    void visit(TextFile textFile);

    /*
     Посетить и выполнить операцию над исполняемым файлом.
     @param executableFile исполняемый файл для посещения.
     */
    void visit(ExecutableFile executableFile);
}
