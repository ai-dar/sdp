package Assignment4.Template;

/*
 Абстрактный класс, представляющий шаблон для проверки качества.
 Определяет общий процесс проверки продуктов, делегируя специфические проверки подклассам.
 */
public abstract class QualityCheck {

    /*
     Шаблонный метод, определяющий шаги для проверки продукта.
     Этот метод является final, чтобы подклассы не могли изменить его порядок.
     */
    public final void checkProduct() {
        checkAppearance();
        checkSpecifics();
        generateReport();
    }

    /*
     Проверяет внешний вид продукта.
     Этот метод является private, так как его не должны изменять подклассы.
     */
    private void checkAppearance() {
        System.out.println("Checking product appearance...");
    }

    /*
     Абстрактный метод для специфических проверок продукта.
     Подклассы должны реализовать этот метод для добавления своих проверок.
     */
    protected abstract void checkSpecifics();

    /*
     Генерирует отчет после проверки качества.
     Этот метод private, гарантируя, что отчет всегда генерируется после проверок.
     */
    private void generateReport() {
        System.out.println("Final report generated.\n");
    }

}
