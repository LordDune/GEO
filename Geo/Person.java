public class Person {
    private String fullName;
    private int age;  // добавлено поле возраст
    private Gender gender;     // переделать все поля 

    enum Gender {
        man, wooman
    }

    public Person(String fullName, int age, String gender) {  // описать конструктор с условием по гендеру
    }
    
    public Person(String fullName) {    // думаю можно оставить, только сослаться на первый конструктор, а возраст по умолчанию 0
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName() {   // дописать метод задать имя

    }

    public int getAge() {   // возвращает возраст
        return this.age;
    }

    public void setAge() {   // задать возраст

    }
    
    public String getGender() {   // задать возраст
        if (this.gender != null){
            return this.gender.toString();
        }
        else return null;
            
    }

    public String toString(){
        return String.format("%s, %d, %s", getFullName(), getAge(), getGender());
    }

}
