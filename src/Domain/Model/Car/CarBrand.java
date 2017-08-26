package Domain.Model.Car;

import Domain.Common.ValueObject;

final public class CarBrand extends ValueObject
{
    private String name;

    CarBrand(String name)
    {
        this.name = name;
    }

    public String name()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return name();
    }
}
