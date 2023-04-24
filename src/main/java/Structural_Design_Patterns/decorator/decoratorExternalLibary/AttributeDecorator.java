package Structural_Design_Patterns.decorator.decoratorExternalLibary;

import org.jsoup.nodes.Attribute;

public class AttributeDecorator extends Attribute {

    private final Attribute attribute;

    public AttributeDecorator(Attribute attribute) {
        super(attribute.getKey(), attribute.getValue());
        this.attribute = attribute;
    }


    @Override
    public String getKey() {
        String key = super.getKey();
        System.out.println("Key obtained: " + key);
        return key;
    }
}
