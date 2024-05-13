class BorrowingService {
    public String borrowResource(Resource resource, Student student) {
        return student.getName() + ": " + resource.borrow();
    }
}