public class CapitalizeDecorator extends BaseDecor{
    public CapitalizeDecorator(Nameable nameable) {
        super(nameable);
    }
    public String getCorrectName() {
        String name = nameable.getCorrectName();
        return name.toUpperCase();
    }


}