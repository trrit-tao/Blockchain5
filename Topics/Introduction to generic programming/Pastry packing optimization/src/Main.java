/**
    Box for cakes
*/
class CakeBox extends Box{

    private Cake cake;

    public void put(Cake cake) {
    	this.cake = cake;
    }

    public Cake get() {
        return this.cake;
    }
}

/**
    Box for pies
*/
class PieBox extends Box{

    private Pie pie;

    public void put(Pie pie) {
    	this.pie = pie;
    }

    public Pie get() {
        return this.pie;
    }
}


/**
    Box for tarts
*/
class TartBox extends Box{

    private Tart tart;

    public void put(Tart tart) {
    	this.tart = tart;
    }

    public Tart get() {
        return this.tart;
    }
}

/*
    Hundred more such boring classes OR ...
    magic class for everything everybody is waiting for
*/
class Box<T> {

    private T type;

    public void put(T type) {
        this.type = type;
    }

    public T get() {
        return type;
    }
}

// Don't change classes below
class Cake { }

class Pie { }

class Tart { }