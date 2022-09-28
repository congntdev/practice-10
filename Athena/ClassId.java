package Class10.Athena;

public enum ClassId {
    JB("Java cơ bản"), JSB("JS cơ bản"), RJ("ReactJS"), JSP("Java Spring"), AD("Androi"), RN("React Native");

    private final String name;


    ClassId(String name) {
        this.name = name;
    }

    public String getName() {
    return name;
    }
}
