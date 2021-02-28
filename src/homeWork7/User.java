package homeWork7;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isWorker;

    private User(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.isWorker = builder.isWorker;

    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWorker() {
        return isWorker;
    }

    public void setWorker(boolean worker) {
        isWorker = worker;
    }





    public static class Builder{
        private String firstName = "";
        private String lastName = "";
        private int age = 0;
        private boolean isWorker = false;

        public Builder SETfirstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder SETlastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder SETage(int age){
            this.age = age;
            return this;
        }
        public Builder SETisWorker(boolean isWorker){
            this.isWorker = isWorker;
            return this;
        }
        public User build() {
            return new User(this);
        }
    }
}
