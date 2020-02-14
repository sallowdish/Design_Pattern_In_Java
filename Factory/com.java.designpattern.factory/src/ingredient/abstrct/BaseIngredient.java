package ingredient.abstrct;

public abstract class BaseIngredient {
    private String description;

    public BaseIngredient() {
        description = setDescription();
    }

    protected abstract String setDescription();

    public String getDescription() {
        return description;
    }
}
