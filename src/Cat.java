import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Cat extends Animal {


    public void changeModifiers() throws NoSuchFieldException, IllegalAccessException {

        Class animalClass = Animal.class;

        Field name = animalClass.getDeclaredField("name");
        Field age = animalClass.getDeclaredField("age");
        Field weight = animalClass.getDeclaredField("weight");

        name.setAccessible(true);
        age.setAccessible(true);
        weight.setAccessible(true);

        System.out.println("field access modifier before change: " + Modifier.toString(name.getModifiers()));
        System.out.println("field access modifier before change: " + Modifier.toString(age.getModifiers()));
        System.out.println("field access modifier before change: " + Modifier.toString(weight.getModifiers()));


        Field nameModif = Field.class.getDeclaredField("modifiers");
        nameModif.setAccessible(true);
        nameModif.setInt(name, name.getModifiers() & ~Modifier.PROTECTED | Modifier.PRIVATE);

        Field ageModif = Field.class.getDeclaredField("modifiers");
        ageModif.setAccessible(true);
        ageModif.setInt(age, age.getModifiers() & ~Modifier.PRIVATE | Modifier.PUBLIC);

        Field weightModif = Field.class.getDeclaredField("modifiers");
        weightModif.setAccessible(true);
        weightModif.setInt(weight, weight.getModifiers() & ~Modifier.PUBLIC | Modifier.PROTECTED);

        System.out.println();
        System.out.println("field access modifier after change: " + Modifier.toString(name.getModifiers()));
        System.out.println("field access modifier after change: " + Modifier.toString(age.getModifiers()));
        System.out.println("field access modifier after change: " + Modifier.toString(weight.getModifiers()));


    }


}
