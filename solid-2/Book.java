class Book implements Resource {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String borrow() {
        return "Borrowing a book called " + this.title;
    }
}