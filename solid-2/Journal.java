class Journal implements Resource {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public String borrow() {
        return "Borrowing a journal called " + this.title;
    }
}