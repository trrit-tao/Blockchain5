

//write code of the Shelf class here
class Shelf<T extends Book> {
    T typeObject;

    public T getElement() {
        return typeObject;
    }

    public void setElement(T typeObject) {
        this.typeObject = typeObject;
    }
}
