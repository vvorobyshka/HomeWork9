package academy.belhard;

    public class Address {

        public Address(String city, String street, int house) {
            this.city = city;
            this.street = street;
            this.house = house;
        }

        private String city;
        private String street;
        private int house;

        public void setCity(String city) {
            this.city = city;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setHouse(int house) {
            this.house = house;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getHouse() {
            return house;
        }

        @Override
        public String toString() {
            return  city + " "  + street + " " + house ;
        }
    }


