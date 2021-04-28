package academy.belhard;

    public class Person {

        private String firstName;
        private String lastName;
        private Address address;

        public Person(String firstName, String lastName, Address address) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            if (firstName == null || lastName == null || address == null) {
                throw new NullFieldException("Пустая строка");
            }
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public void setAddress(Address address) {
            this.address = address;
        }

        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public Address getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return  firstName + " " + lastName + " " + address + "\n";
        }

        public static Person toObject(String info){
            String[] a = info.split(" ");
            return new Person(a[0], a[1], new Address(a[2], a[3], Integer.parseInt(a[4])));
        }
    }



