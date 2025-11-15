package generic;


interface MealPlan {
    String getMeal();
}

class VegetarianMeal implements MealPlan {
    public String getMeal() { return "Vegetarian Meal"; }
}

class VeganMeal implements MealPlan {
    public String getMeal() { return "Vegan Meal"; }
}

class KetoMeal implements MealPlan {
    public String getMeal() { return "Keto Meal"; }
}

class HighProteinMeal implements MealPlan {
    public String getMeal() { return "High Protein Meal"; }
}

class Meal<T extends MealPlan> {
    private T mealType;

    Meal(T mealType) {
        this.mealType = mealType;
    }

    public T getMealType() {
        return mealType;
    }

    public String toString() {
        return mealType.getMeal();
    }
}

class MealUtil {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T meal) {
        return new Meal<>(meal);
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> veg = MealUtil.generateMealPlan(new VegetarianMeal());
        Meal<VeganMeal> vegan = MealUtil.generateMealPlan(new VeganMeal());
        Meal<KetoMeal> keto = MealUtil.generateMealPlan(new KetoMeal());
        Meal<HighProteinMeal> highP = MealUtil.generateMealPlan(new HighProteinMeal());

        System.out.println(veg);
        System.out.println(vegan);
        System.out.println(keto);
        System.out.println(highP);
    }
}

