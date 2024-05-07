package ex04;

public class Item {
    private String name;
    public static class Builder {
        private String name;
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Item build() {
            if (this.name == null) {
                throw new IllegalStateException();
            }
            Item item = new Item();
            item.name = this.name;
            return item;
        }
    }
    public String getName() {
        return name;
    }
}
