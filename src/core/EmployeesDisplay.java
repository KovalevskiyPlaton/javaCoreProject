package core;

public class EmployeesDisplay {
    public static void main(String[] args) {
        Employees male = new Employees("Александр", "директор по маркетингу");
        Employees female = new Employees("Наталья", "заместитель директора по маркетингу");
        String resultPhrase = "Вчера наша компания пополнилась новыми сотрудниками в количестве: " +
                Employees.getEmloyeesNewCount() + " человек(а)" + "." + "\n" + male.getName() + " нанят на должность "
                + male.getRole() + "," + " a " + female.getName() + " нанята в должности: " + female.getRole() + ".";

        System.out.println(resultPhrase);
        Employees.clearCount();
    }

    public static class Employees {
        private String name;
        private String role;
        private static int count;

        public Employees(String name, String role) {
            this.name = name;
            this.role = role;
            count++;
        }

        public String getName() {
            return name;
        }

        public String getRole() {
            return role;
        }

        public static int getEmloyeesNewCount() {
            return count;
        }

        /**
         * Метод неоходимо вызывать каждый раз после объвления новых сотрудников
         */
        public static void clearCount() {
            count = 0;
        }
    }
}
