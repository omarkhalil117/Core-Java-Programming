class Complex<T extends Number> {
    private T real;
    private T imaginary;

    public Complex(T real, T imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public T getReal() {
        return real;
    }

    public T getImaginary() {
        return imaginary;
    }

    public Complex<T> add(Complex<T> other) 
    {

        T newReal = (T) Double.valueOf(this.real.doubleValue() + other.getReal().doubleValue());
        T newImaginary = (T) Double.valueOf(imaginary.doubleValue() + other.getImaginary().doubleValue());

        return new Complex<>(newReal, newImaginary);
    }

    public Complex<T> subtract(Complex<T> other) 
    {

        T newReal = (T) Double.valueOf(this.real.doubleValue() - other.getReal().doubleValue());
        T newImaginary = (T) Double.valueOf(imaginary.doubleValue() - other.getImaginary().doubleValue());

        return new Complex<>(newReal, newImaginary);

    }

    public Complex<T> multiply(Complex<T> other) 
    {

        T newReal = (T) Double.valueOf(this.real.doubleValue() * other.getReal().doubleValue());
        T newImaginary = (T) Double.valueOf(imaginary.doubleValue() * other.getImaginary().doubleValue());

        return new Complex<>(newReal, newImaginary);
    }
}

