package core;

public class EmployeesDisplay {
    public static void main(String[] args) {
        Employees male = new Employees("Александр", "директор по маркетингу");
        Employees female = new Employees("Наталья", "заместитель директора по маркетингу");
        final String resultString = String.format("Вчера наша компания пополнилась новыми сотрудниками " +
                            "в количестве: %s человек(а).\n%s " + "нанят на должность %s, a %s нанята в должности: %s.",
                    Employees.getEmloyeesNewCount(),
                    male.getName(),
                    male.getRole(),
                    female.getName(),
                    female.getRole());
        System.out.println(resultString);
        Employees.clearCount();
    }

    public static class Employees {
        private String name;
        private String role;
        private static int count;

        public Employees(String name, String role)    {
            this.name = name;
            this.role = role;
            count++;
        }

        public String getName(){
            return name;
        }

        public String getRole(){
            return role;
        }

        public static int getEmloyeesNewCount(){
            return count;
        }

        /**Метод неоходимо вызывать каждый раз после объвления новых сотрудников*/
        public static void clearCount(){
            count = 0;
        }
    }
}
